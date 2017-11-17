package com.example.usuario.voovermelhopassagens;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.example.usuario.voovermelhopassagens.dao.Consulta;
import com.example.usuario.voovermelhopassagens.dao.InsereDado;

import static com.example.usuario.voovermelhopassagens.R.id.entrar;
import static com.example.usuario.voovermelhopassagens.R.id.cadastrar;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonLogin, buttonCadastrar;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogin = (Button) findViewById(entrar);
        buttonLogin.setOnClickListener(this);
        buttonCadastrar = (Button) findViewById(cadastrar);
        buttonCadastrar.setOnClickListener(this);

    }

    public void onClick(View view) {
        Intent i = null;
        switch (view.getId()) {
            case entrar:
                i = new Intent(this, MenuActivity.class);
                break;
            case cadastrar:
                i = new Intent(this, InsereDado.class);
                break;

        }
        if (i != null) {
            startActivity(i);
        }

    }
}

