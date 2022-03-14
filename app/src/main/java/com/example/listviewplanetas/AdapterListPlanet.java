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
    private final String[]  descripcion;
    private final String[]  breve;
    private final Integer[]  idimagenes;


    public AdapterListPlanet(Activity context, String[] nombres, String[] breve, String[] descripcion, Integer[] idimagenes) {
        super(context, R.layout.list_items, nombres);
        this.context = context;
        this.nombres = nombres;
        this.descripcion = descripcion;
        this.breve = breve;
        this.idimagenes = idimagenes;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.list_items, null);
        TextView _nombre = (TextView) itemView.findViewById(R.id.nombres);
        TextView _breve = (TextView) itemView.findViewById(R.id.breve);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.foto);
        _nombre.setText(nombres[position]);
        _breve.setText(breve[position]);
        _imagen.setImageResource(idimagenes[position]);
        return itemView;
    }
}
