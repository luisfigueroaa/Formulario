package com.example.datospersonales2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNombre, etApellido;
    Button btAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.etNombre);     //Encontrar el id de nombre
        etApellido = findViewById(R.id.etApellido); //Encontrar el id de apellido

        btAceptar = findViewById(R.id.btAceptar);   //Encontrar el id de button
    }

    //*ACCION DEL PROGRAMA*
    public void onClickAceptar(View view) {          //View view es para que se muestre en el activity_main

        /*EXTRAER EL VALOR DE NOMBRE Y TRANSFORMARLAS EN TIPO STRING*/
        String auxNombre = etNombre.getText().toString();
        String auxApellido = etApellido.getText().toString();
        if (!auxNombre.matches("") && !auxApellido.matches("")) {    //Si es distinto al vacio hacer esto:
            /*INTENTO DE IR AL LAYOUT GRACIAS*/
            Intent i = new Intent(this, Gracias.class);
            /*PONER EL VALOR*/
            i.putExtra("nombre", auxNombre);
            i.putExtra("apellido", auxApellido);
            startActivity(i);
        }
        else {
            /*APARECE EL MENSAJE ALGO*/
            Toast.makeText(getApplicationContext(), "Llene sus datos porfavor", Toast.LENGTH_SHORT).show(); //toast:para que aparezca un texto al hacer Click
        }
        }
    }
