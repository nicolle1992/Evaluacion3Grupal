package com.example.evaluacion3grupal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listview2;
    private List<ModeloMain2> listamodelo2 = new ArrayList<>();
    private AdapterJJ adapterJJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listview2 = (ListView) findViewById(R.id.listview2);

        listamodelo2.add(new ModeloMain2(R.drawable.user1, "John Doe", R.drawable.arrow2));
        listamodelo2.add(new ModeloMain2(R.drawable.user2, "Bruce Wayne", R.drawable.arrow2));
        listamodelo2.add(new ModeloMain2(R.drawable.user3, "Diana Prince", R.drawable.arrow2));
        listamodelo2.add(new ModeloMain2(R.drawable.user4, "John Doe", R.drawable.arrow2));
        listamodelo2.add(new ModeloMain2(R.drawable.user5, "Bruce Wayne", R.drawable.arrow2));
        listamodelo2.add(new ModeloMain2(R.drawable.user1, "Diana Prince", R.drawable.arrow2));
        listamodelo2.add(new ModeloMain2(R.drawable.user2, "John Doe", R.drawable.arrow2));
        listamodelo2.add(new ModeloMain2(R.drawable.user3, "Bruce Wayne", R.drawable.arrow2));
        listamodelo2.add(new ModeloMain2(R.drawable.user4, "Diana Prince", R.drawable.arrow2));

        adapterJJ = new AdapterJJ(MainActivity2.this, R.layout.layout_secundario, listamodelo2);
        listview2.setAdapter(adapterJJ);

        listview2.setOnItemClickListener(MainActivity2.this);
    }

    //Aca estamos pasando a la activity detalle de cada empleado y usamos un intent para pasar el nombre de una activity a otra a traves del putextra
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        switch (position) {

            case 0:
                Toast.makeText(this, "Redirigiendo hacia.. " + listamodelo2.get(position).getNombrePersona(), Toast.LENGTH_SHORT).show();
                Intent intent0 = new Intent(MainActivity2.this, MainActivity4.class);
                intent0.putExtra("position", listamodelo2.get(position).getNombrePersona());
                startActivity(intent0);
                break;

            case 1:
                Toast.makeText(this, "Redirigiendo hacia " + listamodelo2.get(position).getNombrePersona(), Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(MainActivity2.this, MainActivity3.class);
                intent1.putExtra("position", listamodelo2.get(position).getNombrePersona());
                startActivity(intent1);
                break;
            case 2:
                Toast.makeText(this, "Perfil en Construccion.. " + listamodelo2.get(position).getNombrePersona(), Toast.LENGTH_SHORT).show();
                break;

            case 3:
                Toast.makeText(this, "Perfil en Construccion.. " + listamodelo2.get(position).getNombrePersona(), Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(this, "Perfil en Construccion.. " + listamodelo2.get(position).getNombrePersona(), Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(this, "Perfil en Construccion.. " + listamodelo2.get(position).getNombrePersona(), Toast.LENGTH_SHORT).show();
                break;
            case 6:
                Toast.makeText(this, "Perfil en Construccion.. " + listamodelo2.get(position).getNombrePersona(), Toast.LENGTH_SHORT).show();
                break;
        }

    }

}
