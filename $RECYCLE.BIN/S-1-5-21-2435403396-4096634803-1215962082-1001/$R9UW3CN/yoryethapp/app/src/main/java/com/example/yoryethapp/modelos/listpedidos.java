package com.example.yoryethapp.modelos;

import android.media.Image;
import android.provider.ContactsContract;

import java.util.ArrayList;

public class listpedidos {
    public String Usuario;
    public String Nombres;
    public String Imagenes;
    public Double Costo;
    public String Direccion;
    public String Telefono;
    public Integer Cantidad;

    public listpedidos(String _Usuario, String _Nombres, String _Imagenes, Double _Costo, String _Direccion, String _Telefono, Integer _Cantidad){
        this.Nombres = _Nombres;
        this.Imagenes = _Imagenes;
        this.Costo = _Costo;
        this.Direccion = _Direccion;
        this.Telefono = _Telefono;
        this.Cantidad = _Cantidad;
        this.Usuario = _Usuario;
    }
    public static ArrayList<listpedidos> getData() {
        ArrayList<listpedidos> listpedidos=new ArrayList<>();
        listpedidos.add(new listpedidos("familiares", "pizaa", "https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-4.jpg" , 20.00, "pilcomayo", "963963963",2));
        return listpedidos;
    }
}
