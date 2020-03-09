package com.example.fertinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText user;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = (EditText) findViewById(R.id.editText);
        pass = (EditText) findViewById(R.id.editText2);
    }


    public void acceder(View v){
        if(pass.getText().toString().isEmpty() && user.getText().toString().isEmpty()){

            pass.setError("Introduzca contraseña");
            user.setError("Introduzca usuario");
        }
        else if(pass.getText().toString().isEmpty()){
            pass.setError("Introduzca contraseña");
        }
        else if(user.getText().toString().isEmpty()){
            user.setError("Introduzca usuario");
        }
        else{
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
            finish();
        }


    }
    public void registro(View v){
        Toast.makeText(this,"registro",Toast.LENGTH_LONG).show();




    }
}
