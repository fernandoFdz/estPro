package com.example.a69033.uniagenda.Libros;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.a69033.uniagenda.R;

/**
 * Created by marioY50 on 28/10/2017.
 */

public class Libros extends AppCompatActivity {

    LibrosBaseDeDatos conLibros = new LibrosBaseDeDatos(this,"bd_libros",null,1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulibros);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        LibrosBaseDeDatos conLibros = new LibrosBaseDeDatos(this,"bd_libros",null,1);

    }

    public void agregarNuevoLibro(View view) {
        Intent miIntent = new Intent(Libros.this, NuevoLibro.class);
        startActivity(miIntent);
    }

    public void verLibreria(View view) {
        Intent miIntent = new Intent(Libros.this, VerLibreria.class);
        startActivity(miIntent);
    }
}
