package com.example.a69033.uniagenda.Notas;

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
 * Created by mserv on 30/11/2017.
 */

public class NuevaNota extends AppCompatActivity {

    EditText espacioTitulo, espacioMensaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_nota);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        espacioTitulo = (EditText) findViewById(R.id.espacioTituloNota);
        espacioMensaje = (EditText) findViewById(R.id.espacioCuerpoNota);

    }

    public void guardarNuevaNota(View view)
    {
        try
        {
            BaseDatosNotas conexion = new BaseDatosNotas(this, "bd_notas", null, 1);

            SQLiteDatabase db = conexion.getWritableDatabase();

            ContentValues values = new ContentValues();

            if(espacioTitulo.getText().toString() == null || espacioTitulo.getText().toString().equals(""))
            {
                throw new Exception();
            }
            else
            {
                values.put("titulo",espacioTitulo.getText().toString());
            }

            if(espacioMensaje.getText().toString() == null || espacioMensaje.getText().toString().equals(""))
            {
                throw new Exception();
            }
            else
            {
                values.put("mensaje",espacioMensaje.getText().toString());
            }

            Long idRegistrar = db.insert("tablaNotas", "titulo", values);

            if (idRegistrar >= 0)
            {
                Toast.makeText(getApplicationContext(), "idRegistro: " + idRegistrar,
                        Toast.LENGTH_SHORT).show();
            } else
                {
                Toast.makeText(getApplicationContext(), "idRegistro: " + idRegistrar
                        + "No se guardo la nota", Toast.LENGTH_SHORT).show();
            }

            db.close();

            limpiar();

        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(), "completa todos los campos", Toast.LENGTH_SHORT).show();
        }
    }

    private void limpiar() {

        espacioMensaje.setText("");
        espacioTitulo.setText("");

    }

}
