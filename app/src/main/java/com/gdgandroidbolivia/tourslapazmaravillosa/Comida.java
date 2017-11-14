package com.gdgandroidbolivia.tourslapazmaravillosa;

import java.io.Serializable;

/**
 * Created by Yolanda on 8/11/2017.
 */

public class Comida implements Serializable {

    private int imagenComida;
    private String nombreComida, descripcionComida;

    public Comida(int imagenC, String nombreC, String descripcionC) {
        this.imagenComida = imagenC;
        this.nombreComida = nombreC;
        this.descripcionComida = descripcionC;
    }

    public int getImagenComida() {
        return imagenComida;
    }

    public void setImagenComida(int imagenC) {
        this.imagenComida = imagenC;
    }

    public String getNombreComida() {
        return nombreComida;
    }

    public void setNombreComida(String nombreC) {
        this.nombreComida = nombreC;
    }

    public String getDescripcionComida() {
        return descripcionComida;
    }

    public void setDescripcionComida(String descripcionC) {
        this.descripcionComida = descripcionC;
    }

}
