package com.gdgandroidbolivia.tourslapazmaravillosa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Yolanda on 21/10/2017.
 */

public class Bienvenidos extends AppCompatActivity {

    private Button lugaresTuristico;
    private Button museos;
    private Button comida;
    private Button video;
    private Button mapa;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bienvenidos);

        lugaresTuristico=(Button) findViewById(R.id.btn_lugaresTuristicos);
        lugaresTuristico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bienvenidos.this,Lugares_Turisticos.class);
                startActivity(intent);
            }
        });

        museos=(Button) findViewById(R.id.btn_museos);
        museos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bienvenidos.this,Museos_main.class);
                startActivity(intent);
            }
        });

        comida=(Button) findViewById(R.id.btn_comida);
        comida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bienvenidos.this,Comida_main.class);
                startActivity(intent);
            }
        });

        video=(Button) findViewById(R.id.btn_musica);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bienvenidos.this,Video.class);
                startActivity(intent);
            }
        });

        mapa=(Button) findViewById(R.id.btn_mapa);
        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bienvenidos.this,MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}
