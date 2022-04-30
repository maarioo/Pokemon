package entrenador;

import pokemon.Pokemon;
import java.util.ArrayList;
import java.util.Random;


public class Entrenador implements IEntrenable {
    private String nombre;
    private ArrayList<Pokemon> equipo;
    private ArrayList<Pokemon> pokedex;
    private int pokedollar;
    private Objeto objeto;
    private int numPokemon;

    Entrenador(String nombre) {
        Random rnd = new Random();
        this.nombre = nombre;
        this.pokedollar = rnd.nextInt(800 - 1000);
        this.equipo = equipo;
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

    public Objeto getObjeto() {
        return objeto;
    }

    public int getPokedollar() {
        return pokedollar;
    }

    public ArrayList<Pokemon> getPokedex() {
        return pokedex;
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

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    public void setPokedollar(int pokedollar) {
        this.pokedollar = pokedollar;
    }

    public void setPokedex(ArrayList<Pokemon> pokedex) {
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
                defensa = 100;
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
                ataque = 100;
            else
                pokemon.ataque += 5;

            if (pokemon.ataqueEspecial + 5 >= 100)
                ataqueEspecial = 100;
            else
                pokemon.ataqueEspecial += 5;

            if (pokemon.velocidad + 5 >= 100)
                velocidad = 100;
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
                ataque = 100;
            else
                pokemon.ataque += 5;

            if (pokemon.defensa + 5 >= 100)
                defensa = 100;
            else
                pokemon.defensa += 5;

            if (pokemon.velocidad + 5 >= 100)
                velocidad = 100;
            else
                pokemon.velocidad += 5;

            if (pokemon.vitalidad + 5 >= 100)
                vitalidad = 100;
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
                ataqueEspecial = 100;
            else
                pokemon.ataqueEspecial += 5;

            if (pokemon.defensaEspecial + 5 >= 100)
                defensaEspecial = 100;
            else
                pokemon.defensaEspecial += 5;

            if (pokemon.velocidad + 5 >= 100)
                velocidad = 100;
            else
                pokemon.velocidad += 5;

            if (pokemon.vitalidad + 5 >= 100)
                vitalidad = 100;
            else
                pokemon.vitalidad += 5;
        } else {
            System.out.println("No tienes suficientes pokedollares");
        }

    }

    public void guardarPokemon() {
        if (equipo.size() > 1) {

        } else {
            System.out.println("Tú equipo debe tener mínimo 1 Pokemons");
        }
    }

    public void sacarPokemon() {
        if (equipo.size() < 4) {

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
                    
                    if(pokemon1.ataqueCria > pokemon2.ataqueCria){
                        
                        ataqueCria = pokemon1.ataqueCria;
                    }else {
                        ataqueCria = pokemon2.ataqueCria;
                    }
                
                    if(pokemon1.ataqueEspecialCria > pokemon2.ataqueEspecialCria){
                        
                        ataqueCria = pokemon1.ataqueEspecialCria;
                    }else {
                        ataqueEspecialCria = pokemon2.ataqueEspecialCria;
                    }
                    
                    if(pokemon1.defensaCria > pokemon2.defensaCria){
                        
                        ataqueCria = pokemon1.defensaCria;
                    }else {
                        ataqueCria = pokemon2.defensaCria;
                    }

                    if(pokemon1.defensaEspecialCria > pokemon2.defensaEspecialCria){
                        
                        ataqueCria = pokemon1.defensaEspecialCria;
                    }else {
                        ataqueCria = pokemon2.defensaEspecialCria;
                    }

                    if(pokemon1.vitalidadCria > pokemon2.vitalidadCria){
                        
                        ataqueCria = pokemon1.vitalidadCria;
                    }else {
                        ataqueCria = pokemon2.vitalidadCria;
                    }

                    if(pokemon1.velocidadCria > pokemon2.velocidadCria{
                        
                        ataqueCria = pokemon1.velocidadCria;
                    }else {
                        ataqueCria = pokemon2.velocidadCria;
                    }

                    if(pokemon1.estaminaCria > pokemon2.estaminaCria){
                        
                        ataqueCria = pokemon1.estaminaCria;
                    }else {
                        ataqueCria = pokemon2.estaminaCria;
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