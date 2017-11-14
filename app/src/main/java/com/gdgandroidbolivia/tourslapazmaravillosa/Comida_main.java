package com.gdgandroidbolivia.tourslapazmaravillosa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yolanda on 8/11/2017.
 */

public class Comida_main extends AppCompatActivity implements ComidaAdapter.onComidaSelectedListener{

    RecyclerView comidaRecyclerView;
    ComidaAdapter comidaAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comida);


        comidaRecyclerView = (RecyclerView) findViewById(R.id.recycler_comida);
        comidaRecyclerView.setHasFixedSize(true);
        comidaRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        comidaAdapter = new ComidaAdapter(this,this);

        llenarDatos();

        comidaRecyclerView.setAdapter(comidaAdapter);
    }

    private void llenarDatos() {
        List<Comida> lista = new ArrayList<>();
        lista.add(new Comida(R.drawable.plato_pacenio, "Plato Pacenio", getString(R.string.descripcion_platoPacenio)));
        lista.add(new Comida(R.drawable.chairo,"Chairo",getString(R.string.descripcion_chairo)));
        lista.add(new Comida(R.drawable.sopita,"Sopa de Mani",getString(R.string.descripcion_sopaMani)));
        lista.add(new Comida(R.drawable.ispi,"Ispi",getString(R.string.descripcion_ispi)));
        lista.add(new Comida(R.drawable.fricase,"Fricase",getString(R.string.descripcion_fricase)));
        lista.add(new Comida(R.drawable.trucha,"Trucha",getString(R.string.descripcion_trucha)));
        lista.add(new Comida(R.drawable.wallake,"Wallacke",getString(R.string.descripcion_wallacke)));
        lista.add(new Comida(R.drawable.queso,"Queso Humacha",getString(R.string.descripcion_quesoHumacha)));
        comidaAdapter.setDataset(lista);
    }

    public void onComidaSelected(Comida comida) {
        Intent intent = new Intent(getApplicationContext(), DetalleComida.class);
        intent.putExtra("comida", comida);
        startActivity(intent);
    }

}
