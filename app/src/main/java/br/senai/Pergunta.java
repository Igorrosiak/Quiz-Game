package br.senai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pergunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta);
    }

    public void voltar(View view) {
        Intent back = new Intent(getApplicationContext(), Jogo.class);
        startActivity(back);
    }

    public void proxima(View view) {
        Intent back = new Intent(getApplicationContext(), Pergunta.class);
        startActivity(back);
    }

}