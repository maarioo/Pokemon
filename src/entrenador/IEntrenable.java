package entrenador;

import pokemon.Pokemon;

public interface IEntrenable {
    public boolean entrenamientoPesado(Pokemon pokemon);
    public boolean entrenamientoFurioso(Pokemon pokemon);
    public boolean entrenamientoFuncional(Pokemon pokemon);
    public boolean entrenamientoOnirico(Pokemon pokemon);
}
