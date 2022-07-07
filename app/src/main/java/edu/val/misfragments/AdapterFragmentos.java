package edu.val.misfragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterFragmentos extends FragmentStateAdapter {

    //private int[] array_datos = {1, 2, 3, 4, 5, 6};
    private int[] array_datos = {1, 2, 3};

    public AdapterFragmentos(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = null;

        //TENEMOS 2 FORMAS DE TRABAJAR CON LOS FRAGMENTS
        //1 UN FRAGMENT DISTINTO CON SU LAYOUT, SEGÚN LA POSICIÓN (TIPO WASAP)
        //2 EL MISMO FRAGMENT RECICLADO MEDIANTE EL BUNDLE (TIPO GALERÍA)

        /*switch (position)
        {
            case 0: //instancia// el Fragment de Chats
                fragment = new MiFragmento();
                break;
            case 1: //instancia// el Fragment de Estados
                fragment = new MiFragmento1();
                break;
            case 2: //instancia el Fragment de llamadas
                fragment = new MiFragmento2();
                break;
        }*/

        fragment = new MiFragmento();
        Bundle bundle = new Bundle();
        int pos_array = this.array_datos[position];
        bundle.putInt("VALOR", pos_array);
        fragment.setArguments(bundle);//y el bundle que meto aquí, lo puedo obtener en el OncreateView con getArguments


        return fragment;
    }

    @Override
    public int getItemCount() {
        return array_datos.length;//array_datos.length;//voy a dibujar, 3 pantallas
    }
}
