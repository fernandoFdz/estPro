package com.example.a69033.uniagenda;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by Fery on 11/11/2017.
 */


public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {

    public AdminSQLiteOpenHelper(Context context, String nombre, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, nombre, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" create table alarma( idal integer primary key autoincrement,encabezado text, mensaje text," +
                "fecha date, hora time)");



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAnte, int versionNue) {
        db.execSQL("drop table if exists alarma" );
        db.execSQL(" create table alarma( idal integer primary key autoincrement,encabezado text, mensaje text," +
                "fecha date, hora time)");


    }
}