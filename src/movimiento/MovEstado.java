package movimiento;

import pokemon.EnumEstado;

public class MovEstado {
    
    private EnumEstado estadoAplicado;
    private Turno turnosEstado;

    public void MovEstado() {
        this.estadoAplicado = estadoAplicado;
        this.turnosEstado = turnosEstado;
    }
    public EnumEstado getEstadoAplicado() {
        
        return estadoAplicado;
    }
    public Turno getTurnosEstado() {
        
        return turnosEstado;
    }
}