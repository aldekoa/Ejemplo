package com.example.ejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity<rs, i> extends AppCompatActivity {
    RelativeLayout relativeLayout;
    EditText usuario, contrasena;
    Button botonlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = findViewById(R.id.correo);
        contrasena = findViewById(R.id.contrasena);
        botonlogin = findViewById(R.id.botonlogin);

        botonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Pagina_principal.class);
                startActivity(intent);
            }
        });



    }
}