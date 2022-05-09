package movimiento;

import pokemon.EnumTipo;

public class MovAtaque {
    
    private int potAtaque;
    private EnumTipo tipoMov;

    public void MovAtaque(int potAtaque, EnumTipo tipoMov) {
        this.potAtaque = potAtaque;
        this.tipoMov = tipoMov;
    }

    public int getPotAtaque() {
        return potAtaque;
    }
    public EnumTipo getTipoMov() {
        return tipoMov;
    }
    public void setPotAtaque(int potAtaque) {
        this.potAtaque = potAtaque;
    }
    public void setTipoMov(EnumTipo tipoMov) {
        this.tipoMov = tipoMov;
    }
    
}