package domain;

import enums.TipoVagon;

import java.util.ArrayList;
import java.util.List;

public class Tren {

    public List<Vagon> vagones=new ArrayList<Vagon>();


    public Tren(){
        vagones.add(new Vagon(60,true, TipoVagon.PREFERENCIAL,3));
        vagones.add(new Vagon(60,true,TipoVagon.PREFERENCIAL,4));
        vagones.add(new Vagon(60,true,TipoVagon.TURISTA,6));
        vagones.add(new Vagon(60,true,TipoVagon.TURISTA,5));
        vagones.add(new Vagon(60,false,TipoVagon.PREFERENCIAL,1));
        vagones.add(new Vagon(60,false,TipoVagon.PREFERENCIAL,2));
        vagones.add(new Vagon(60,false,TipoVagon.TURISTA,8));
        vagones.add(new Vagon(60,false,TipoVagon.TURISTA,7));
    }

    public Billete comprarBillete(Enum<TipoVagon> clase, boolean fumador) {
        for (Vagon vagonActual:this.vagones) {
            if(vagonActual.cumpleCondiciones(fumador,clase)&&vagonActual.tieneAsientos()){
               int numAsiento= vagonActual.comprarBillete();
                return new Billete(vagonActual.getNumVagon() ,numAsiento);
            }

        }
        return null;
    }
}
