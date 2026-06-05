package com.duoc.pokemon.model;

public class Estadistica {

    private int vida;
    private int ataque;
    private int defensa;
    private int velocidad;

    public Estadistica(int vida, int ataque, int defensa, int velocidad) {
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Estadistica{" +
                "vida=" + vida +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", velocidad=" + velocidad +
                '}';
    }
}
