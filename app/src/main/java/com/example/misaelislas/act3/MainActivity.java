package com.example.misaelislas.act3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NOMBRE = "com.example.apliccation.example.EXTRA_NOMBRE";
    public static final String EXTRA_APELLIDO = "com.example.apliccation.example.EXTRA_APELLIDO";
    public static final String EXTRA_EDAD = "com.example.apliccation.example.EXTRA_EDAD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAct2();
            }
        });
    }

    public void openAct2 () {
        EditText nombre = (EditText) findViewById(R.id.nombre);
        String enviarNombre = nombre.getText().toString();

        EditText apellido = (EditText) findViewById(R.id.apellido);
        String enviarApellido = apellido.getText().toString();

        EditText edad = (EditText) findViewById(R.id.edad);
        int enviarEdad = Integer.parseInt(edad.getText().toString());

        Intent intent = new Intent(this, Actividad2.class);
        intent.putExtra (EXTRA_NOMBRE, enviarNombre);
        intent.putExtra(EXTRA_APELLIDO, enviarApellido);
        intent.putExtra(EXTRA_EDAD, enviarEdad);
        startActivity(intent);

    }
}
