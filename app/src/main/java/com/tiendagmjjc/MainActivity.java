package com.tiendagmjjc;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tiendagmjjc.adapter.ProductoAdapter;
import com.tiendagmjjc.model.Producto;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCatalogo;
    private ProductoAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCatalogo = findViewById(R.id.rvCatalogo);
        rvCatalogo.setLayoutManager(new LinearLayoutManager(this));

        List<Producto> lista = new ArrayList<>();
        lista.add(new Producto("Elden Ring", "Juego de acción y rol", 250000, R.drawable.ic_launcher_background));
        lista.add(new Producto("Minecraft", "Juego de construcción", 100000, R.drawable.ic_launcher_background));
        lista.add(new Producto("Halo Infinite", "Juego de disparos", 180000, R.drawable.ic_launcher_background));

        adaptador = new ProductoAdapter(lista);
        rvCatalogo.setAdapter(adaptador);
    }
}