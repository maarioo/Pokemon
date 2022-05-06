package entrenador;


import java.util.ArrayList;
import java.util.Random;
import pokemon.Pokemon;

public class Entrenador implements IEntrenable {
    private String nombre;
    private ArrayList<Pokemon> equipo;
    private ArrayList<Pokemon> pokedex;
    private int pokedollar;
    private Pokeball objeto;
    private int numPokemon;

    public Entrenador(String nombre, ArrayList<Pokemon> equipo, ArrayList<Pokemon> pokedex,Pokeball objeto, int numPokemon) {
        Random rnd = new Random();
        this.nombre = nombre;
        this.pokedollar = rnd.nextInt(800 - 1000);
        this.equipo = equipo;
        this.pokedex = pokedex;
        this.numPokemon = numPokemon;
        this.objeto = objeto;
        
    }

    public Entrenador(){
        Random rnd = new Random();
        int numPoke;
        String[] nombres = {"Fernando","Xin Lu","Yasuo","Super","Pepe", "Luis Manuel", "Paco", "Juaniko", "Ash Ketchup", "Fran", "Pedro", "Jose Carlos", "Angel", "Luis", "Markos"};
        this.nombre = nombres[rnd.nextInt(15)];
        ArrayList<Pokemon> equipoEntrenador;
        for(int i = 0; i < 4; i++){
            //equipoEntrenador.add(pokemon.getPokemonAle());
        }
        
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
        int comprobador = pokedollar - (20 * pokemon.getNivel());
        if (comprobador >= 0) {
            pokedollar = pokedollar - comprobador;
            if (pokemon.getDefensa() + 5 >= 100)
                pokemon.setDefensa(100);
            else
                pokemon.setDefensa(pokemon.getDefensa() + 5);

            if (pokemon.getDefensaEspecial() + 5 >= 100)
            pokemon.setDefensaEspecial(100);
            else
                pokemon.setDefensaEspecial(pokemon.getDefensaEspecial() + 5);

            if (pokemon.getVitalidad() + 5 >= 100)
                pokemon.setVitalidad(100);
            else
                pokemon.setVitalidad(pokemon.getVitalidad() + 5);

        } else {
            System.out.println("No tienes suficientes pokedollares");
        }

    }

    @Override
    public void entrenamientoFurioso(Pokemon pokemon) {
        int comprobador = pokedollar - (30 * pokemon.getNivel());
        if (comprobador >= 0) {
            pokedollar = pokedollar - comprobador;
            if (pokemon.getAtaque() + 5 >= 100)
                pokemon.setAtaque(100);
            else
                pokemon.setAtaque(pokemon.getAtaque() + 5);

            if (pokemon.getAtaqueEspecial() + 5 >= 100)
                pokemon.setAtaqueEspecial(100);
            else
                pokemon.setAtaqueEspecial(pokemon.getAtaqueEspecial() + 5);

            if (pokemon.getVelocidad() + 5 >= 100)
                pokemon.setVelocidad(100);
            else
                pokemon.setVelocidad(pokemon.getVelocidad() + 5);

        } else {
            System.out.println("No tienes suficientes pokedollares");
        }

    }

    @Override
    public void entrenamientoFuncional(Pokemon pokemon) {
        int comprobador = pokedollar - (40 * pokemon.getNivel());
        if (comprobador >= 0) {
            pokedollar = pokedollar - comprobador;

            if (pokemon.getAtaque() + 5 >= 100)
                pokemon.setAtaque(100);
            else
                pokemon.setAtaque(pokemon.getAtaque() + 5);

            if (pokemon.getDefensa() + 5 >= 100)
                pokemon.setDefensa(100);
            else
                pokemon.setDefensa(pokemon.getDefensa() + 5);

            if (pokemon.getVelocidad() + 5 >= 100)
                pokemon.setVelocidad(100);
            else
                pokemon.setVelocidad(pokemon.getVelocidad() + 5);

            if (pokemon.getVitalidad() + 5 >= 100)
                pokemon.setVitalidad(100);
            else
                pokemon.setVitalidad(pokemon.getVitalidad() + 5);
        }
        System.out.println("No tienes sufucientes pokedollares");
    }

