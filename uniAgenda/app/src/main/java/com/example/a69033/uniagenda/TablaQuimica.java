package com.example.a69033.uniagenda;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.github.chrisbanes.photoview.PhotoView;

/**
 * Created by Ferykudou on 28/10/2017.
 */

public class TablaQuimica extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla_quimica);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        PhotoView photoView = (PhotoView) findViewById(R.id.lol1);
        photoView.setImageResource(R.drawable.tablaq);



    }
}