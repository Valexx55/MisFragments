package edu.val.misfragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity implements TabLayoutMediator.TabConfigurationStrategy {

    private ViewPager2 viewPager2;
    private AdapterFragmentos adapterFragmentos;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.viewPager2 = findViewById(R.id.viewpager);//Este es como el recyvler para las listas/es como el marco
        this.adapterFragmentos = new AdapterFragmentos(this);
        //le digo al viewPager: este adapter, te va a IR DANDO LOS FRAGMETS/pantallas
        this.viewPager2.setAdapter(this.adapterFragmentos);
        this.viewPager2.setOrientation(ViewPager2.ORIENTATION_VERTICAL);//ORIENTACIÓN HORIZONTAL POR DEFECTO

        this.tabLayout = findViewById(R.id.mitabl);
        //this.tabLayout.setupWithViewPager(viewPager2);

        //esto sería la forma de generar los tabs de forma dinámica
        //sin tener ninguno declarado en el layout
        //y así creamos tantos tabs como fragments
       /*

       int ntabs = this.adapterFragmentos.getItemCount();
        for (int i=0; i<ntabs;i++)
        {
            tabLayout.addTab(tabLayout.newTab().setText("Tab "+ i));
        }*/
        //
        new TabLayoutMediator(tabLayout, viewPager2, this).attach();

         }

         //CON ESTO PUEDO HACER QUE LA LISTA DE FRAGMENTS, SEA PARA EL USUARIO "CIRCULAR"
    public void siguiente(View view) {
        //Log.d("ETIQUETA_LOG", "siguiente");
        int n_fragment = this.viewPager2.getCurrentItem();
        Log.d("ETIQUETA_LOG", "siguiente "+ n_fragment);
        if ((n_fragment+1)==this.adapterFragmentos.getItemCount())
        {
            Log.d("ETIQUETA_LOG", "estoy en la última pantalla y el usuario le da al siguiente");
            this.viewPager2.setCurrentItem(0);
        } else {
            this.viewPager2.setCurrentItem(n_fragment+1);
        }

    }

    public void anterior(View view) {
        //Log.d("ETIQUETA_LOG", "anterior");
        int n_fragment = this.viewPager2.getCurrentItem();
        Log.d("ETIQUETA_LOG", "anterior "+ n_fragment);
        if ((n_fragment)==0)
        {
            Log.d("ETIQUETA_LOG", "estoy en la primera pantalla y el usuario le da al anterior");
            this.viewPager2.setCurrentItem(this.adapterFragmentos.getItemCount()-1);
        } else {
            this.viewPager2.setCurrentItem(n_fragment-1);
        }
    }

    //este método es invocado de forma obligatoria en el viewpager2
    //y se usa para ponerle un título al tab/pestaña
    //si no se pone, se queda blanco: obligatorio
    @Override
    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
        tab.setText("VISTA " + (position+1));
    }
}