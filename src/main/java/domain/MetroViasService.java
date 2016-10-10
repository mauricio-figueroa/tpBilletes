package domain;

import enums.TipoPago;
import enums.TipoVagon;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MetroViasService {
    private static MetroViasService instance;
    private List<Viaje> viajes = new ArrayList<Viaje>();
    private List<Billete> billetes = new ArrayList<Billete>();


    public static MetroViasService getInstance() {
        if (instance == null) {
            instance = new MetroViasService();
        }
        return instance;
    }

    public Billete comprarBillete(Enum<TipoVagon> clase, boolean fumador, Enum<TipoPago> tipoPago, String name, String idViaje) {
        Viaje viaje = this.getViaje(idViaje);
        Billete billete=null;
        if (viaje != null) {
          billete = viaje.comprarBilelte(clase, fumador, tipoPago, name);
            if (billete == null) {
                billete.setIdViaje(idViaje);
                billetes.add(billete);
            }
        }
        return billete;

    }

    private Viaje getViaje(String idViaje) {
        for (Viaje viajeActual : this.viajes) {
            if (viajeActual.getIdViaje().equalsIgnoreCase(idViaje)) {
                return viajeActual;
            }
        }
        return null;
    }


    public List<Billete> getDisposicionViajeros(String idViaje) {
        List<Billete> billetesDeViaje=new ArrayList<Billete>();
        for (Billete billeteActual:billetes) {
            if(billeteActual.getIdViaje().equalsIgnoreCase(idViaje)){
                billetesDeViaje.add(billeteActual);
            }
        }
        return billetesDeViaje;
    }

    public List<Viaje> getViajes(Date desde, Date hasta) {
        List<Viaje> viajesHorario=new ArrayList<>();
        for (Viaje viaje :viajes) {
            if(viaje.getHorario().getSalida().before(desde)&&viaje.getHorario().getLlegada().after(hasta)){
                viajesHorario.add(viaje);
            }
        }
        return viajes;
    }
}
