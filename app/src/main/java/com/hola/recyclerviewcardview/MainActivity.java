package com.hola.recyclerviewcardview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Mensaje emergente
        Toast.makeText(getApplicationContext(),"Cargando...", Toast.LENGTH_LONG).show();

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent liby1 = new Intent(MainActivity.this, RecyclerView.class);
                startActivity(liby1);
                finish();
            }
        };
        Timer tiempo = new Timer();
        tiempo.schedule(tarea, 4000);
    }
}