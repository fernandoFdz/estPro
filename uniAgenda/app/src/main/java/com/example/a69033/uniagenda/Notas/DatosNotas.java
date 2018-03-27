package com.example.a69033.uniagenda.Notas;

import java.io.Serializable;

/**
 * Created by mserv on 30/11/2017.
 */

public class DatosNotas implements Serializable {

    private String tituloNota;
    private String cuerpo;

    public DatosNotas(String tituloNota, String cuerpo) {
        this.tituloNota = tituloNota;
        this.cuerpo = cuerpo;
    }

    public String getTituloNota() {
        return tituloNota;
    }

    public String getCuerpo() {
        return cuerpo;
    }
}
