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

/*Javier Aravena
//Carolina Diaz
//Pablo Jaramillo
//Nicolle Salinas
//Angel Zamorano*/


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private List<ModeloMain> listaMain = new ArrayList<>();
    AdapterJ adapterJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listview);

        listaMain.add(new ModeloMain("Inicio", R.drawable.restau));
        listaMain.add(new ModeloMain("Equipo", R.drawable.teamwork));
        listaMain.add(new ModeloMain("Platos", R.drawable.plato));
        listaMain.add(new ModeloMain("Menu", R.drawable.restau));
        listaMain.add(new ModeloMain("Base Datos", R.drawable.database));
        listaMain.add(new ModeloMain("Postres", R.drawable.postres));
        listaMain.add(new ModeloMain("Galeria", R.drawable.galeriafotos));

        //creacion adapter para usar layout personalizado y lista con datos.
        adapterJ = new AdapterJ(MainActivity.this,R.layout.layout_principal, listaMain);
        listView.setAdapter(adapterJ);

        //Metodo para ejecutar acciones al hacer Click en items
        listView.setOnItemClickListener(MainActivity.this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        switch (position){

            case 0:
                Toast.makeText(this,"Bienvenido ! ", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(this,"Boton apretado en posicion " + position, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                break;
            case 2:
                Toast.makeText(this,"En construccion.. ", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this,"En construccion.. ", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(this,"Hacia Base de Datos " + position, Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(this,Consultas.class);
                startActivity(intent4);
                break;
            case 5:
                Toast.makeText(this,"En construccion.. ", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                Toast.makeText(this,"Boton apretado en posicion " + position, Toast.LENGTH_SHORT).show();
                //Intent intent6 = new Intent(this, ActivityGaleria.class);
                //startActivity(intent6);
                break;

        }

    }
}