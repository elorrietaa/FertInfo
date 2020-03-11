package com.example.fertinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class AnalisisActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter mAdapter;
    private ArrayList<Analisis> mDataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analisis);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Inicio");

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        //LEER JSON ANALISIS
        mDataset = new ArrayList<Analisis>();

        try {
            JSONArray jArray = new JSONArray(readJSONFromAsset());
            for (int i = 0; i < jArray.length(); ++i) {
                Analisis analisis=new Analisis();


                String nombre=jArray.getJSONObject(i).getString("nombre");
                String fecha=jArray.getJSONObject(i).getString("fecha");
                String descrip=jArray.getJSONObject(i).getString("descrip");
                analisis.setNombre(nombre);
                analisis.setFecha(fecha);
                analisis.setDescrip(descrip);
                mDataset.add(analisis);


            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        // specify an adapter (see also next example)
        mAdapter = new MyAdapterAnalisis(mDataset);
        recyclerView.setAdapter(mAdapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }


    public String readJSONFromAsset() {
        String json = null;
        String jason = "analisis.json";
        try {
            InputStream is = getAssets().open(jason);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    public void pedirCita(View v){

        Intent i = new Intent(this,WebActivity.class);
        startActivity(i);

    }

}
