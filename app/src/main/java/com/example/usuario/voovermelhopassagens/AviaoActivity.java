package com.example.usuario.voovermelhopassagens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AviaoActivity extends AppCompatActivity {

    private EditText quantidadePassageiro;
    private EditText identificacao;
    private Button cadastrarAeronave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aviao);

        quantidadePassageiro = (EditText) findViewById(R.id.quantidadePassageiro);
        identificacao = (EditText) findViewById(R.id.identificacao);
        cadastrarAeronave = (Button) findViewById(R.id.cadastrarAeronave);
        cadastrarAeronave.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(AviaoActivity.this, null));
            }
        });
    }



}
