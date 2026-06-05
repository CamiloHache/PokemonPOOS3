package com.duoc.pokemon.model;

import com.duoc.pokemon.exception.AtaqueInvalidoException;
import com.duoc.pokemon.exception.EvolucionInvalidaException;

import java.util.ArrayList;

public class Pokemon {

    private String nombre;
    private int nivel;
    private TipoPokemon tipo;
    private Estadistica estadisticas;
    private List<Ataque> ataques;
    private List<Evolucion> evoluciones;

    public Pokemon(String nombre, int nivel, TipoPokemon tipo, Estadistica estadisticas) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.tipo = tipo;
        this.estadisticas = estadisticas;
        this.ataques = new ArrayList<>();
        this.evoluciones = new ArrayList<>();

        this.ataques.add("Placaje", 40, "Ataque básico de contacto");
    }

    public void agregarAtaque(Ataque ataque) throws AtaqueInvalidoException {
        if(ataque == null){
            throw new AtaqueInvalidoException("El ataque no puede ser nulo");
        }

        if (ataque.size() >= 4) {
            throw new AtaqueInvalidoException("El pokemon ya tiene 4 ataques");
        }

        ataques.add(ataque);
    }

    public void agregarEvolucion(Evolucion evolucion) throws EvolucionInvalidaException
}
