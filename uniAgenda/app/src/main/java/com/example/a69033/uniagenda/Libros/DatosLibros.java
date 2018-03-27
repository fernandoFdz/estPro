package com.example.a69033.uniagenda.Libros;

/**
 * Created by mserv on 14/11/2017.
 */

public class DatosLibros {

    private String tituloLibro;
    private Integer diaPrestado;
    private Integer mesPrestado;
    private Integer anoPrestado;
    private Integer diaEntregar;
    private Integer mesEntregar;
    private Integer anoEntregar;

    public DatosLibros(String tituloLibro, Integer diaPrestado, Integer mesPrestado, Integer anoPrestado,
                       Integer diaEntregar, Integer mesEntregar, Integer anoEntregar)
    {
        this.tituloLibro = tituloLibro;
        this.diaPrestado = diaPrestado;
        this.mesPrestado = mesPrestado;
        this.anoPrestado = anoPrestado;
        this.diaEntregar = diaEntregar;
        this.mesEntregar = mesEntregar;
        this.anoEntregar = anoEntregar;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public Integer getDiaPrestado() {
        return diaPrestado;
    }

    public Integer getMesPrestado() {
        return mesPrestado;
    }

    public Integer getAnoPrestado() {
        return anoPrestado;
    }

    public Integer getDiaEntregar() {
        return diaEntregar;
    }

    public Integer getMesEntregar() {
        return mesEntregar;
    }

    public Integer getAnoEntregar() {
        return anoEntregar;
    }
}