    @Override
    public void entrenamientoOnirico(Pokemon pokemon) {
        int comprobador = pokedollar - (40 * pokemon.getNivel());
        if (comprobador >= 0) {
            pokedollar = pokedollar - comprobador;
            if (pokemon.getAtaqueEspecial() + 5 >= 100)
                pokemon.setAtaqueEspecial(100);
            else
                pokemon.setAtaqueEspecial(pokemon.getAtaqueEspecial() + 5);

            if (pokemon.getDefensaEspecial() + 5 >= 100)
                pokemon.setDefensaEspecial(100);
            else
                pokemon.setDefensaEspecial(pokemon.getDefensaEspecial() + 5);

            if (pokemon.getVelocidad() + 5 >= 100)
                pokemon.setVelocidad(100);
            else
                pokemon.setVelocidad(pokemon.getVelocidad() + 5);

            if (pokemon.getVitalidad() + 5 >= 100)
                pokemon.setVitalidad(100);
            else
                pokemon.setVitalidad(pokemon.getVitalidad() + 5);
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
    //TODO: MOVIMIENTOS POKEMON CRIA ADEMAS DE HACER BIEN EL NOMBRE
    public void ponerACriar(Pokemon pokemon1, Pokemon pokemon2) {
        Random sc = new Random();
        int ataqueCria;
        int ataqueEspecialCria;
        int defensaCria;
        int defensaEspecialCria;
        int vitalidadCria;
        int velocidadCria;
        int estaminaCria;

        if(pokemon1.getNombre().equals(pokemon2.getNombre())){
            if (pokemon1.getSexo() != pokemon2.getSexo()){

                if (pokemon1.getFertilidad() > 0 && pokemon2.getFertilidad() > 0) {
                    pokemon1.setFertilidad(pokemon1.getFertilidad() - 1); pokemon2.setFertilidad(pokemon2.getFertilidad() - 1);
                    String nombreCria = new String();
                    String padre = pokemon1.nombre.size / 2;
                    String madre = pokemon2.nombre.size / 2;
                    int numero = sc.nextInt(1 - 2);
                    if (numero == 1) {
                        String nombreCria = pokemon1.nombre.size / 2 + pokemon2.nombre.size / 2;
                    } else {
                        String nombreCria = pokemon2.nombre.size / 2 + pokemon1.nombre.size / 2;
                    }
                    
                    if(pokemon1.getAtaque() > pokemon2.getAtaque()){
                        
                        ataqueCria = pokemon1.getAtaque();
                    }else {
                        ataqueCria = pokemon2.getAtaque();
                    }
                
                    if(pokemon1.getAtaqueEspecial() > pokemon2.getAtaqueEspecial()){
                        
                        ataqueEspecialCria = pokemon1.getAtaqueEspecial();
                    }else {
                        ataqueEspecialCria = pokemon2.getAtaqueEspecial();
                    }
                    
                    if(pokemon1.getDefensa() > pokemon2.getDefensa()){
                        
                        defensaCria = pokemon1.getDefensa();
                    }else {
                        defensaCria = pokemon2.getDefensa();
                    }

                    if(pokemon1.getDefensaEspecial() > pokemon2.getDefensaEspecial()){
                        
                        defensaEspecialCria = pokemon1.getDefensaEspecial();
                    }else {
                        defensaEspecialCria = pokemon2.getDefensaEspecial();
                    }

                    if(pokemon1.getVitalidad() > pokemon2.getVitalidad()){
                        
                        vitalidadCria = pokemon1.getVitalidad();
                    }else {
                        vitalidadCria = pokemon2.getVitalidad();
                    }

                    if(pokemon1.getVelocidad() > pokemon2.getVelocidad()){
                        
                        velocidadCria = pokemon1.getVelocidad();
                    }else {
                        velocidadCria = pokemon2.getVelocidad();
                    }

                    if(pokemon1.getEstamina() > pokemon2.getEstamina()){
                        
                        estaminaCria = pokemon1.getEstamina();
                    }else {
                        estaminaCria = pokemon2.getEstamina();
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