package com.gdgandroidbolivia.tourslapazmaravillosa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Yolanda on 8/11/2017.
 */

public class DetalleComida extends AppCompatActivity {

    ImageView imagenDetalleC;
    TextView nombreC, descripcionC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_comida);

        //getSupportActionBar().setTitle("Descripción");

        imagenDetalleC = (ImageView) findViewById(R.id.imagenDetalle_comida);
        nombreC = (TextView) findViewById(R.id.textoDetalle_comida);
        descripcionC = (TextView) findViewById(R.id.descripcionDetalle_comida);

        Bundle bundle = getIntent().getExtras();
        Comida comida = (Comida) bundle.getSerializable("comida");

        imagenDetalleC.setImageResource(comida.getImagenComida());
        nombreC.setText(comida.getNombreComida());
        descripcionC.setText(comida.getDescripcionComida());
    }

}
