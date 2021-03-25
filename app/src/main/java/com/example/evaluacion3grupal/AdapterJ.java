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


//Adapter 1er layout personalizado
public class AdapterJ extends ArrayAdapter<ModeloMain> {

    private List<ModeloMain> lista;
    private Context context;
    private int resourceLayout;

    public AdapterJ(@NonNull Context context, int resource, List<ModeloMain> objects) {
        super(context, resource, objects);
        this.lista = objects;
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
        ModeloMain modeloMain = lista.get(position);


        ImageView imagen = view.findViewById(R.id.imageView);
        imagen.setImageResource(modeloMain.getImageID());

        TextView textView = view.findViewById(R.id.textView);
        textView.setText(modeloMain.getTitulo());

        return view;
    }
}