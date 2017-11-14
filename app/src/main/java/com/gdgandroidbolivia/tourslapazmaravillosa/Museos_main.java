package com.gdgandroidbolivia.tourslapazmaravillosa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yolanda on 31/10/2017.
 */

public class Museos_main extends AppCompatActivity implements MuseosAdapter.onMuseosSelectedListener{

    RecyclerView museosRecyclerView;
    MuseosAdapter museosAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.museos);


        museosRecyclerView = (RecyclerView) findViewById(R.id.recycler_museos);
        museosRecyclerView.setHasFixedSize(true);
        museosRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        museosAdapter = new MuseosAdapter(this, this);

        llenarDatos();

        museosRecyclerView.setAdapter(museosAdapter);
    }

    private void llenarDatos() {
        List<Museos> lista = new ArrayList<>();
        lista.add(new Museos(R.drawable.museodearqueologia, "Museo de Arqueologia", getString(R.string.descripcion_Museo_NacionalArqueologiaTiwanacu)));
        lista.add(new Museos(R.drawable.museonacionaldeartes,"Museo Tambo Quirquincho",getString(R.string.descripcion_Museo_TamboQuirquincho)));
        lista.add(new Museos(R.drawable.museoinstrumentos,"Museo de Instrumentos Musicales",getString(R.string.descripcion_Museo_DeInstrumentosMusicales)));
        lista.add(new Museos(R.drawable.museolitoral,"Museo del Litoral Boliviano",getString(R.string.descripcion_Museo_DelLitoralBoliviano)));
        lista.add(new Museos(R.drawable.museomurillo,"Museo de la Casa de Murillo",getString(R.string.descripcion_Museo_CasaDeMurillo)));
        lista.add(new Museos(R.drawable.museometales,"Museo de Metales Preciosos",getString(R.string.descripcion_Museo_MetalesPreciosos)));
        museosAdapter.setDataset(lista);
    }

    public void onMuseosSelected(Museos museos) {
        Intent intent = new Intent(getApplicationContext(), DetalleMuseos.class);
        intent.putExtra("museos", museos);
        startActivity(intent);
    }


}
