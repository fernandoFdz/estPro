package com.example.a69033.uniagenda.Notas;

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
 * Created by mserv on 30/11/2017.
 */

public class VistaNotas extends AppCompatActivity {

    ListView vistaListaNotas;

    ArrayList<String> listaInfo;

    ArrayList<DatosNotas> listaDatos;

    BaseDatosNotas enlace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_notas);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        enlace = new BaseDatosNotas(getApplicationContext(), "bd_notas", null, 1);

        vistaListaNotas = (ListView) findViewById(R.id.vistaCompletaNotas);

        consultarNotas();

        ArrayAdapter adaptador = new ArrayAdapter(this,android.R.layout.simple_list_item_1, listaInfo);

        vistaListaNotas.setAdapter(adaptador);


    }

    private void consultarNotas() {

        SQLiteDatabase db = enlace.getReadableDatabase();

        DatosNotas datos = null;

        listaDatos = new ArrayList<DatosNotas>();

        Cursor cursor = db.rawQuery("select * from tablaNotas", null);

        while (cursor.moveToNext())
        {
            datos = new DatosNotas(cursor.getString(0), cursor.getString(1));

            listaDatos.add(datos);
        }

        obtenerLista();

    }

    private void obtenerLista()
    {
        listaInfo = new ArrayList<String>();

        for (int i=0; i < listaDatos.size(); i++)
        {
            listaInfo.add("Titulo: "+listaDatos.get(i).getTituloNota()+"\n" + listaDatos.get(i).getCuerpo());
        }
    }

}
