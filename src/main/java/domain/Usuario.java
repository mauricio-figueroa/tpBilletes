package domain;

import enums.TipoUsuario;

public abstract class Usuario {


    private String name;
    protected MetroViasService metroviasService= MetroViasService.getInstance();
    private Enum<TipoUsuario> tipoUsuario;


    public String getName() {
        return this.name;
    }

     void setName(String name) {
        this.name = name;
    }


    public void setTipoUsuario(Enum<TipoUsuario> tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Enum<TipoUsuario> getTipoUsuario() {
        return this.tipoUsuario;
    }

    public MetroViasService getMetroviasService(){
        return this.metroviasService;
    }


}
