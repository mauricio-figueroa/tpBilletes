package domain;

import enums.TipoUsuario;

import java.util.Date;
import java.util.List;

public class Seguridad extends Usuario {


    public Seguridad(String name) {
        this.setName(name);
        this.setTipoUsuario(TipoUsuario.SEGURIDAD);
    }

    public List<Viaje> getViajes(Date desde,Date hasta){
        return this.metroviasService.getViajes(desde,hasta);
    }


}
