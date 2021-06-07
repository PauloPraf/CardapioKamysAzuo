package com.ufms.kamyzazuo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Cardapio extends AppCompatActivity {
    ImageButton sorvete,bebidas,picoles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);

        sorvete=findViewById(R.id.bttsorvete);
        picoles=findViewById(R.id.bttpicole);
        bebidas=findViewById(R.id.bttbebidas);

        sorvete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),TelaCardapioSorvete.class));
            }
        });

        picoles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),TelaCardapioPicoles.class));
            }
        });

        bebidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),TelaCardapioBebidas.class));
            }
        });


    }
}