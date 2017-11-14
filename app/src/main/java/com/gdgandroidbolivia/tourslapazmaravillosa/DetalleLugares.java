package com.gdgandroidbolivia.tourslapazmaravillosa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Yolanda on 22/10/2017.
 */

public class DetalleLugares extends AppCompatActivity {

    ImageView imagenDetalle;
    TextView nombre, descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_lugares);

        //getSupportActionBar().setTitle("Descripción");

        imagenDetalle = (ImageView) findViewById(R.id.imagenDetalle_lugares);
        nombre = (TextView) findViewById(R.id.textoDetalle_lugares);
        descripcion = (TextView) findViewById(R.id.descripcionDetalle_lugares);

        Bundle bundle = getIntent().getExtras();
        Lugares lugares = (Lugares) bundle.getSerializable("lugares");

        imagenDetalle.setImageResource(lugares.getImagen());
        nombre.setText(lugares.getNombre());
        descripcion.setText(lugares.getDescripcion());
    }

}
