package com.example.listviewplanetas;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView) findViewById(R.id.listaplanetas);
        String[] nombres = {"mercurio","venus","tierra","marte","jupiter","saturno","urano","neptuno"};
        String[] Descripcion = {"informacion 1","informacion 2","informacion 3","informacion 4","informacion 5","informacion 6","informacion 7","informacion 8"};
        Integer[] idimagenes = {R.drawable.mercurio,R.drawable.venus,R.drawable.tierra,R.drawable.marte,R.drawable.jupiter,R.drawable.saturno,R.drawable.urano,R.drawable.neptuno};
        AdapterListPlanet adaptador  = new AdapterListPlanet(this,nombres,Descripcion,idimagenes);
        listView.setAdapter(adaptador);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Seleccinaste : "+nombres[i],Toast.LENGTH_LONG).show();

            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "su inf es: "+Descripcion[i],Toast.LENGTH_LONG).show();

            }
        });
    }
}