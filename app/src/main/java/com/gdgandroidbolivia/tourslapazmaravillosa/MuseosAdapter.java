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
 * Created by Yolanda on 31/10/2017.
 */

public class MuseosAdapter  extends RecyclerView.Adapter<MuseosAdapter.MuseosViewholder> {

    List<Museos> datasetM;
    Context contextM;
    MuseosAdapter.onMuseosSelectedListener onMuseosSelectedListener;

    public interface onMuseosSelectedListener{
        void onMuseosSelected(Museos museos);
    }

    public MuseosAdapter(Context contextm, MuseosAdapter.onMuseosSelectedListener onMuseosSelectedListener) {
        this.contextM = contextm;
        this.datasetM = new ArrayList<>();
        this.onMuseosSelectedListener = onMuseosSelectedListener;
    }

    @Override
    public MuseosAdapter.MuseosViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_museos,parent,false);
        return new MuseosAdapter.MuseosViewholder(view);
    }

    @Override
    public void onBindViewHolder(MuseosAdapter.MuseosViewholder holder, int position) {
        Museos museos = datasetM.get(position);
        holder.nombreM.setText(museos.getNombreMuseos());
        holder.imagenM.setImageResource(museos.getImagenMuseos());

        holder.setOnMuseosSelectedListener(museos, onMuseosSelectedListener);
    }

    @Override
    public int getItemCount() {
        return datasetM.size();
    }

    public class MuseosViewholder extends RecyclerView.ViewHolder {

        View cardViewM;
        ImageView imagenM;
        TextView nombreM;

        public MuseosViewholder(View itemView) {
            super(itemView);
            cardViewM = itemView.findViewById(R.id.card_museos);
            imagenM = itemView.findViewById(R.id.imagen_item_museos);
            nombreM = itemView.findViewById(R.id.texto_item_museos);
        }

        public void setOnMuseosSelectedListener(final Museos museos, final MuseosAdapter.onMuseosSelectedListener onMuseosSelectedListener) {
            cardViewM.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onMuseosSelectedListener.onMuseosSelected(museos);
                }
            });
        }
    }

    public void setDataset(List<Museos> museos) {
        if (museos == null){
            datasetM = new ArrayList<>();
        }
        else{
            datasetM = museos;
        }
        notifyDataSetChanged();
    }

}
