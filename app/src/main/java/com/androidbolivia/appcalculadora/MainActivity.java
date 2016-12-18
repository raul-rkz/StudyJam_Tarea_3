package com.androidbolivia.appcalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btncoma;
    private Button btncero;
    private Button btnigual;
    private Button btnuno;
    private Button btndos;
    private Button btntres;
    private Button btncuatro;
    private Button btncinco;
    private Button btnseis;
    private Button btnsiete;
    private Button btnocho;
    private Button btnnueve;
    private Button btnce;
    private Button btndivision;
    private Button btnmultiplicacion;
    private Button btnresta;
    private Button btnsuma;
    private EditText etproces;
    private EditText etconcat;
    private double num1;
    private double num2;
    private double resul;
    private String operando;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        btncoma = (Button) findViewById(R.id.btncoma);
        btncero = (Button) findViewById(R.id.btncero);
        btnigual = (Button) findViewById(R.id.btnigual);
        btnuno = (Button) findViewById(R.id.btnuno);
        btndos = (Button) findViewById(R.id.btndos);
        btntres = (Button) findViewById(R.id.btntres);
        btncuatro = (Button) findViewById(R.id.btncuatro);
        btncinco = (Button) findViewById(R.id.btncinco);
        btnseis = (Button) findViewById(R.id.btnseis);
        btnsiete= (Button) findViewById(R.id.btnsiete);
        btnocho = (Button) findViewById(R.id.btnocho);
        btnnueve = (Button) findViewById(R.id.btnnueve);
        btnce = (Button) findViewById(R.id.btnce);
        btndivision = (Button) findViewById(R.id.btndivision);
        btnmultiplicacion= (Button) findViewById(R.id.btnmultiplicacion);
        btnresta = (Button) findViewById(R.id.btnresta);
        btnsuma = (Button) findViewById(R.id.btnsuma);
        etproces = (EditText) findViewById(R.id.etproces);

        btncoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcat = (EditText) findViewById(R.id.etproces);
                etproces.setText(etconcat.getText().toString()+".");
            }
        });


        btncero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcat = (EditText) findViewById(R.id.etproces);
                etproces.setText(etconcat.getText().toString()+"0");
            }
        });

        btnuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcat = (EditText) findViewById(R.id.etproces);
                etproces.setText(etconcat.getText().toString()+"1");
            }
        });

        btndos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcat = (EditText) findViewById(R.id.etproces);
                etproces.setText(etconcat.getText().toString()+"2");
            }
        });

        btntres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcat = (EditText) findViewById(R.id.etproces);
                etproces.setText(etconcat.getText().toString()+"3");
            }
        });

        btncuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcat = (EditText) findViewById(R.id.etproces);
                etproces.setText(etconcat.getText().toString()+"4");
            }
        });

        btncinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcat = (EditText) findViewById(R.id.etproces);
                etproces.setText(etconcat.getText().toString()+"5");
            }
        });

        btnseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcat = (EditText) findViewById(R.id.etproces);
                etproces.setText(etconcat.getText().toString()+"6");
            }
        });

        btnsiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcat = (EditText) findViewById(R.id.etproces);
                etproces.setText(etconcat.getText().toString()+"7");
            }
        });

        btnocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcat = (EditText) findViewById(R.id.etproces);
                etproces.setText(etconcat.getText().toString()+"8");
            }
        });

        btnnueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcat = (EditText) findViewById(R.id.etproces);
                etproces.setText(etconcat.getText().toString()+"9");
            }
        });

        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcat = (EditText) findViewById(R.id.etproces);
                num2 = Double.parseDouble(etconcat.getText().toString());
                if (operando.equals("+")){
                    etproces.setText("");
                    resul = num1 + num2;
                }
                if (operando.equals("-")){
                    etproces.setText("");
                    resul = num1 - num2;
                }
                if (operando.equals("*")){
                    etproces.setText("");
                    resul = num1 * num2;
                }
                if (operando.equals("/")){
                    etproces.setText("");
                    if (num2 != 0){
                        resul = num1 / num2;
                    }else {
                        etproces.setText("Infinito");
                    }
                }
                etproces.setText(String.valueOf(resul));
            }
        });
        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operando = "+";
                etconcat = (EditText) findViewById(R.id.etproces);
                num1 = Double.parseDouble(etconcat.getText().toString());
                etproces.setText("");
            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operando = "-";
                etconcat = (EditText) findViewById(R.id.etproces);
                num1 = Double.parseDouble(etconcat.getText().toString());
                etproces.setText("");
            }
        });
        btnmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operando = "*";
                etconcat = (EditText) findViewById(R.id.etproces);
                num1 = Double.parseDouble(etconcat.getText().toString());
                etproces.setText("");
            }
        });
        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operando = "/";
                etconcat = (EditText) findViewById(R.id.etproces);
                num1 = Double.parseDouble(etconcat.getText().toString());
                etproces.setText("");
            }
        });

        btnce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = 0;
                num2 = 0;
                etproces.setText("");
            }
        });
    }
}
