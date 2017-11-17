package com.example.usuario.voovermelhopassagens.dao;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.usuario.voovermelhopassagens.R;

/**
 * Created by Usuario on 15/11/2017.
 */

public class InsereDado extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passageiro);

        Button botao = (Button)findViewById(R.id.cadastrar2);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BancoController crud = new BancoController(getBaseContext());
                EditText nome = (EditText)findViewById(R.id.nome);
                EditText cpf = (EditText)findViewById((R.id.cpf));
                EditText endereco = (EditText)findViewById(R.id.endereco);

                String nomeString = nome.getText().toString();
                String cpfString = cpf.getText().toString();
                String enderecoString = endereco.getText().toString();

                String resultado;


                resultado = crud.insereDado(nomeString, cpfString, enderecoString);

                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
            }
        });
    }

}