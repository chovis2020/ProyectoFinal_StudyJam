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
 * Created by Yolanda on 22/10/2017.
 */

public class LugarAdapter extends RecyclerView.Adapter<LugarAdapter.LugarViewholder> {

    List<Lugares> dataset;
    Context context;
    onLugarSelectedListener onLugarSelectedListener;

    public interface onLugarSelectedListener{
        void onLugarSelected(Lugares lugares);
    }

    public LugarAdapter(Context context, onLugarSelectedListener onLugarSelectedListener) {
        this.context = context;
        this.dataset = new ArrayList<>();
        this.onLugarSelectedListener = onLugarSelectedListener;
    }

    @Override
    public LugarViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lugares,parent,false);
        return new LugarViewholder(view);
    }

    @Override
    public void onBindViewHolder(LugarViewholder holder, int position) {
        Lugares lugares = dataset.get(position);
        holder.nombre.setText(lugares.getNombre());
        holder.imagen.setImageResource(lugares.getImagen());

        holder.setOnLugarSelectedListener(lugares, onLugarSelectedListener);
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public class LugarViewholder extends RecyclerView.ViewHolder {

        View cardView;
        ImageView imagen;
        TextView nombre;

        public LugarViewholder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card_lugares);
            imagen = itemView.findViewById(R.id.imagen_item_lugares);
            nombre = itemView.findViewById(R.id.texto_item_lugares);
        }

        public void setOnLugarSelectedListener(final Lugares lugares, final onLugarSelectedListener onLugarSelectedListener) {
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onLugarSelectedListener.onLugarSelected(lugares);
                }
            });
        }
    }

    public void setDataset(List<Lugares> lugares) {
        if (lugares == null){
            dataset = new ArrayList<>();
        }
        else{
            dataset = lugares;
        }
        notifyDataSetChanged();
    }

}
