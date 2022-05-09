package movimiento;

public class Turno {
    
    private int numTurnos;
    private String accionEntrenador;
    private String accionRival;

    public void Turno(int numTurnos, String accionEntrenador, String accionRival) {
        this.numTurnos = numTurnos;
        this.accionEntrenador = accionEntrenador;
        this.accionRival = accionRival;
    }

    public int getNumTurnos() {
        return numTurnos;
    }
    public String getAccionEntrenador() {
        return accionEntrenador;
    }
    public String getAccionRival() {
        return accionRival;
    }
    public void setNumTurnos(int numTurnos) {
        this.numTurnos = numTurnos;
    }
    public void setAccionEntrenador(String accionEntrenador) {
        this.accionEntrenador = accionEntrenador;
    }
    public void setAccionRival(String accionRival) {
        this.accionRival = accionRival;
    }
}
