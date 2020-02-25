package com.example.fertinfo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapterAnalisis extends RecyclerView.Adapter<MyAdapterAnalisis.MyViewHolder>{


    private ArrayList<Analisis> mDataset = new ArrayList<>();

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView textView;
        public TextView textView2;
        public Button textView3;
        public MyViewHolder(View v) {
            super(v);
            textView= v.findViewById(R.id.textView2);
            textView2= v.findViewById(R.id.textView4);
            textView3= v.findViewById(R.id.button);

        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapterAnalisis(ArrayList<Analisis> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapterAnalisis.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        View v = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.myadapter, parent, false);

        MyViewHolder vh = new MyViewHolder(v);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"click",Toast.LENGTH_LONG).show();
            }
        });
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.textView.setText(mDataset.get(position).getNombre());
        holder.textView2.setText(mDataset.get(position).getFecha());
        holder.textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater= LayoutInflater.from(v.getContext());
                View view=inflater.inflate(R.layout.resultado_analisis, null);
                TextView result= view.findViewById(R.id.textView5);
                result.setText( mDataset.get(position).getDescrip());
                new AlertDialog.Builder(v.getContext())
                        .setView(view)
                        .setTitle("Resultados del analisis")

                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {


                            }
                        })

                        .show();
            }
        });


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
