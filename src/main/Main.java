package main;

import pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {

        Pokemon p = new Pokemon(null, null, 0, 0, 0, 0, 0, 0, 0, 0, null, null);
        System.out.println(p.getNombre());
    }
}