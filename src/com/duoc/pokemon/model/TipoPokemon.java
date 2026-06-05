package com.duoc.pokemon.model;

public class TipoPokemon {

    private String nombre;
    private String ventaja;
    private String debilidad;

    public TipoPokemon(String nombre, String ventaja, String debilidad) {
        this.nombre = nombre;
        this.ventaja = ventaja;
        this.debilidad = debilidad;
    }

    @Override
    public String toString() {
        return "TipoPokemon{" +
                "nombre='" + nombre + '\'' +
                ", ventaja='" + ventaja + '\'' +
                ", debilidad='" + debilidad + '\'' +
                '}';
    }
}
