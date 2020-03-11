package com.example.fertinfo.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import com.example.fertinfo.R;
import com.example.fertinfo.ui.infertilidad.InfertilidadFragment;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    ImageButton infert;
    ImageButton semino;
    ImageButton ahormo;
    ImageButton estudiogen;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        infert = root.findViewById(R.id.imageButton);
        infert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.nav_infertilidad);
            }
        });
        semino = root.findViewById(R.id.imageButton2);
        semino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.nav_seminograma);
            }
        });
        ahormo = root.findViewById(R.id.imageButton3);
        ahormo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.nav_hormonas);
            }
        });
        estudiogen = root.findViewById(R.id.imageButton1);
        estudiogen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.nav_genetica);
            }
        });
        return root;
    }

}