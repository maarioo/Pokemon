package combate;

import java.util.ArrayList;

import entrenador.Entrenador;
import pokemon.Pokemon;

public class Combate {
    private Entrenador entrenadorJugador;
    private Entrenador entrenadorRival;
    private int turno;
    private int koEntrenador;
    private int koRival;

    Combate() {

    }

    public int getTurno() {
        return turno;
    }

    public Entrenador getEntrenadorJugador() {
        return entrenadorJugador;
    }

    public Entrenador getEntrenadorRival() {
        return entrenadorRival;
    }

    public int getKoEntrenador() {
        return koEntrenador;
    }

    public int getKoRival() {
        return koRival;
    }

    public void setEntrenadorJugador(Entrenador entrenadorJugador) {
        this.entrenadorJugador = entrenadorJugador;
    }

    public void setEntrenadorRival(Entrenador entrenadorRival) {
        this.entrenadorRival = entrenadorRival;
    }

    public void setKoEntrenador(int koEntrenador) {
        this.koEntrenador = koEntrenador;
    }

    public void setKoRival(int koRival) {
        this.koRival = koRival;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public void combate() {
        ArrayList<Pokemon> pokemonJugador = this.entrenadorJugador.getEquipo();
        ArrayList<Pokemon> pokemonRival = this.entrenadorRival.getEquipo();
        
       if (pokemonJugador.size() >= 4) {
            if (pokemonJugador.get(0).getVelocidad() >= pokemonRival.get(0).getVelocidad()) {
                while(koEntrenador < 4 && koRival < 4){
                    turno++;
                }
            }
        }

    }

    public void rendirse() {
        koRival = 4;
    }

    public boolean ganarPokedollares(){
        int pokedollaresG = 0;
        if(koRival == 4){
            pokedollaresG += entrenadorJugador.getPokedollar() + (entrenadorJugador.getPokedollar()* 0.33);
            return true;
        }else return false;
    }

    public boolean perderPokedollares(){
        int pokedollaresP = 0;
        if(koEntrenador == 4){
            pokedollaresP += entrenadorJugador.getPokedollar() - (entrenadorJugador.getPokedollar()* 0.33);
            return true;
        }else return false;
    }
}
