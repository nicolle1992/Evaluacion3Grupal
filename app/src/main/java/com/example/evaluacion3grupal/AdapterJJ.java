package com.example.evaluacion3grupal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;


//Adapter 2do layout personalizado
public class AdapterJJ extends ArrayAdapter<ModeloMain2> {

    private List<ModeloMain2> lista2;
    private Context context;
    private int resourceLayout;

    //COnstructor
    public AdapterJJ(@NonNull Context context, int resource, List<ModeloMain2> objects) {
        super(context, resource, objects);
        this.lista2 = objects;
        this.context = context;
        this.resourceLayout = resource;
    }

    //retorna vista inflada de cada elemento que viene de cada row en el listview
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null){
            view = LayoutInflater.from(context).inflate(resourceLayout,null);
        }

        ModeloMain2 modeloMain2 = lista2.get(position);


        ImageView imagen = view.findViewById(R.id.imageview_persona);
        imagen.setImageResource(modeloMain2.getImagenPersona());

        TextView textView = view.findViewById(R.id.tv_nombre);
        textView.setText(modeloMain2.getNombrePersona());

        ImageView imagen1 = view.findViewById(R.id.imageview_flecha);
        imagen1.setImageResource(modeloMain2.getImagenflecha());

        return view;
    }


}