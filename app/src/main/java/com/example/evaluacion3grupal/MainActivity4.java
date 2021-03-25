package com.example.evaluacion3grupal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    private String recibirnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        imageView = (ImageView)findViewById(R.id.imageView_SobrePersona1);
        textView = (TextView)findViewById(R.id.textView5);

        recibirnombre = getIntent().getStringExtra("position");


        if(recibirnombre != null){
            textView.setText(recibirnombre);
        }


    }
}