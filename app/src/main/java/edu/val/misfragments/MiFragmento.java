package edu.val.misfragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MiFragmento extends Fragment {

    //en este método es donde se infla el fragment
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragment = null;

            fragment = inflater.inflate(R.layout.fragment_deslizante, container, false);
            Bundle bundle = getArguments();//obntego el bundle que me han pasado
            int n = bundle.getInt("VALOR");
            TextView textView = fragment.findViewById(R.id.texto_fragment); //textview dentro del fragment del layout
            textView.setText("VISTA " + n);
            Log.d("ETIQUETA_LOG", "FRAGMENT CREADO NUMERO "+n );

        return fragment;
    }
}
