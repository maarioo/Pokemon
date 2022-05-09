package movimiento;

import java.util.ArrayList;

import pokemon.Pokemon;

public abstract class Movimiento {

    private int estamina;
    private ArrayList<Pokemon> nMovimientos[];
    private ArrayList<Pokemon> moviDisponibles[];

    public void Movimiento(int estamina, ArrayList<Pokemon> nMovimientos[], ArrayList<Pokemon> moviDisponibles[]){
        this.estamina = estamina;
        this.nMovimientos = nMovimientos;
        this.moviDisponibles = moviDisponibles;
    }
    public int getEstamina() {
        
        return estamina;
    }
    public ArrayList<Pokemon>[] getnMovimientos() {
        return nMovimientos;
    }
    public ArrayList<Pokemon>[] getMoviDisponibles() {
        return moviDisponibles;
    }
    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }
    public void setnMovimientos(ArrayList<Pokemon>[] nMovimientos) {
        this.nMovimientos = nMovimientos;
    }
    public void setMoviDisponibles(ArrayList<Pokemon>[] moviDisponibles) {
        this.moviDisponibles = moviDisponibles;
    }
} 