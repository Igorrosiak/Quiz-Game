package br.senai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cadastro(View view){
        Intent back = new Intent(getApplicationContext(), Cadastro.class);
        startActivity(back);
    }

    public void logar(View view) {
        Intent back = new Intent(getApplicationContext(), Jogo.class);
        startActivity(back);
    }
}