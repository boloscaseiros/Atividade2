package com.example.atividade2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bSomar;
    EditText etValor1;
    EditText etValor2;
    TextView tvResultado;
    Button bSubtrair;
    Button bDivisao;
    Button bMultiplicacao;
    Button btResult;

    double resultado=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bSomar = findViewById(R.id.bSoma);
        etValor1 = findViewById(R.id.edValor1);
        etValor2 = findViewById(R.id.edValor2);
        tvResultado = findViewById(R.id.tvResultado);
        bSubtrair = findViewById(R.id.bSubtrair);
        bDivisao = findViewById(R.id.bDivisao);
        bMultiplicacao = findViewById(R.id.bMultiplicacao);
        btResult = findViewById(R.id.btResult);
        bSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 resultado = Double.parseDouble(etValor1.getText().toString()) + Double.parseDouble(etValor2.getText().toString());
                tvResultado.setText(String.valueOf(resultado));


            }
        });
        bSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 resultado = Double.parseDouble(etValor1.getText().toString()) - Double.parseDouble(etValor2.getText().toString());
                tvResultado.setText(String.valueOf(resultado));
            }
        });
        bDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado = Double.parseDouble(etValor1.getText().toString()) / Double.parseDouble(etValor2.getText().toString());
                tvResultado.setText(String.valueOf(resultado));
            }
        });
        bMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado = Double.parseDouble(etValor1.getText().toString()) * Double.parseDouble(etValor2.getText().toString());
                tvResultado.setText(String.valueOf(resultado));

            }
        });
        btResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, Resultado.class);
                in.putExtra("resultado", String.valueOf(resultado));
                startActivity(in);
            }
        });
    }
}