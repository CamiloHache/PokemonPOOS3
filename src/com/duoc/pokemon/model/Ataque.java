package com.duoc.pokemon.model;

public class Ataque {

    private String nombre;
    private int poder;
    private String descripcion;

    public Ataque(String nombre, int poder, String descripcion) {
        this.nombre = nombre;
        this.poder = poder;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Ataque{" +
                "nombre='" + nombre + '\'' +
                ", poder=" + poder +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
