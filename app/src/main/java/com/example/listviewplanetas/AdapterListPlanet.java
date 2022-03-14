package com.example.listviewplanetas;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class AdapterListPlanet extends ArrayAdapter<String> {
    private final Activity context;
    private final String[]  nombres;
    private final String[]  Descripcion;
    private final String[]  detalles;
    private final Integer[]  id_imagenes;

    public AdapterListPlanet(Activity context, String[]  nombres, String[] Descirpcion,String[] detalles, Integer[] id_images) {
        super(context,R.layout.list_items,nombres);
        this.context = context;
        this.nombres = nombres;
        this.Descripcion = Descirpcion;
        this.detalles = detalles;
        this.id_imagenes = id_images;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.list_items,null);
        TextView _nombre = (TextView) itemView.findViewById(R.id.nombre);
        TextView _descripcion = (TextView) itemView.findViewById(R.id.Descripcion);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.foto);
        _nombre.setText(nombres[position]);
        _descripcion.setText(Descripcion[position]);
        _imagen.setImageResource(id_imagenes[position]);
        return itemView;
    }
}
