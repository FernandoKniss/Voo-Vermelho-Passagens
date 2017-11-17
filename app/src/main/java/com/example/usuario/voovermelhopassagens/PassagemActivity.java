package com.example.usuario.voovermelhopassagens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Usuario on 17/11/2017.
 */

public class PassagemActivity extends AppCompatActivity {


    private Button buttonPesquisar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passagem);

        buttonPesquisar = (Button) findViewById(R.id.pesquisar);
        buttonPesquisar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(PassagemActivity.this, MainActivity.class));
            }
        });

    }

}
