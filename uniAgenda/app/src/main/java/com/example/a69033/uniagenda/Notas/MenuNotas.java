package com.example.a69033.uniagenda.Notas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.a69033.uniagenda.R;

/**
 * Created by mserv on 30/11/2017.
 */

public class MenuNotas extends AppCompatActivity {

    BaseDatosNotas conexion = new BaseDatosNotas(this, "bd_notas",null, 1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_notas);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        BaseDatosNotas conexion = new BaseDatosNotas(this, "bd_notas",null, 1);

    }

    public void agregarNuevaNota(View view) {
        Intent miIntent = new Intent(MenuNotas.this, NuevaNota.class);
        startActivity(miIntent);
    }


    public void vistaCompletaNotas(View view) {
        Intent miIntent = new Intent(MenuNotas.this, VistaNotas.class);
        startActivity(miIntent);
    }


}
