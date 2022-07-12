package br.senai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void cadastro(View view){
        Intent back = new Intent(getApplicationContext(), Cadastro.class);
        startActivity(back);
    }

    public void logar(View view) {
        Intent back = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(back);
    }
}