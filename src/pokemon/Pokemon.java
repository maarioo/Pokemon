package pokemon;

import java.util.Random;

public class Pokemon implements IMecanicaCaptura{
    private String nombre;
    private String mote;
    private int vitalidad;
    private int ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;
    private int velocidad;
    private int estamina;
    private int nivel;
    private int fertilidad;
    private EnumTipo tipo;
    private EnumEstado estado;
    private int xpActual;


    public Pokemon(String nombre, String mote, int vitalidad, int ataque, int defensa,int ataqueEspecial, int defensaEspecial, int velocidad, int estamina, int nivel,
    EnumTipo tipo, EnumEstado estado, int xpActual){
        this.nombre = nombre;
        this.mote = mote;
        this.vitalidad = vitalidad;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        this.estamina = estamina;
        this.nivel = 1;
        this.fertilidad = 5;
        this.tipo = tipo;
        this.estado = estado;
        this.xpActual = xpActual;
    }
    
    public Pokemon(EnumTipo tipo) {
        this.tipo = tipo;
    }

    public Pokemon() {
    }

    public String getNombre() {
        return nombre;
    }
    public String getMote() {
        return mote;
    }
    public int getVitalidad() {
        return vitalidad;
    }
    public int getAtaque() {
        return ataque;
    }
    public int getDefensa() {
        return defensa;
    }
    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }
    public int getDefensaEspecial() {
        return defensaEspecial;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public int getEstamina() {
        return estamina;
    }
    public int getNivel() {
        return nivel;
    }
    public int getFertilidad() {
        return fertilidad;
    }
    public EnumTipo getTipo() {
        return tipo;
    }
    public EnumEstado getEstado() {
        return estado;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setMote(String mote) {
        this.mote = mote;
    }
    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }
    public void setDefensaEspecial(int defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void setFertilidad(int fertilidad) {
        this.fertilidad = fertilidad;
    }
    public void setTipo(EnumTipo tipo) {
        this.tipo = tipo;
    }
    public void setEstado(EnumEstado estado) {
        this.estado = estado;
    }
    public void subirNivel(){
        Random r = new Random();
            if(xpActual > 10 * nivel) {
                this.nivel++;
                vitalidad = vitalidad + r.nextInt(5) + 1;
                ataque = ataque + r.nextInt(5) + 1;
                defensa = defensa + r.nextInt(5) + 1;
                ataqueEspecial = ataqueEspecial + r.nextInt(5) + 1;
                defensaEspecial = defensaEspecial + r.nextInt(5) + 1;
                velocidad = velocidad + r.nextInt(5) + 1;
            }
    }

    

    public void comprobarVentajas(Pokemon pokemonRival){ float ventaja;
        if (this.getTipo() == EnumTipo.AGUA && pokemonRival.getTipo() == EnumTipo.FUEGO) {
            ventaja = 1.5f;
            System.out.println("El pokemon aliado tiene ventaja");
        }

        else if (this.getTipo() == EnumTipo.AGUA && pokemonRival.getTipo() == EnumTipo.TIERRA) {
            ventaja = 1.5f;
            System.out.println("El pokemon aliado tiene ventaja");
        }

        else if (this.getTipo() == EnumTipo.FUEGO && pokemonRival.getTipo() == EnumTipo.PLANTA) {
            ventaja = 1.5f;
            System.out.println("El pokemon aliado tiene ventaja");
        }

        else if (this.getTipo() == EnumTipo.FUEGO && pokemonRival.getTipo() == EnumTipo.BICHO) {
            ventaja = 1.5f;
            System.out.println("El pokemon aliado tiene ventaja");
        }

        else if (this.getTipo() == EnumTipo.PLANTA && pokemonRival.getTipo() == EnumTipo.AGUA) {
            ventaja = 1.5f;
            System.out.println("El pokemon aliado tiene ventaja");
        }

        else if (this.getTipo() == EnumTipo.PLANTA && pokemonRival.getTipo() == EnumTipo.TIERRA) {
            ventaja = 1.5f;
            System.out.println("El pokemon aliado tiene ventaja");
        }

        else if (this.getTipo() == EnumTipo.BICHO && pokemonRival.getTipo() == EnumTipo.PLANTA) {
            ventaja = 1.5f;
            System.out.println("El pokemon aliado tiene ventaja");
        }

        else if (this.getTipo() == EnumTipo.VOLADOR && pokemonRival.getTipo() == EnumTipo.PLANTA) {
            ventaja = 1.5f;
            System.out.println("El pokemon aliado tiene ventaja");
        }

        else if (this.getTipo() == EnumTipo.VOLADOR && pokemonRival.getTipo() == EnumTipo.BICHO) {
            ventaja = 1.5f;
            System.out.println("El pokemon aliado tiene ventaja");
        }

        else if (this.getTipo() == EnumTipo.ELECTRICO && pokemonRival.getTipo() == EnumTipo.AGUA) {
            ventaja = 1.5f;
            System.out.println("El pokemon aliado tiene ventaja");
        }

        else if (this.getTipo() == EnumTipo.TIERRA && pokemonRival.getTipo() == EnumTipo.ELECTRICO) {
            ventaja = 1.5f;
            System.out.println("El pokemon aliado tiene ventaja");
        }

        else if (this.getTipo() == EnumTipo.TIERRA && pokemonRival.getTipo() == EnumTipo.FUEGO) {
            ventaja = 1.5f;
            System.out.println("El pokemon aliado tiene ventaja");
        }

        else if (this.getTipo() == EnumTipo.TIERRA && pokemonRival.getTipo() == EnumTipo.FUEGO) {
            ventaja = 1.5f;
            System.out.println("El pokemon aliado tiene ventaja");
        }

        else if (this.getTipo() == EnumTipo.AGUA && pokemonRival.getTipo() == EnumTipo.VOLADOR
                || pokemonRival.getTipo() == EnumTipo.BICHO) {
                    ventaja = 1.0f;
            System.out.println("Estais empatados en ventaja");
        }

        else if (this.getTipo() == EnumTipo.FUEGO && pokemonRival.getTipo() == EnumTipo.ELECTRICO
                || pokemonRival.getTipo() == EnumTipo.TIERRA || pokemonRival.getTipo() == EnumTipo.VOLADOR) {
                    ventaja = 1.0f;
            System.out.println("Estais empatados en ventaja");
        }

        else if (this.getTipo() == EnumTipo.PLANTA && pokemonRival.getTipo() == EnumTipo.ELECTRICO) {
            ventaja = 1.0f;
            System.out.println("Estais empatados en ventaja");
        }

        else if (this.getTipo() == EnumTipo.BICHO && pokemonRival.getTipo() == EnumTipo.AGUA
                || pokemonRival.getTipo() == EnumTipo.BICHO || pokemonRival.getTipo() == EnumTipo.ELECTRICO
                || pokemonRival.getTipo() == EnumTipo.TIERRA) {
                    ventaja = 1.0f;
            System.out.println("Estais empatados en ventaja");
        }

        else if (this.getTipo() == EnumTipo.ELECTRICO && pokemonRival.getTipo() == EnumTipo.BICHO
                || pokemonRival.getTipo() == EnumTipo.ELECTRICO || pokemonRival.getTipo() == EnumTipo.FUEGO) {
                    ventaja = 1.0f;
            System.out.println("Estais empatados en ventaja");
        }

        else if (this.getTipo() == EnumTipo.VOLADOR && pokemonRival.getTipo() == EnumTipo.AGUA
                || pokemonRival.getTipo() == EnumTipo.FUEGO || pokemonRival.getTipo() == EnumTipo.TIERRA
                || pokemonRival.getTipo() == EnumTipo.VOLADOR) {
                    ventaja = 1.0f;
            System.out.println("Estais empatados en ventaja");
        }

        else if (this.getTipo() == EnumTipo.TIERRA && pokemonRival.getTipo() == EnumTipo.AGUA
                || pokemonRival.getTipo() == EnumTipo.TIERRA) {
                    ventaja = 1.0f;
            System.out.println("Estais empatados en ventaja");
        }

        else {
            ventaja = 0.5f;
            System.out.println("Tu rival tiene ventaja.");
        }
    }
    public void curarPokemon(){
        vitalidad = 150;
    }

    @Override
    public void generarPokemon() {
        Random rnd = new Random();
        Pokemon p = new Pokemon();
        p.setVitalidad(rnd.nextInt(10) + 1);
        p.setAtaque(rnd.nextInt(5)+1);
        p.setAtaqueEspecial(rnd.nextInt(5)+1);
        p.setDefensa(rnd.nextInt(5)+1);
        p.setDefensaEspecial(rnd.nextInt(5)+1);
        p.setVelocidad(rnd.nextInt(5)+1);
        p.setEstamina(rnd.nextInt(10)+1);
        p.setFertilidad(5);
        p.setNivel(1);
        //equipo.add(p);
        }

        /*public float atacar(int ataque, Pokemon pokemonRival) {

        float ventaja = comprobarVentajas(pokemonRival);
        if ((vitalidad - (movimiento.get(ataque).getPotencia() ventaja + (ataqueEspecial - defensaEspecial))) > 0) {
            pokemonRival.setVitalidad((int) (vitalidad - (movimiento.get(ataque).getPotencia() * ventaja + (ataqueEspecial - defensaEspecial))));
        } else {
        }
        if (vitalidad > 0 && ventaja == 1.5f) {

        }
        return vitalidad;

    }*/

    @Override
    public boolean capturarPokemon() {
        Random r = new Random();
        int nAleatorio = r.nextInt(4);
        if (nAleatorio == 3){
            return false;
        }else{
            generarPokemon();
            return true;
        }
    }

    public void descansar(Pokemon pokemon){
        estamina = 100;
    }
}
