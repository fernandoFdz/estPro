package com.example.a69033.uniagenda;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class AyudaEstudiantil extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda_estudiantil);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

    }

    public void quimica(View view)
    {
        Intent miIntent = new Intent(AyudaEstudiantil.this,TablaQuimica.class);
        startActivity(miIntent);
    }
    public void logica(View view)
    {
        Intent miIntent = new Intent(AyudaEstudiantil.this,tablaLogica.class);
        startActivity(miIntent);
    }
    public void conversor(View view)
    {
        Intent miIntent = new Intent(AyudaEstudiantil.this,conversorG.class);
        startActivity(miIntent);
    }


}

