package com.ejemplos.android_nav_paso_a_paso;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Favoritos extends Fragment {

    private EditText text_1, text_2;
    private Button btn;



    public Favoritos() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favoritos, container, false);

        text_1 = view.findViewById(R.id.text1);
        text_2 = view.findViewById(R.id.text2);
        btn = view.findViewById(R.id.button);

        btn.setOnClickListener( v ->{
            int num1 = Integer.parseInt(text_1.getText().toString());
            int num2 = Integer.parseInt(text_2.getText().toString());

            FavoritosDirections.ActionFavoritosToMusica2 action =
                    FavoritosDirections.actionFavoritosToMusica2();
            action.setNumero1(num1);
            action.setNumero2(num2);

            NavHostFragment.findNavController(Favoritos.this).navigate(action);


        });


        return view;
    }
}