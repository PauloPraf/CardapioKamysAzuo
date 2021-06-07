package com.ufms.kamyzazuo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TelaCardapioBebidas extends AppCompatActivity {

    ImageButton infobebidas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cardapio_bebidas);

        infobebidas=findViewById(R.id.bttInfosbebidas);

        infobebidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),DadosLocalizacao.class));
            }
        });
    }
}