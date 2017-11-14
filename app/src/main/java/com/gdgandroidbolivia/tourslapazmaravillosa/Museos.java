package com.gdgandroidbolivia.tourslapazmaravillosa;

import android.support.v7.app.AppCompatActivity;

import java.io.Serializable;

/**
 * Created by Yolanda on 31/10/2017.
 */

public class Museos  implements Serializable {

    private int imagenMuseos;
    private String nombreMuseos, descripcionMuseos;

    public Museos(int imagenM, String nombreM, String descripcionM) {
            this.imagenMuseos = imagenM;
            this.nombreMuseos = nombreM;
            this.descripcionMuseos = descripcionM;
    }

    public int getImagenMuseos() {
        return imagenMuseos;
    }

    public void setImagenMuseos(int imagenM) {
        this.imagenMuseos = imagenM;
    }

    public String getNombreMuseos() {return nombreMuseos;}

    public void setNombreMuseos(String nombreM) {
        this.nombreMuseos = nombreM;
    }

    public String getDescripcionMuseos() {
        return descripcionMuseos;
    }

    public void setDescripcionMuseos(String descripcionM) {
        this.descripcionMuseos = descripcionM;
    }


}
