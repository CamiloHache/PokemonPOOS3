package com.duoc.pokemon.model;

public class Evolucion {

    private String nombre;
    private int nivelRequerido;

    public Evolucion(String nombre, int nivelRequerido) {
        this.nombre = nombre;
        this.nivelRequerido = nivelRequerido;
    }

    @Override
    public String toString() {
        return "Evolucion{" +
                "nombre='" + nombre + '\'' +
                ", nivelRequerido=" + nivelRequerido +
                '}';
    }
}
