package domain;

import enums.TipoUsuario;

import java.util.List;

public class SupervisorViaje extends Usuario{


    public SupervisorViaje(String name){
        this.setName(name);
        this.setTipoUsuario(TipoUsuario.SUPERVISOR_VIAJE);
    }




    public void getDisposisicionViajeros(String idViaje){
        List<Billete> billetesDeViaje=this.metroviasService.getDisposicionViajeros(idViaje);
        billetesDeViaje.stream().forEach(x->System.out.println(x.toString()));
    }

}
