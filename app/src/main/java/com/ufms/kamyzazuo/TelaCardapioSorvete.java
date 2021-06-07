package com.ufms.kamyzazuo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TelaCardapioSorvete extends AppCompatActivity {

    ImageButton infoSorvete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cardapio_sorvete);

        infoSorvete=findViewById(R.id.bttInfosSorv);

        infoSorvete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),DadosLocalizacao.class));
            }
        });
    }
}