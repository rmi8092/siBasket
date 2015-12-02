package com.example.rafael.sibasket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button botonComenzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        botonComenzar = (Button) findViewById(R.id.btnComenzar);

        botonComenzar.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                EditText nombreEquipo1 = (EditText)findViewById(R.id.editEquipo1);
                EditText nombreEquipo2 = (EditText)findViewById(R.id.editEquipo2);
                Intent intent = new Intent(MainActivity.this, PrincipalSibasket.class);
                Bundle b = new Bundle();
                b.putString("local", nombreEquipo1.getText().toString());
                b.putString("visitante", nombreEquipo2.getText().toString());
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}
