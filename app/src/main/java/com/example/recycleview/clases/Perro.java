package com.example.recycleview.clases;

public class Perro {
    private String nombre;
    private int edad;
    private String imagen;

    public Perro(String nombre, int edad, String imagen) {
        this.nombre = nombre;
        this.edad = edad;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
