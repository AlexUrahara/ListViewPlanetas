package com.example.listviewplanetas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listaplanetas);
        String[] nombres = {" Mercurio", " Venus", " Tierra", " Marte", " Jupiter", " Saturno", " Urano", " Neptuno"};
        String[] breve = {"El cuerpo del planeta es rocoso y se caracteriza por la presencia de cráteres, resultado de los múltiples impactos de cuerpos celestes de menor tamaño. ",
                "Venus es un planeta rocoso con un tamaño y composición similar a la Tierra, a excepción de su atmósfera, compuesta por gases tóxicos. Por otra parte, su núcleo es de níquel y hierro.",
                "La Tierra es el tercer planeta orbitando alrededor del Sol. Su composición terrestre, la presencia de agua y una atmósfera compuesta por oxígeno, nitrógeno y vapor de agua, hicieron posible que se generaran las condiciones para la vida.",
                "Marte es el cuarto planeta orbitando alrededor del Sol. Es conocido también como “el planeta rojo” debido al color de su superficie",
                "Es el planeta más grande del sistema solar y el segundo cuerpo celeste más grande del sistema, después del Sol",
                "Conocido por los siete anillos que lo rodean, Saturno también se caracteriza por la presencia de polos achatados producidos por su baja gravedad y rápido movimiento de rotación.",
                "Urano es un planeta gaseoso compuesto por gas metano en mayor proporción, seguido de hidrógeno y helio.", "Es el planeta más lejano del sistema solar y el cuarto con respecto a su tamaño. Junto a Júpiter y Urano conforman el grupo de planetas gaseosos."};

        String[] descripcion = {
                "Se conoce como el “planeta de hierro” debido a que su composición es rica en este elemento químico en al menos un 70%. El porcentaje restante corresponde a elementos como helio, calcio,sodio, oxígeno y magnesio.\n" + "\n" + "El cuerpo del planeta es rocoso y se caracteriza por la presencia de cráteres, resultado de los múltiples impactos de cuerpos celestes de menor tamaño.",
                "Venus es un planeta rocoso con un tamaño y composición similar a la Tierra, a excepción de su atmósfera, compuesta por gases tóxicos. Por otra parte, su núcleo es de níquel y hierro.\n" + "\n" + "El planeta Venus carece de agua, pero estudios realizados por la NASA y divulgados en 2019 concluyeron que hasta hace 700 millones de años sí tuvo agua y una atmósfera estable con condiciones para el desarrollo de vida orgánica.\n" + "\n" + "Debido a estas condiciones, Venus es un planeta candidato para la terraformación. Se trata de un proceso teórico de creación de condiciones óptimas para la vida, generadas con complejos sistemas de ingeniería.",
                "La Tierra es el tercer planeta orbitando alrededor del Sol. Su composición terrestre, la presencia de agua y una atmósfera compuesta por oxígeno, nitrógeno y vapor de agua (entre otros componentes), hicieron posible que se generaran las condiciones para la vida.\n" + "\n" + "Otra características del planeta Tierra es la existencia de una capa de ozono que protege a todas las formas de vida de la radiación solar. Esto, y la presencia de grandes masas de agua en estado líquido que conforman un 70% de la composición del planeta, hacen de la Tierra el único planeta habitable, hasta ahora.\n" + "\n" + "Por otra parte, la Tierra cuenta con su propio satélite natural, la Luna.",
                "Marte es el cuarto planeta orbitando alrededor del Sol. Es conocido también como “el planeta rojo” debido al color de su superficie, originado por la presencia de óxido de hierro. Su atmósfera es de dióxido de carbono y tiene dos satélites naturales: Fobos y Deimos.\n" + "\n" + "Aunque durante mucho tiempo Marte fue considerado un lugar inhabitable,esa percepción ha cambiado en las últimas décadas, debido a las pruebas que sugieren la presencia de grandes masas de agua congelada bajo su superficie.\n" + "\n" + "Marte es, junto con Venus, el otro planeta considerado para la terraformación, es decir, para la creación de condiciones que permitan la vida.",
                "Es el planeta más grande del sistema solar y el segundo cuerpo celeste más grande del sistema, después del Sol. Júpiter tiene una composición gaseosa en la que el hidrógeno y el helio son los componentes principales.\n" + "\n" + "En su estructura interna, se especula que Júpiter contiene hidrógeno en estado líquido y un núcleo rocoso.",
                "Conocido por los siete anillos que lo rodean, Saturno también se caracteriza por la presencia de polos achatados producidos por su baja gravedad y rápido movimiento de rotación.\n" + "\n" + "La atmósfera de Saturno está compuesta por un 96% de hidrógeno, mientras que el porcentaje restante es helio. Se especula que en su composición interna hay material rocoso cubierto por una capa de hidrógeno líquido.\n" + "\n" + "Como dato curioso, la temperatura de Saturno duplica a del Sol, llegando a los 11726.85 °C; mientras que la temperatura del Sol es de 5505 °C.",
                "Urano es un planeta gaseoso compuesto por gas metano en mayor proporción, seguido de hidrógeno y helio. Es el tercer planeta en cuanto a tamaño y el séptimo con respecto a su órbita del Sol.\n" + "\n" + "Urano tiene una temperatura de -224 °C, lo cual lo convierte en el planeta con la atmósfera más fría del sistema solar. Además, tiene una serie de anillos que lo rodean pero a diferencia de Saturno, no son tan visibles y se ven como si estuviesen orbitando al planeta de manera vertical.\n" + "\n" + "Sin embargo, esta configuración de los anillos de Urano se trata de un efecto generado por su inclinación, que hace que sus polos se vean en el lugar que le corresponde al ecuador.",
                "Es el planeta más lejano del sistema solar y el cuarto con respecto a su tamaño. Junto a Júpiter y Urano conforman el grupo de planetas gaseosos, ya que su atmósfera se compone principalmente de hidrógeno, helio y rastros de hidrocarburos. Su color azul característico de se debe al metano, mientras que su interior es rocoso y helado.\n" + "\n" + "Aunque es un planeta con temperaturas muy bajas (-218°C), se plantea la existencia de una fuente interna de energía que hace que Urano genere calor."};
        Integer[] idimagenes = {R.drawable.mercurio, R.drawable.venus, R.drawable.tierra, R.drawable.marte, R.drawable.jupiter, R.drawable.saturno, R.drawable.urano, R.drawable.neptuno};
        AdapterListPlanet adaptador = new AdapterListPlanet(this, nombres, breve, descripcion, idimagenes);
        listView.setAdapter(adaptador);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(MainActivity.this, Planetas.class);
                intent.putExtra("DESC", descripcion[position]);
                intent.putExtra("NAME", nombres[position]);
                intent.putExtra("IMAGE", idimagenes[position]);
                startActivity(intent);

            }
        });
    }
}