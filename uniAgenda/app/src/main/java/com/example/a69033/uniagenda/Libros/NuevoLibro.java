package com.example.a69033.uniagenda.Libros;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.a69033.uniagenda.R;

/**
 * Created by mserv on 14/11/2017.
 */

public class NuevoLibro extends AppCompatActivity {

    EditText tituloLibro,dPrestamo, mPrestamo, aPrestamo, dEntrega, mEntrega, aEntrega;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_libro);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        tituloLibro = (EditText) findViewById(R.id.tituloLibro);
        dPrestamo = (EditText) findViewById(R.id.diaPrestamo);
        mPrestamo = (EditText) findViewById(R.id.mesPrestamo);
        aPrestamo = (EditText) findViewById(R.id.anoPrestamo);

        dEntrega = (EditText) findViewById(R.id.diaEntrega);
        mEntrega = (EditText) findViewById(R.id.mesEntrega);
        aEntrega = (EditText) findViewById(R.id.anoEntrega);
    }

    public void guardarDatosLibros(View view)
    {
        LibrosBaseDeDatos conLibros = new LibrosBaseDeDatos(this,"bd_libros",null,1);

        SQLiteDatabase db = conLibros.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put("titulo",tituloLibro.getText().toString());
        values.put("diaPrestamo",dPrestamo.getText().toString());
        values.put("mesPrestamo",mPrestamo.getText().toString());
        values.put("anoPrestamo",aPrestamo.getText().toString());

        values.put("diaEntrega",dEntrega.getText().toString());
        values.put("mesEntrega",mEntrega.getText().toString());
        values.put("anoEntrega",aEntrega.getText().toString());

        Long idRegistrar = db.insert("tablaLibros", "titulo", values);

        if (idRegistrar >= 0)
        {
            Toast.makeText(getApplicationContext(), "idRegistro: " + idRegistrar,
                    Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(), "idRegistro: " + idRegistrar
                    +"Ya existe el Libro", Toast.LENGTH_SHORT).show();
        }

        db.close();
    }
}



