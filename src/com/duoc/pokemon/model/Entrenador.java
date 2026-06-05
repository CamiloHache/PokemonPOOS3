package com.duoc.pokemon.model;

import java.util.ArrayList;
import java.util.List;

public class Entrenador {

    private String nombre;
    private List<Pokemon> pokemones;

    public Entrenador(String nombre, List<Pokemon> pokemones) {
        this.nombre = nombre;
        this.pokemones = new ArrayList<>();
    }

    public void agregarPokemon(Pokemon pokemon){
        pokemones.add(pokemon);
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "nombre='" + nombre + '\'' +
                ", pokemones=" + pokemones +
                '}';
    }
}
