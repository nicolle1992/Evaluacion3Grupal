package com.example.evaluacion3grupal;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Consultas extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private ListView listViewBD;
    private AdminSQLite adminSQLite;
    private SQLiteDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultas);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        listViewBD = (ListView) findViewById(R.id.listviewBD);
        adminSQLite = new AdminSQLite(Consultas.this);

    }

    public void limpiar(View view) {
        et1.setText(null);
        et2.setText(null);
        et3.setText(null);
    }

    public void insertar(View view) {
        adminSQLite.insertarDatos(et1.getText().toString(), et2.getText().toString(), et3.getText().toString());
        adminSQLite.abrirBaseDeDatos();
        limpiar(view);
        Toast.makeText(this, "Datos Ingresados", Toast.LENGTH_SHORT).show();
    }

    public void modificar(View view) {
        Producto producto = new Producto();
        producto.setCodigo(et1.getText().toString());
        producto.setNombre(et2.getText().toString());
        producto.setCantidad(et3.getText().toString());
        adminSQLite.modificarDatos(producto);
        limpiar(view);
        Toast.makeText(this, "Datos Modificados", Toast.LENGTH_SHORT).show();
    }

    public void eliminar(View view) {
        Producto producto = new Producto();
        producto.setCodigo(et1.getText().toString());
        adminSQLite.eliminarDatos(producto);
        limpiar(view);
        Toast.makeText(this, "Datos Borrados !", Toast.LENGTH_SHORT).show();
    }


    public void seleccionar(View view) {

        ArrayList<Producto> productos = adminSQLite.seleccionDatos();
        ArrayList<String> productosString = new ArrayList<String>();

        for (int i = 0; i < productos.size(); i++) {
            productosString.add(productos.get(i).getCodigo() + "       " + productos.get(i).getNombre() + "       " + productos.get(i).getCantidad());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, productosString);
        listViewBD.setAdapter(adapter);
        Toast.makeText(this, "Mostrando Datos", Toast.LENGTH_SHORT).show();
    }
}