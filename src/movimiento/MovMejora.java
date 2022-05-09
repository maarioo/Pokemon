package movimiento;

public class MovMejora {
    
    private EnumMejora mejoraAplicada;
    private Turno turnosMejora;

    public void MovMejora(EnumMejora mejoraAplicada, Turno turnosMejora) {
        this.mejoraAplicada = mejoraAplicada;
        this.turnosMejora = turnosMejora;
    }

    public EnumMejora getMejoraAplicada() {
        return mejoraAplicada;
    }
    public Turno getTurnosMejora() {
        return turnosMejora;
    }
    public void setMejoraAplicada(EnumMejora mejoraAplicada) {
        this.mejoraAplicada = mejoraAplicada;
    }
    public void setTurnosMejora(Turno turnosMejora) {
        this.turnosMejora = turnosMejora;
    }
}
