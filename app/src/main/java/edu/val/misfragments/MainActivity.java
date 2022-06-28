package edu.val.misfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private AdapterFragmentos adapterFragmentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.viewPager2 = findViewById(R.id.viewpager);//Este es como el recyvler para las listas/es como el marco
        this.adapterFragmentos = new AdapterFragmentos(this);
        //le digo al viewPager: este adapter, te va a IR DANDO LOS FRAGMETS/pantallas
        this.viewPager2.setAdapter(this.adapterFragmentos);
        //TODO mirar cómo hacer circular el ViewPager

         }
}