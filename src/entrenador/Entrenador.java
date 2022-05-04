package entrenador;

import pokemon.Pokemon;
import java.util.ArrayList;
import java.util.Random;

public class Entrenador implements IEntrenable {
    private String nombre;
    private ArrayList<Pokemon> equipo;
    private ArrayList<Pokemon> pokedex;
    private int pokedollar;
    private Pokeball objeto;
    private int numPokemon;

    Entrenador(String nombre, ArrayList<Pokemon> equipo, ArrayList<Pokemon> pokedex,Pokeball objeto, int numPokemon) {
        Random rnd = new Random();
        this.nombre = nombre;
        this.pokedollar = rnd.nextInt(800 - 1000);
        this.equipo = equipo;
        this.pokedex = pokedex;
        this.numPokemon = numPokemon;
        this.objeto = objeto;
        

    }

    public ArrayList<Pokemon> getEquipo() {
        return equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumPokemon() {
        return numPokemon;
    }


    public int getPokedollar() {
        return pokedollar;
    }

    public ArrayList<Pokemon> pokedex() {
        return pokedex;
    }

    public Pokeball getObjeto() {
        return objeto;
    }

    public void setObjeto(Pokeball objeto) {
        this.objeto = objeto;
    }

    public void setEquipo(ArrayList<Pokemon> equipo) {
        this.equipo = equipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumPokemon(int numPokemon) {
        this.numPokemon = numPokemon;
    }


    public void setPokedollar(int pokedollar) {
        this.pokedollar = pokedollar;
    }

    public void setcajaPokemon(ArrayList<Pokemon> pokedex) {
        this.pokedex = pokedex;
    }

    @Override
    public String toString() {
        return "El entrenador " + nombre + " tiene " + pokedollar + "pokedollares";
    }

    @Override
    public void entrenamientoPesado(Pokemon pokemon) {
        int comprobador = pokedollar - (20 * pokemon.nivel);
        if (comprobador >= 0) {
            pokedollar = pokedollar - comprobador;
            if (pokemon.defensa + 5 >= 100)
                pokemon.defensa = 100;
            else
                pokemon.defensa += 5;

            if (pokemon.defensaEspecial + 5 >= 100)
                defensaEspecial = 100;
            else
                pokemon.defensaEspecial += 5;

            if (pokemon.vitalidad + 5 >= 100)
                vitalidad = 100;
            else
                pokemon.vitalidad += 5;

        } else {
            System.out.println("No tienes suficientes pokedollares");
        }

    }

    @Override
    public void entrenamientoFurioso(Pokemon pokemon) {
        int comprobador = pokedollar - (30 * pokemon.nivel);
        if (comprobador >= 0) {
            pokedollar = pokedollar - comprobador;
            if (pokemon.ataque + 5 >= 100)
                pokemon.ataque = 100;
            else
                pokemon.ataque += 5;

            if (pokemon.ataqueEspecial + 5 >= 100)
                pokemon.ataqueEspecial = 100;
            else
                pokemon.ataqueEspecial += 5;

            if (pokemon.velocidad + 5 >= 100)
                pokemon.velocidad = 100;
            else
                pokemon.velocidad += 5;

        } else {
            System.out.println("No tienes suficientes pokedollares");
        }

    }

    @Override
    public void entrenamientoFuncional(Pokemon pokemon) {
        int comprobador = pokedollar - (40 * pokemon.nivel);
        if (comprobador >= 0) {
            pokedollar = pokedollar - comprobador;

            if (pokemon.ataque + 5 >= 100)
                pokemon.ataque = 100;
            else
                pokemon.ataque += 5;

            if (pokemon.defensa + 5 >= 100)
                pokemon.defensa = 100;
            else
                pokemon.defensa += 5;

            if (pokemon.velocidad + 5 >= 100)
                pokemon.velocidad = 100;
            else
                pokemon.velocidad += 5;

            if (pokemon.vitalidad + 5 >= 100)
                pokemon.vitalidad = 100;
            else
                pokemon.vitalidad += 5;
        }
        System.out.println("No tienes sufucientes pokedollares");
    }

    @Override
    public void entrenamientoOnirico(Pokemon pokemon) {
        int comprobador = pokedollar - (40 * pokemon.nivel);
        if (comprobador >= 0) {
            pokedollar = pokedollar - comprobador;
            if (pokemon.ataqueEspecial + 5 >= 100)
                pokemon.ataqueEspecial = 100;
            else
                pokemon.ataqueEspecial += 5;

            if (pokemon.defensaEspecial + 5 >= 100)
                pokemon.defensaEspecial = 100;
            else
                pokemon.defensaEspecial += 5;

            if (pokemon.velocidad + 5 >= 100)
                pokemon.velocidad = 100;
            else
                pokemon.velocidad += 5;

            if (pokemon.vitalidad + 5 >= 100)
                pokemon.vitalidad = 100;
            else
                pokemon.vitalidad += 5;
        } else {
            System.out.println("No tienes suficientes pokedollares");
        }

    }

    public void guardarPokemon(Pokemon pokemon) {
        if (equipo.size() > 1) {
            pokedex.add(pokemon);
        } else {
            System.out.println("Tú equipo debe tener mínimo 1 Pokemons");
        }
    }

    public void sacarPokemon(Pokemon pokemon) {
        if (equipo.size() < 4) {
            equipo.add(pokemon);
        } else {
            System.out.println("Tú equipo no puede tener más de 4 Pokemons");
        }
    }

    public void ponerACriar(Pokemon pokemon1, Pokemon pokemon2) {
        Random sc = new Random();
        int ataqueCria;
        int ataqueEspecialCria;
        int defensaCria;
        int defensaEspecialCria;
        int vitalidadCria;
        int velocidadCria;
        int estaminaCria;

        if(pokemon1.nombre.equals(pokemon2.nombre)){
            if (pokemon1.sexo != pokemon2.sexo){
                if (pokemon1.fertilidad > 0 && pokemon2.fertilidad > 0) {
                    pokemon1.fertilidad--; pokemon2.fertilidad--;
                    String padre = pokemon1.nombre.size / 2;
                    String madre = pokemon2.nombre.size / 2;
                    int numero = sc.nextInt(1 - 2);
                    if (numero == 1) {
                        String nombreCria = pokemon1.nombre.size / 2 + pokemon2.nombre.size / 2;
                    } else {
                        String nombreCria = pokemon2.nombre.size / 2 + pokemon1.nombre.size / 2;
                    }
                    
                    if(pokemon1.ataque > pokemon2.ataque){
                        
                        ataqueCria = pokemon1.ataque;
                    }else {
                        ataqueCria = pokemon2.ataque;
                    }
                
                    if(pokemon1.ataqueEspecial > pokemon2.ataqueEspecial){
                        
                        ataqueEspecialCria = pokemon1.ataqueEspecial;
                    }else {
                        ataqueEspecialCria = pokemon2.ataqueEspecial;
                    }
                    
                    if(pokemon1.defensa > pokemon2.defensa){
                        
                        defensaCria = pokemon1.defensa;
                    }else {
                        defensaCria = pokemon2.defensa;
                    }

                    if(pokemon1.defensaEspecial > pokemon2.defensaEspecial){
                        
                        defensaEspecialCria = pokemon1.defensaEspecial;
                    }else {
                        defensaEspecialCria = pokemon2.defensaEspecial;
                    }

                    if(pokemon1.vitalidad > pokemon2.vitalidad){
                        
                        vitalidadCria = pokemon1.vitalidad;
                    }else {
                        vitalidadCria = pokemon2.vitalidad;
                    }

                    if(pokemon1.velocidad > pokemon2.velocidad{
                        
                        velocidadCria = pokemon1.velocidad;
                    }else {
                        velocidadCria = pokemon2.velocidad;
                    }

                    if(pokemon1.estamina > pokemon2.estamina){
                        
                        estaminaCria = pokemon1.estamina;
                    }else {
                        estaminaCria = pokemon2.estamina;
                    }
                    
                
                } else {

                    System.out.println("Uno de tus Pokémons no puede criar");
                }

            } else {
                System.out.println("Para criar tus pokemon deben tener diferente sexo");
            }
        }
        else{
            System.out.println("Tus pokemon no son del mismo tipo");
        }

    }

}