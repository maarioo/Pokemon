package entrenador;


import java.util.ArrayList;
import java.util.Random;


import pokemon.Pokemon;


public class Entrenador implements IEntrenable{
    private String nombre;
    private ArrayList<Pokemon> equipo;
    private ArrayList<Pokemon> caja; //
    private int pokedollar;

    public Entrenador(String nombre, ArrayList<Pokemon> equipo, ArrayList<Pokemon> caja) {
        Random rnd = new Random();
        this.nombre = nombre;
        this.pokedollar = rnd.nextInt(200)+800;
        this.equipo = equipo;
        this.caja = caja;
        
    }

    public Entrenador(int nivelMedioEquipo){
        Random rnd = new Random();
        String[] nombres = {"Fernando","Xin Lu","Yasuo","Super","Pepe", "Luis Manuel", "Paco", "Juaniko", "Ash Ketchup", "Fran", "Pedro", "Jose Carlos", "Angel", "Luis", "Markos"};
        this.nombre = nombres[rnd.nextInt(15)];
        ArrayList<Pokemon> equipoEntrenador = new ArrayList<>();
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


    public int getPokedollar() {
        return pokedollar;
    }

    public ArrayList<Pokemon> caja() {
        return caja;
    }

    public void setEquipo(ArrayList<Pokemon> equipo) {
        this.equipo = equipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPokedollar(int pokedollar) {
        this.pokedollar = pokedollar;
    }

    public void setcajaPokemon(ArrayList<Pokemon> caja) {
        this.caja = caja;
    }

    @Override
    public String toString() {
        return "El entrenador " + nombre + " tiene " + pokedollar + "pokedollares";
    }

    @Override
    public boolean entrenamientoPesado(Pokemon pokemon) {
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
                return true;
        } else return false;
    } 
    

    

    @Override
    public boolean entrenamientoFurioso(Pokemon pokemon) {
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
                return true;
        } else {
            return false;
        }
    

    }

    @Override
    public boolean entrenamientoFuncional(Pokemon pokemon) {
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
                return true;
        }else return false;
    
        
    }

    @Override 
    public boolean entrenamientoOnirico(Pokemon pokemon) {
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
                return true;
        } else return false;
        }
    
    public boolean guardarPokemon(Pokemon pokemon) {
        if (equipo.size() > 1) {
            caja.add(pokemon);
            equipo.remove(pokemon);
            return true;
        } else 
            return false;
    }

    public boolean sacarPokemon(Pokemon pokemon) {
        if (equipo.size() < 4) {
            equipo.add(pokemon);
            caja.remove(pokemon);
            return true;
        } else 
            return false;
    }
    /*
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

    }*/

    public void generarPokemonAleatorio(int nivelMedioEquipo) {
        Random rnd = new Random();
        Pokemon p = new Pokemon();
        int nivelFinal = nivelMedioEquipo + (rnd.nextInt(5) - 2);
        p.setVitalidad(rnd.nextInt(10) + 1);
        p.setAtaque(rnd.nextInt(5)+1);
        p.setAtaqueEspecial(rnd.nextInt(5)+1);
        p.setDefensa(rnd.nextInt(5)+1);
        p.setDefensaEspecial(rnd.nextInt(5)+1);
        p.setVelocidad(rnd.nextInt(5)+1);
        p.setEstamina(rnd.nextInt(10)+1);
        p.setFertilidad(5);
        
        for(int i = 1; i < nivelFinal; i++){
            p.subirNivel();
        }
        
        equipo.add(p);
    }


}