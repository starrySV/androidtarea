package com.example.yoryethapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.yoryethapp.ListaPotajes;
import com.example.yoryethapp.R;

import java.util.List;



public class ProductAdapter extends ArrayAdapter<ListaPotajes> {

    Context context;

    private class ViewHolder {
        //NetworkImageView image;
        TextView Usuario;
        TextView Nombres;
        TextView Imagenes;
        TextView Costo;
        TextView Direccion;
        TextView Telefono;
        TextView Cantidad;


        private ViewHolder() {
        }
    }
    public ProductAdapter(Context context, List<ListaPotajes> items) {
        super(context, 0, items);
        this.context = context;
        //this.queue = _queue;
    }
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        final ListaPotajes rowItem = (ListaPotajes) getItem(position);
        LayoutInflater mInflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.adapter_product_items, null);
            holder = new ViewHolder();
            holder.Usuario = (TextView) convertView.findViewById(R.id.Usuario);
            holder.Nombres = (TextView) convertView.findViewById(R.id.Nombres);
            holder.Imagenes = (TextView) convertView.findViewById(R.id.Imagenes);
            holder.Costo= (TextView) convertView.findViewById(R.id.Costo);
            holder.Direccion = (TextView) convertView.findViewById(R.id.Direccion);
            holder.Telefono= (TextView) convertView.findViewById(R.id.Telefono);
            holder.Cantidad = (TextView) convertView.findViewById(R.id.Cantidad);
            // holder.category = (TextView) convertView.findViewById(R.id.category);
            // holder.btnAddToBag = (ImageButton) convertView.findViewById(R.id.btnAddToBag);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.Usuario.setText(rowItem.Usuario);
        holder.Nombres.setText(rowItem.Nombres);
        holder.Imagenes.setText(rowItem.Imagenes);
        holder.Costo.setText(rowItem.Costo);
        holder.Direccion.setText(rowItem.Direccion);
        holder.Telefono.setText(rowItem.Telefono);
        holder.Cantidad.setText(rowItem.Cantidad);
        //holder.category.setText(rowItem.getCategory());

        //if ( rowItem.getSmallImage() != null ) {
        //   holder.image.setImageUrl(
        //            rowItem.getSmallImage(), queue);
        //  }

        //  holder.btnAddToBag.setOnClickListener(new View.OnClickListener() {

        //@Override
        //public void onClick(View v) {
        //      ProductListActivity activity = (ProductListActivity) context;
        //        activity.selectProduct(position);

        //   }
        // });


//        holder.image.setImageBitmap(rowItem.getSmallBitMap());
        return convertView;
    }
}
