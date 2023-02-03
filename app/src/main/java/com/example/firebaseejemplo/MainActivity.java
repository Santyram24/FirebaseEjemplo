package com.example.firebaseejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button bt_login,btn_registrar,btn_recuperar;
    EditText et_mail,et_contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_mail=findViewById(R.id.EditTextEmail);
        et_contraseña=findViewById(R.id.EditTextPassword);

        bt_login=findViewById(R.id.buttonIniciar);
        btn_recuperar=findViewById(R.id.BottonRecuperar);
        btn_registrar=findViewById(R.id.buttonRegistrar);

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Registrar.class);
                startActivity(intent);

            }
        });

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_recuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}