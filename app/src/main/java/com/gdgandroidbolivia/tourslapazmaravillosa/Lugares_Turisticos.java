package com.gdgandroidbolivia.tourslapazmaravillosa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yolanda on 22/10/2017.
 */

public class Lugares_Turisticos extends AppCompatActivity implements LugarAdapter.onLugarSelectedListener{

    RecyclerView lugaresRecyclerView;
    LugarAdapter lugarAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lugares_turisticos);


        lugaresRecyclerView = (RecyclerView) findViewById(R.id.recycler_lugares);
        lugaresRecyclerView.setHasFixedSize(true);
        lugaresRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        lugarAdapter = new LugarAdapter(this,this);

        llenarDatos();

        lugaresRecyclerView.setAdapter(lugarAdapter);
    }

    private void llenarDatos() {
        List<Lugares> lista = new ArrayList<>();
        lista.add(new Lugares(R.drawable.titicaca, "Lago Titicaca", getString(R.string.descripcion_LagoTitikaka)));
        lista.add(new Lugares(R.drawable.chulumanii,"Chulumani",getString(R.string.descripcion_Coroico_Yungas)));
        lista.add(new Lugares(R.drawable.calamarcaa,"Calamarca",getString(R.string.descripcion_Calamarca)));
        lista.add(new Lugares(R.drawable.huaynapotosi,"Huayna Potosi",getString(R.string.descripcion_CordilleraReal)));
        lista.add(new Lugares(R.drawable.hampaturi,"Hampaturi Pampalarma",getString(R.string.descripcion_Hampaturi_Pampalarma)));
        lista.add(new Lugares(R.drawable.lapaz5,"La Paz",getString(R.string.descripcion_CiudadaDeLaPaz)));
        lugarAdapter.setDataset(lista);
    }

    public void onLugarSelected(Lugares lugares) {
        Intent intent = new Intent(getApplicationContext(), DetalleLugares.class);
        intent.putExtra("lugares", lugares);
        startActivity(intent);
    }

}
