package com.example.rafael.sibasket;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PrincipalSibasket extends AppCompatActivity {
    Button boton1;
    Button boton2;
    Button boton3;
    Button boton1b;
    Button boton2b;
    Button boton3b;
    TextView marcador1;
    TextView marcador2;
    Button botonFaltas1;
    TextView faltas1;
    Button botonFaltas2;
    TextView faltas2;
    Button botonBajarUno;
    Button botonBajarUnoB;
    Button botonReset;
    String valor1;
    String valor2;
    String valor3;
    String valor4;
    int numero1;
    int numero2;
    int numero3;
    int numero4;
    AlertDialog.Builder alertReset;
    TextView equipoLocal;
    TextView equipoVisitante;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        boton1 = (Button) findViewById(R.id.btn1);
        boton2 = (Button) findViewById(R.id.btn2);
        boton3 = (Button) findViewById(R.id.btn3);
        boton1b = (Button) findViewById(R.id.btn1b);
        boton2b = (Button) findViewById(R.id.btn2b);
        boton3b = (Button) findViewById(R.id.btn3b);
        botonFaltas1 = (Button) findViewById(R.id.btnFaltas1);
        botonBajarUno = (Button) findViewById(R.id.btnBajarUno);
        botonFaltas2 = (Button) findViewById(R.id.btnFaltas2);
        botonBajarUnoB = (Button) findViewById(R.id.btnBajarUnoB);
        marcador1 = (TextView) findViewById(R.id.marcador1);
        marcador2 = (TextView) findViewById(R.id.marcador2);
        faltas1 = (TextView) findViewById(R.id.faltas1);
        faltas2 = (TextView) findViewById(R.id.faltas2);
        alertReset = new AlertDialog.Builder(this);
        numero1 = Integer.parseInt(marcador1.getText().toString());
        numero2 = Integer.parseInt(marcador2.getText().toString());
        numero3 = Integer.parseInt(faltas1.getText().toString());
        numero4 = Integer.parseInt(faltas2.getText().toString());
        botonReset = (Button) findViewById(R.id.btnReset);

        equipoLocal = (TextView)findViewById(R.id.editTextLocal);
        equipoVisitante = (TextView)findViewById(R.id.editTextVisitante);
        Bundle bundle = this.getIntent().getExtras();
        equipoLocal.setText(bundle.getString("local"));
        equipoVisitante.setText(bundle.getString("visitante"));

        boton1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                String valor = marcador1.getText().toString();
                int numero = Integer.parseInt(valor);
                numero = numero + 1;
                valor = String.valueOf(numero);
                marcador1.setText(valor);
                mostrar(1);
            }
        });

        boton2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                String valor = marcador1.getText().toString();
                int numero = Integer.parseInt(valor);
                numero = numero + 2;
                valor = String.valueOf(numero);
                marcador1.setText(valor);
                mostrar(2);
            }
        });

        boton3.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                String valor = marcador1.getText().toString();
                int numero = Integer.parseInt(valor);
                numero = numero + 3;
                valor = String.valueOf(numero);
                marcador1.setText(valor);
                mostrar(3);
            }
        });

        boton1b.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                String valor = marcador2.getText().toString();
                int numero = Integer.parseInt(valor);
                numero = numero + 1;
                valor = String.valueOf(numero);
                marcador2.setText(valor);
                mostrar(1);
            }
        });

        boton2b.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                String valor = marcador2.getText().toString();
                int numero = Integer.parseInt(valor);
                numero = numero + 2;
                valor = String.valueOf(numero);
                marcador2.setText(valor);
                mostrar(2);
            }
        });

        boton3b.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                String valor = marcador2.getText().toString();
                int numero = Integer.parseInt(valor);
                numero = numero + 3;
                valor = String.valueOf(numero);
                marcador2.setText(valor);
                mostrar(3);
            }
        });

        botonFaltas1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                String valor = faltas1.getText().toString();
                int numero = Integer.parseInt(valor);
                if(numero < 4){
                    numero = numero + 1;
                }
                else if(numero == 4){
                    numero = 0;
                    mostrarExpulsion("Equipo Local: TIROS LIBRES!!");
                }
                else {
                    numero = 1;
                }
                valor = String.valueOf(numero);
                faltas1.setText(valor);
            }
        });

        botonBajarUno.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                String valor = marcador1.getText().toString();
                int numero = Integer.parseInt(valor);
                if (numero > 0) {
                    numero = numero - 1;
                    valor = String.valueOf(numero);
                    marcador1.setText(valor);
                }
            }
        });

        botonFaltas2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                String valor = faltas2.getText().toString();
                int numero = Integer.parseInt(valor);
                if(numero < 4){
                    numero = numero + 1;
                }
                else if(numero == 4){
                    numero = 0;
                    mostrarExpulsion("Equipo Visitante: TIROS LIBRES!!");
                }
                else {
                    numero = 1;
                }
                valor = String.valueOf(numero);
                faltas2.setText(valor);
            }
        });

        botonBajarUnoB.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                String valor = marcador2.getText().toString();
                int numero = Integer.parseInt(valor);
                if (numero > 0) {
                    numero = numero - 1;
                    valor = String.valueOf(numero);
                    marcador2.setText(valor);
                }
            }
        });

        botonReset.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                numero1 = Integer.parseInt(marcador1.getText().toString());
                numero2 = Integer.parseInt(marcador2.getText().toString());
                if(numero1 != 0 || numero2 != 0){
                    alertReset.setTitle(R.string.app_name);
                    alertReset.setMessage("Desea poner a cero los marcadores?");
                    alertReset.setCancelable(false);
                    alertReset.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss();
                            reseteo();
                        }
                    });
                    alertReset.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss();
                        }
                    });
                    AlertDialog alert = alertReset.create();
                    alert.show();
                }
            }
        });
    }

    private void mostrar(int puntos){
        Toast.makeText(this, "Canasta!!: +" + puntos, Toast.LENGTH_LONG).show();
    }

    private void mostrarExpulsion(String cadena){
        Toast.makeText(this, "" + cadena, Toast.LENGTH_LONG).show();
    }

    private void reseteo(){
        numero1 = numero2 = numero3 = numero4 = 0;
        valor1 = String.valueOf(numero1);
        valor2 = String.valueOf(numero2);
        valor3 = String.valueOf(numero3);
        valor4 = String.valueOf(numero4);
        marcador1.setText(valor1);
        marcador2.setText(valor2);
        faltas1.setText(valor3);
        faltas2.setText(valor4);
    }
}

