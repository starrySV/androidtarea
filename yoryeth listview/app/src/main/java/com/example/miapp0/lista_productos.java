package com.example.miapp0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.miapp0.adaptador.adaptador_producto;
import com.example.miapp0.helpers.queueutils;
import com.example.miapp0.modelos.producto;

import java.util.ArrayList;

public class lista_productos extends AppCompatActivity {

    queueutils.QueueObject queue = null;

    private ListView listaProd;
    private adaptador_producto adaptador;
    ArrayList<producto> items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_productos);
        queue = queueutils.getInstance(this.getApplicationContext());

        listaProd = (ListView) findViewById(R.id.lista_productos);
        queue = queueutils.getInstance(this.getApplicationContext());
        items = new ArrayList<>();
        producto.injectContactsFromCloud(queue, items, this);
        adaptador = new adaptador_producto(this, items, queue.getImageLoader());
        listaProd.setAdapter(adaptador);


        producto.sendRequestPOST(queue, this);

    }

    public void refreshList(){
        if ( adaptador!= null ) {
            adaptador.notifyDataSetChanged();
        }

    }
    private ArrayList<producto> getArrayItems() {

        ArrayList<producto> listaprod = new ArrayList<producto>();
         listaprod.add(new producto("https://images.unsplash.com/photo-1562967914-01efa7e87832?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1352&q=80",
                        "Ensalada", "S/. 20.00", "Ensaladas , frescura y originalidad"));
        listaprod.add(new producto("https://images.unsplash.com/photo-1562967915-6ba607ff7d05?ixlib=rb-1.2.1&auto=format&fit=crop&w=1352&q=80",
                "Papas", "S/. 25.00", "Las mejores papas"));
        listaprod.add(new producto("https://images.unsplash.com/photo-1541832676-9b763b0239ab?ixlib=rb-1.2.1&auto=format&fit=crop&w=921&q=80",
                "refrescos", "S/. 35.00", "lo que sea"));
        listaprod.add(new producto("https://images.unsplash.com/photo-1562967914-01efa7e87832?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1352&q=80",
                "Plancha filete", "S/. 36.00", "lo que sea"));
        listaprod.add(new producto("https://images.unsplash.com/photo-1562967915-6ba607ff7d05?ixlib=rb-1.2.1&auto=format&fit=crop&w=1352&q=80",
                "Pollo a la napolitana", "S/. 27.00", "lo que sea"));
        listaprod.add(new producto("https://images.unsplash.com/photo-1541832676-9b763b0239ab?ixlib=rb-1.2.1&auto=format&fit=crop&w=921&q=80",
                "Sillao con barbacoa", "S/. 25.00", "lo que sea"));
        listaprod.add(new producto("https://images.unsplash.com/photo-1562967914-01efa7e87832?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1352&q=80",
                "Asado", "S/. 31.00", "lo que sea"));
        listaprod.add(new producto("https://images.unsplash.com/photo-1562967915-6ba607ff7d05?ixlib=rb-1.2.1&auto=format&fit=crop&w=1352&q=80",
                "ligth ensalada", "S/. 15.00", "lo que sea"));
        listaprod.add(new producto("https://images.unsplash.com/photo-1541832676-9b763b0239ab?ixlib=rb-1.2.1&auto=format&fit=crop&w=921&q=80",
                "pure", "S/. 10.00", "lo que sea"));


        return listaprod;

    }

}
