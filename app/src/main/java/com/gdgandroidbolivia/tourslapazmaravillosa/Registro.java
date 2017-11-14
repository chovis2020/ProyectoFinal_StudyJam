package com.gdgandroidbolivia.tourslapazmaravillosa;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.OutputStreamWriter;

/**
 * Created by Yolanda on 22/10/2017.
 */

public class Registro extends AppCompatActivity {

    private Button guardar;
    private Button cancelar;

    private EditText nombre;
    private EditText correoE;
    private EditText contrasenia1;
    private EditText contrasenia2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);
        guardar=(Button) findViewById(R.id.btn_Guardar);
        cancelar=(Button) findViewById(R.id.btn_Cancelar);

        nombre=(EditText) findViewById(R.id.et_nombre);
        correoE=(EditText) findViewById(R.id.et_correo);
        contrasenia1=(EditText) findViewById(R.id.et_contresenia);
        contrasenia2=(EditText) findViewById(R.id.et_contresenia1);

        cancelar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finish();
                System.runFinalization();
                System.exit(0);
            }
        });
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!nombre.getText().toString().equals("")||!correoE.getText().toString().equals("")||!contrasenia1.getText().toString().equals("")||!contrasenia2.getText().toString().equals("")){
                    try{
                        OutputStreamWriter dato=new OutputStreamWriter(openFileOutput("base.txt", Context.MODE_PRIVATE));
                        dato.write(nombre.getText().toString());//seguarda
                        dato.write(correoE.getText().toString());
                        dato.write(contrasenia1.getText().toString());
                        dato.write(contrasenia2.getText().toString());
                        dato.close();//se cierra
                       // Toast.makeText(this,"Guardado en: "+getFilesDir(),Toast.LENGTH_SHORT).show();
                    }catch (Exception e){
                        System.out.println("Error: "+e.getLocalizedMessage());
                    }
                }
                else{
                   // Toast.makeText(this,"El texto esta vacio",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

}
