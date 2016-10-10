package domain;

import enums.TipoPago;

public class Billete {

    private String nombrePasajero;
    private String idViaje;
    private int numeroVagon;
    private int numeroAsiento;
    private Enum<TipoPago> tipoPagoEnum;

    public Billete(String nombrePasajero,String idViaje,int numeroVagon,int numeroAsiento){
        this.nombrePasajero=nombrePasajero;
        this.idViaje=idViaje;
        this.numeroVagon=numeroVagon;
        this.numeroAsiento=numeroAsiento;
    }

    public String getIdViaje(){
        return this.idViaje;
    }

    public void setIdViaje(String idViaje){
        this.idViaje=idViaje;
    }

    public void setNombrePasajero(String nombrePasajero){
        this.nombrePasajero=nombrePasajero;
    }

    public void setTipoPago(Enum<TipoPago> tipoPagoEnum){
        this.tipoPagoEnum=tipoPagoEnum;
    }

    public Billete(int numVagon,int numeroAsiento){
        this.numeroVagon=numVagon;
        this.numeroAsiento=numeroAsiento;
    }

    @Override
    public String toString(){
        return this.nombrePasajero+" "+idViaje+" "+numeroAsiento+" "+numeroAsiento;
    }


}
