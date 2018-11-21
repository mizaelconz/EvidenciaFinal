package com.example.misaelislas.act3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.misaelislas.act3.MainActivity.*;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        Intent intent = getIntent();
        String nombre = intent.getStringExtra(EXTRA_NOMBRE);
        String apellido = intent.getStringExtra(EXTRA_APELLIDO);
        int edad = intent.getIntExtra(MainActivity.EXTRA_EDAD, 0);

        TextView enviarNombre = (TextView) findViewById(R.id.nombre);
        TextView enviarApellido = (TextView) findViewById(R.id.apellido);
        TextView enviarEdad = (TextView) findViewById(R.id.edad);

        enviarNombre.setText(nombre);
        enviarApellido.setText(apellido);
        enviarEdad.setText("" + edad);
    }
}
