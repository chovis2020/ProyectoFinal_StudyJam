package com.gdgandroidbolivia.tourslapazmaravillosa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Yolanda on 31/10/2017.
 */

public class DetalleMuseos extends AppCompatActivity{

    ImageView imagenDetalleM;
    TextView nombreM, descripcionM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_museo);

        //getSupportActionBar().setTitle("Descripción");

        imagenDetalleM = (ImageView) findViewById(R.id.imagenDetalle_museos);
        nombreM = (TextView) findViewById(R.id.textoDetalle_museos);
        descripcionM = (TextView) findViewById(R.id.descripcionDetalle_museos);

        Bundle bundle = getIntent().getExtras();
        Museos museos = (Museos) bundle.getSerializable("museos");

        imagenDetalleM.setImageResource(museos.getImagenMuseos());
        nombreM.setText(museos.getNombreMuseos());
        descripcionM.setText(museos.getDescripcionMuseos());
    }

}
