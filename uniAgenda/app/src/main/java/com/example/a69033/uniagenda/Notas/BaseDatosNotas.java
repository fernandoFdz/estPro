package com.example.a69033.uniagenda.Notas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by mserv on 30/11/2017.
 */

public class BaseDatosNotas extends SQLiteOpenHelper {
    public BaseDatosNotas(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table tablaNotas(titulo text, mensaje text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table if exists tablaNotas");

        db.execSQL("create table tablaNotas(titulo text, mensaje text)");

    }
}
