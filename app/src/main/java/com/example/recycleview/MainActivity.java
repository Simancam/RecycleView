package com.example.recycleview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.adaptadores.PerroAdaptador;
import com.example.recycleview.clases.Perro;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv_perros;
    List<Perro> listaPerros = new ArrayList<>();

    Button btn_botonsito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv_perros = findViewById(R.id.rcv_perros);
        btn_botonsito = findViewById(R.id.btn_botonsito);

        btn_botonsito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(I);
            }
        });

        Perro perro1 = new Perro("Obama bin laden", 20, "https://www.google.com/url?sa=i&url=https%3A%2F%2Ftwitter.com%2FMOSSPUPPYCAT%2Fstatus%2F1580437289196404737&psig=AOvVaw1ttsbJLXhTViTpSqxIqQIz&ust=1714669172352000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCNjxsM_27IUDFQAAAAAdAAAAABAE");
        Perro perro2 = new Perro("Osama bin laden", 21, "https://www.google.com/url?sa=i&url=https%3A%2F%2Ftwitter.com%2FMOSSPUPPYCAT%2Fstatus%2F1580437289196404737&psig=AOvVaw1ttsbJLXhTViTpSqxIqQIz&ust=1714669172352000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCNjxsM_27IUDFQAAAAAdAAAAABAE");
        Perro perro3 = new Perro("Obama", 22, "https://www.google.com/url?sa=i&url=https%3A%2F%2Ftwitter.com%2FMOSSPUPPYCAT%2Fstatus%2F1580437289196404737&psig=AOvVaw1ttsbJLXhTViTpSqxIqQIz&ust=1714669172352000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCNjxsM_27IUDFQAAAAAdAAAAABAE");

        listaPerros.add(perro1);
        listaPerros.add(perro2);
        listaPerros.add(perro3);

        rcv_perros.setLayoutManager(new LinearLayoutManager(this));
        rcv_perros.setAdapter(new PerroAdaptador(listaPerros));
    }


}