package com.gdgandroidbolivia.tourslapazmaravillosa;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yolanda on 8/11/2017.
 */

public class ComidaAdapter extends RecyclerView.Adapter<ComidaAdapter.ComidaViewholder> {

    List<Comida> datasetC;
    Context contextC;
    ComidaAdapter.onComidaSelectedListener onComidaSelectedListener;

    public interface onComidaSelectedListener{
        void onComidaSelected(Comida comida);
    }

    public ComidaAdapter(Context contextm, ComidaAdapter.onComidaSelectedListener onComidaSelectedListener) {
        this.contextC = contextm;
        this.datasetC = new ArrayList<>();
        this.onComidaSelectedListener = onComidaSelectedListener;
    }

    @Override
    public ComidaAdapter.ComidaViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comida,parent,false);
        return new ComidaAdapter.ComidaViewholder(view);
    }

    @Override
    public void onBindViewHolder(ComidaAdapter.ComidaViewholder holder, int position) {
        Comida comida = datasetC.get(position);
        holder.nombreC.setText(comida.getNombreComida());
        holder.imagenC.setImageResource(comida.getImagenComida());

        holder.setOnComidaSelectedListener(comida, onComidaSelectedListener);
    }

    @Override
    public int getItemCount() {
        return datasetC.size();
    }

    public class ComidaViewholder extends RecyclerView.ViewHolder {

        View cardViewC;
        ImageView imagenC;
        TextView nombreC;

        public ComidaViewholder(View itemView) {
            super(itemView);
            cardViewC = itemView.findViewById(R.id.card_comida);
            imagenC = itemView.findViewById(R.id.imagen_item_comida);
            nombreC = itemView.findViewById(R.id.texto_item_comida);
        }

        public void setOnComidaSelectedListener(final Comida comida, final ComidaAdapter.onComidaSelectedListener onComidaSelectedListener) {
            cardViewC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onComidaSelectedListener.onComidaSelected(comida);
                }
            });
        }
    }

    public void setDataset(List<Comida> comida) {
        if (comida == null){
            datasetC = new ArrayList<>();
        }
        else{
            datasetC = comida;
        }
        notifyDataSetChanged();
    }
}
