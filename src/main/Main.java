package main;

import java.util.ArrayList;
import entrenador.Entrenador;
import pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();

        Entrenador entrenador = new Entrenador("Paco", new ArrayList<Pokemon>(), new ArrayList<Pokemon>());

        Entrenador entrenador2 = new Entrenador(4);

    }
}