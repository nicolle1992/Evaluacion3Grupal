package com.example.evaluacion3grupal;

public class ModeloMain {

    private String titulo;
    private int imageID;                             //imagen es un valor tipo numero

    //Constructor
    public ModeloMain(String titulo, int imageID) {
        this.titulo = titulo;
        this.imageID = imageID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}