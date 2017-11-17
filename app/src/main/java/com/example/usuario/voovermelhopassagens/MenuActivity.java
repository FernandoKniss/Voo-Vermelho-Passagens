package com.example.usuario.voovermelhopassagens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.usuario.voovermelhopassagens.dao.Consulta;
import com.example.usuario.voovermelhopassagens.dao.InsereDado;

import static com.example.usuario.voovermelhopassagens.R.id.button7;
import static com.example.usuario.voovermelhopassagens.R.id.button4;
import static com.example.usuario.voovermelhopassagens.R.id.button5;
import static com.example.usuario.voovermelhopassagens.R.id.button6;
import static com.example.usuario.voovermelhopassagens.R.id.button8;



public class MenuActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button, button1, button2, button3, buttonn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        button = (Button) findViewById(button7);
        button.setOnClickListener(this);
        button1 = (Button) findViewById(button4);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(button5);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(button6);
        button3.setOnClickListener(this);
        buttonn4 = (Button) findViewById(button8);
        buttonn4.setOnClickListener(this);

    }

    public void onClick(View view) {
        Intent i = null;
        switch (view.getId()) {
            case button7:
                i = new Intent(this, PassagemActivity.class);
                break;
            case button4:
                i = new Intent(this, AviaoActivity.class);
                break;
            case button5:
                i = new Intent(this, AlterarActivity.class);
                break;
            case button6:
                i = new Intent(this, Consulta.class);
                break;
            case button8:
                i = new Intent(this, MainActivity.class);
                break;
        }
        if (i != null) {
            startActivity(i);
        }

    }
}
