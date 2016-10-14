package domain;

import enums.TipoPago;
import enums.TipoUsuario;
import enums.TipoVagon;

import java.util.ArrayList;
import java.util.List;

public class Viajero extends Usuario {

    private static final String COMPRO = "COMPRA EXITOSA";
    private static final String NO_COMPRO = "NO SE PUDO EFECTUAR LA COMPRA";
    private List<Billete> billetes;


    public Viajero(String name) {
        this.setName(name);
        this.setTipoUsuario(TipoUsuario.VIAJERO);
        this.billetes=new ArrayList<>();
    }


    public void comprarBillete(Enum<TipoVagon> clase, boolean fumador, Enum<TipoPago> tipoPago, String idViaje) {
        Billete billete = this.getMetroviasService().comprarBillete(clase, fumador, tipoPago, getName(), idViaje);

        if (billete!=null) {
            this.billetes.add(billete);
            System.out.println(COMPRO);
            System.out.println(billete.toString());
        } else {
            System.out.println(NO_COMPRO);
        }
    }


    public void comprarBillete(Enum<TipoPago> tipoPago, String idViaje) {
        Billete billete = this.getMetroviasService().comprarBillete(tipoPago, getName(), idViaje);

        if (billete!=null) {
            this.billetes.add(billete);
            System.out.println(COMPRO);
            System.out.println(billete.toString());
        } else {
            System.out.println(NO_COMPRO);
        }
    }


}
