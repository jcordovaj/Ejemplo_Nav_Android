package com.ejemplos.android_nav_paso_a_paso;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Musica extends Fragment {

    private TextView text_1;

    public Musica() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_musica, container, false);

        text_1 = view.findViewById(R.id.textView);

        MusicaArgs parametros = MusicaArgs.fromBundle(getArguments());
        int num1 = parametros.getNumero1();
        int num2 = parametros.getNumero2();
        int suma = num1 + num2;

        text_1.setText("La suma es:" + suma);

        return view;
    }
}