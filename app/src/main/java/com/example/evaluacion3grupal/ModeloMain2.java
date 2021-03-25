package com.example.evaluacion3grupal;

public class ModeloMain2 {

    private int imagenPersona;
    private String nombrePersona;
    private int imagenflecha;

    //Constructor

    public ModeloMain2(int imagenPersona, String titulo, int imagenflecha) {
        this.imagenPersona = imagenPersona;
        this.nombrePersona = titulo;
        this.imagenflecha = imagenflecha;
    }

    public int getImagenPersona() {
        return imagenPersona;
    }

    public void setImagenPersona(int imagenPersona) {
        this.imagenPersona = imagenPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getImagenflecha() {
        return imagenflecha;
    }

    public void setImagenflecha(int imagenflecha) {
        this.imagenflecha = imagenflecha;
    }

}