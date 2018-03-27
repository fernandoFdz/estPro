package com.example.a69033.uniagenda;

/**
 * Created by Fery on 11/11/2017.
 */
import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyTestService extends IntentService {

    public MyTestService() {
        super("MyTestService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //Do the task here
        Log.i("MyTestService", "Servicio ejecutandose. Recordatorios");
    }
}