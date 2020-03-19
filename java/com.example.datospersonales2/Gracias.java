package com.example.datospersonales2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Gracias extends Activity {
    TextView tvGracias;
    Button btRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gracias);   //Enlazarse a el LAYOUT -> gracias

        tvGracias = findViewById(R.id.tvGracias);
        btRegresar = findViewById(R.id.btRegresar);

        Bundle extras = getIntent().getExtras();
        String xnombre = extras.getString("nombre");
        String xapellido = extras.getString("apellido");

        tvGracias.setText("Gracias\n" + xnombre + " "+ xapellido  + "\n por usar nuestro servicio.");
    }
    /*PROGRAMAR EL BOTON PARA REGRESAR*/
    public void onClickBtnRegresar(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
