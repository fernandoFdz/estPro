package com.example.a69033.uniagenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



import com.example.a69033.uniagenda.Libros.Libros;
import com.example.a69033.uniagenda.Notas.MenuNotas;

import static com.example.a69033.uniagenda.R.layout.activity_menu_principal;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_menu_principal);
    }

    public void ayudaGen(View view1) {
        Intent miIntentM = new Intent(MenuPrincipal.this,AyudaEstudiantil.class);
        startActivity(miIntentM);
    }

    
    public void seccionLibros(View view) {
        Intent miIntent = new Intent(MenuPrincipal.this, Libros.class);
        startActivity(miIntent);
    }







    public void MenuNotas(View view)
    {
        Intent miIntent = new Intent(MenuPrincipal.this, MenuNotas.class);
        startActivity(miIntent);
    }

    public void CreditosV(View view)
    {
        Intent miIntent = new Intent(MenuPrincipal.this, Creditos.class);
        startActivity(miIntent);
    }

}
