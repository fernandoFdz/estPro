package com.example.a69033.uniagenda.Libros;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.a69033.uniagenda.R;

import java.util.ArrayList;

/**
 * Created by mserv on 14/11/2017.
 */

public class VerLibreria extends AppCompatActivity {

    ListView vistaListaLibreria;

    ArrayList<String> listaInfo;

    ArrayList<DatosLibros> listaDatos;

    LibrosBaseDeDatos enlace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verlibreria);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        enlace = new LibrosBaseDeDatos(getApplicationContext(), "bd_libros", null, 1);

        vistaListaLibreria = (ListView) findViewById(R.id.vistaListaLibreria);

        consultarLibreria();

        ArrayAdapter adaptador = new ArrayAdapter(this,android.R.layout.simple_list_item_1,
                listaInfo);

        vistaListaLibreria.setAdapter(adaptador);


    }

    private void consultarLibreria() {

        SQLiteDatabase db = enlace.getReadableDatabase();

        DatosLibros datos = null;

        listaDatos = new ArrayList<DatosLibros>();

        Cursor cursor = db.rawQuery("select * from tablaLibros", null);

        while (cursor.moveToNext())
        {
            datos = new DatosLibros(cursor.getString(0), cursor.getInt(1), cursor.getInt(2),
                    cursor.getInt(3), cursor.getInt(4), cursor.getInt(5), cursor.getInt(6));

            listaDatos.add(datos);
        }

        obtenerLista();
    }

    private void obtenerLista() {

        listaInfo = new ArrayList<String>();

        for (int i=0; i < listaDatos.size(); i++)
        {
            listaInfo.add("Titulo del Libro: "+listaDatos.get(i).getTituloLibro()+"\n"+
                    "Fecha de Prestamo: "+listaDatos.get(i).getDiaPrestado()+" / "
                     +listaDatos.get(i).getMesPrestado()+" / "+listaDatos.get(i).getAnoPrestado()+"\n"+
                    "Fecha de Entrega: "+listaDatos.get(i).getDiaEntregar()+" / "
                    +listaDatos.get(i).getMesEntregar()+" / "+listaDatos.get(i).getAnoEntregar());
        }
    }
}
