package com.example.a69033.uniagenda.Libros;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by mserv on 14/11/2017.
 */

public class LibrosBaseDeDatos extends SQLiteOpenHelper {
    public LibrosBaseDeDatos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table tablaLibros(titulo text primary key, diaPrestamo integer, " +
                "mesPrestamo integer, anoPrestamo integer, diaEntrega integer, mesEntrega integer, " +
                "anoEntrega integer)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table if exists tablaLibros");

        db.execSQL("create table tablaLibros(titulo text primary key, diaPrestamo integer, " +
                "mesPrestamo integer, anoPrestamo integer, diaEntrega integer, mesEntrega integer, " +
                "anoEntrega integer)");
    }
}
