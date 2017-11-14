package com.gdgandroidbolivia.tourslapazmaravillosa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Button boton;
    private ImageButton laPaz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton=(Button)findViewById(R.id.btn_empezar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Iniciar_Sesion.class);
                startActivity(intent);
            }
        });


        laPaz=(ImageButton) findViewById(R.id.la_paz);
        laPaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,La_Paz.class);
                startActivity(intent);
            }
        });
    }

}
