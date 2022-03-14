package com.example.listviewplanetas;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Planetas extends AppCompatActivity {

    private TextView NombrePlaneta;
    private TextView DescripcionPlaneta;
    private ImageView ImagenPlaneta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planetas);

        NombrePlaneta = (TextView) findViewById(R.id.NombrePlaneta);
        DescripcionPlaneta = (TextView) findViewById(R.id.DescripcionPlaneta);
        ImagenPlaneta = (ImageView) findViewById(R.id.ImagenPlaneta);

        String description = getIntent().getStringExtra("DESC");
        String name = getIntent().getStringExtra("NAME");

        NombrePlaneta.setText(name);
        DescripcionPlaneta.setText(description);
    }
}
