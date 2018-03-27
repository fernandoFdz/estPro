package com.example.a69033.uniagenda;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Peso extends AppCompatActivity {

    Button convertir=null;
    EditText cantidad=null;
    TextView resultado=null;
    Spinner spiner=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        convertir=(Button) findViewById(R.id.btnConv);
        cantidad=(EditText) findViewById(R.id.ingresa);
        resultado=(TextView) findViewById(R.id.result);
        spiner=(Spinner) findViewById(R.id.spin);

        String[]op={"Selecciona una opcion","gramos a kilos", "kilos a libras"};
        ArrayAdapter<String> adapter= new
                ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,op);
        spiner.setAdapter(adapter);

        convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cantidad.getText().toString().equals("")) {

                    Toast mag =Toast.makeText(getApplicationContext(),"Escribe una Cantidad",Toast.LENGTH_SHORT);
                }else{
                    Double c=Double.parseDouble(cantidad.getText().toString());
                    Double res=null;
                    int select=spiner.getSelectedItemPosition();

                    switch (select){
                        case 0:
                            res=0.0;
                            Toast.makeText(getApplicationContext(),"Selecciona una opcion",Toast.LENGTH_SHORT).show();
                            break;
                        case 1:
                            res =  c/1000;
                            break;
                        case 2:
                            res = c *2.2046 ;
                            break;
                    }
                    resultado.setText(res.toString());
                }

            }

        });

    }
}