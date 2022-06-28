package edu.val.misfragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterFragmentos extends FragmentStateAdapter {

    private int [] array_datos = {1, 2, 3};

    public AdapterFragmentos(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = null;

            fragment = new MiFragmento();

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 8;//array_datos.length;//voy a dibujar, 3 pantallas
    }
}
