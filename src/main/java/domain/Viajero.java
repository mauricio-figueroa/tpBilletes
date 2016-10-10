package domain;

import enums.TipoPago;
import enums.TipoUsuario;
import enums.TipoVagon;

public class Viajero extends Usuario {

    private static final String COMPRO = "COMPRA EXITOSA";
    private static final String NO_COMPRO = "NO SE PUDO EFECTUAR LA COMPRA";


    public Viajero(String name) {
        this.setName(name);
        this.setTipoUsuario(TipoUsuario.VIAJERO);
    }


    public void comprarBillete(Enum<TipoVagon> clase, boolean fumador, Enum<TipoPago> tipoPago, String idViaje) {
        Billete billete = this.getMetroviasService().comprarBillete(clase, fumador, tipoPago, getName(), idViaje);

        if (billete!=null) {
            System.out.println(COMPRO);
            System.out.println(billete.toString());
        } else {
            System.out.println(NO_COMPRO);
        }
    }

}
