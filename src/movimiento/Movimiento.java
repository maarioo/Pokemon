package movimiento;

public abstract class Movimiento {

    private String movAtaque;
    private String movEstado;
    private String movMejora;

    public void Movimiento(String movAtaque, String movEstado, String movMejora) {
        this.movAtaque = movAtaque;
        this.movEstado = movEstado;
        this.movMejora = movMejora;
    }
    
    public String getMovAtaque() {
        
        return movAtaque;
    }
    public String getMovEstado() {
        return movEstado;
    }
    public String getMovMejora() {
        return movMejora;
    }
    public void setMovAtaque(String movAtaque) {
        this.movAtaque = movAtaque;
    }
    public void setMovEstado(String movEstado) {
        this.movEstado = movEstado;
    }
    public void setMovMejora(String movMejora) {
        this.movMejora = movMejora;
    }
}