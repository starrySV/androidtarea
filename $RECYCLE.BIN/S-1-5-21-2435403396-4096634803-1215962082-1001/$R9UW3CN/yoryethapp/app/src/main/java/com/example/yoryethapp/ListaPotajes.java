package com.example.yoryethapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.yoryethapp.adapters.ProductAdapter;

public class ListaPotajes extends AppCompatActivity {
   ListView Lis

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_potajes);
        Lis = findViewById(R.id.listadepedidos);

        ProductAdapter adapter = new ProductAdapter(this,
                ListaPotajes.getData());

        Lis.setAdapter(adapter);
    }
}
