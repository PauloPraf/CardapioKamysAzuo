package com.ufms.kamyzazuo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bttlocalizacao,bttloginfunc,bttcardapio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bttlocalizacao=findViewById(R.id.bttlocalizacao);
        bttloginfunc=findViewById(R.id.bttloginfunc);
        bttcardapio=findViewById(R.id.bttcardapioinic);


        bttlocalizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(MainActivity.this,DadosLocalizacao.class);
                startActivity(it);
            }
        });
        bttloginfunc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it2=new Intent(MainActivity.this, LoginActivity.class);
                startActivity(it2);
            }
        });

        bttcardapio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it3=new Intent(MainActivity.this, Cardapio.class);
                startActivity(it3);
            }
        });

    }
}