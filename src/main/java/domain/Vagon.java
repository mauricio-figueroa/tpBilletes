package domain;

import enums.TipoVagon;

public class Vagon {

    public int asientosDisponibles;
    public boolean fumador;
    public Enum<TipoVagon> tipoVagonEnum;
    public int numVagon;

    public Vagon(int asientos,boolean fumador,Enum<TipoVagon> tipoVagonEnum,int numVagon){
        this.numVagon=numVagon;
        this.asientosDisponibles =asientos;
        this.fumador=fumador;
        this.tipoVagonEnum=tipoVagonEnum;
    }

    public int getNumVagon(){
        return this.numVagon;
    }

    public boolean venderAsiento(){
        return asientosDisponibles>0;
    }


    public boolean cumpleCondiciones(boolean fumador, Enum<TipoVagon> tipoVagonEnum) {
        return this.tipoVagonEnum==tipoVagonEnum&&this.fumador==fumador;
    }

    public boolean tieneAsientos() {
        return this.asientosDisponibles>0;
    }

    public int comprarBillete() {

        int numAsiento= this.asientosDisponibles;
        this.asientosDisponibles--;
        return numAsiento;
    }
}
