package edu.val.misfragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MiFragmento2 extends Fragment {

    //en este método es donde se infla el fragment
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragment = null;

            fragment = inflater.inflate(R.layout.fragment_deslizante2, container, false);

        return fragment;
    }
}
