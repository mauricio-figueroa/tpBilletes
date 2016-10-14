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

    public Billete comprarBilelte() {
        Billete billete= this.tren.comprarBillete();
        if(billete!= null){
            return billete;
        }
        return billete;
    }

    public Billete comprarBilelte(Enum<TipoVagon> clase, boolean fumador) {
        Billete billete= this.tren.comprarBillete();
        if(billete!= null){
            return billete;
        }
        return billete;
    }
}
