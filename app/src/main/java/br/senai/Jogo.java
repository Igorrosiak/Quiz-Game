package br.senai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Jogo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);
    }

    public void redirecionar(View view){
        Intent back = new Intent(getApplicationContext(), Pergunta.class);
        startActivity(back);
    }

    public void estudar(View view){
        Intent back = new Intent(getApplicationContext(), Conteudo.class);
        startActivity(back);
    }
}