package domain;

import java.util.Date;

public class Horario {

    private Date salida;
    private Date llegada;


    public Horario(Date salida, Date llegada) {
        this.salida = salida;
        this.llegada = llegada;
    }

    public Date getSalida() {
        return this.salida;
    }

    public Date getLlegada() {
        return this.llegada;
    }

}
