package domain;

import enums.TipoPago;
import enums.TipoVagon;

public class Viaje {

    private String id;
    private Horario horario;
    private Tren tren;


    public Viaje(String idViaje,Horario horario,Tren tren){
        this.id=idViaje;
        this.horario=horario;
        this.tren=tren;
    }

    public Horario getHorario(){
        return this.horario;
    }


    public String getIdViaje(){
        return this.id;
    }

    public Billete comprarBilelte(Enum<TipoVagon> clase, boolean fumador, Enum<TipoPago> tipoPago, String name) {
        Billete billete= this.tren.comprarBillete(clase,fumador);
        if(billete!= null){
            billete.setTipoPago(tipoPago);
            billete.setNombrePasajero(name);
            return billete;
        }
        return billete;
    }
}
