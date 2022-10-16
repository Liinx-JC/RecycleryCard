package com.hola.recyclerviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends AppCompatActivity {
    //Declaramos la lista para que sea global, donde estaran todos los elementos del recyclerView
    List<Usuarios> user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        //Declaramos el metodo init
        init();
    }
    //Aqui podemos añadir los elementos que se mostraran en la lista
    public void init() {
        user = new ArrayList<>();
        user.add(new Usuarios("#775447", "Pedro", "+56 945786352", "Pperez@gmail.com"));
        user.add(new Usuarios("#607d8b", "Hanna", "+56 97894562", "haniC@gmail.com"));
        user.add(new Usuarios("#03a9f4", "Antonia", "+56 936985478", "antoMR@gmail.com"));
        user.add(new Usuarios("#f44336", "Pablo", "+56 978326974", "pAblOajaja@gmail.com"));


        //Declaramos ElementosAdapter para recibir la lista y el contexto, es decir esta clase
        UsuarioAdapter elementosAdapter = new UsuarioAdapter(user, this);
        //Aqui referenciamos al recyclerView usando su id
        androidx.recyclerview.widget.RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        //Es un tipo de listado que va a ser Lineal
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //Le decimos cual va a ser el adaptador
        recyclerView.setAdapter(elementosAdapter);
    }
}