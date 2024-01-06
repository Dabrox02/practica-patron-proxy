package com.local;

public class RealImage implements Image {

    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        load(filename);
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        System.out.println("Mostrando imagen: " + filename);
    }

    private void load(String filename) {
        System.out.println("Cargando imagen: " + filename);
    }

    @Override
    public String toString() {
        return "{" +
                " filename='" + getFilename() + "'" +
                "}";
    }

}
