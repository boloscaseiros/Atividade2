package com.example.atividade2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class Resultado extends AppCompatActivity {
    EditText etResultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        etResultado2=findViewById(R.id.etResultado2);

        Intent it = getIntent();

        String resultado = it.getStringExtra("resultado");

        etResultado2.setText(resultado);

    }
}