package com.example.usuario.voovermelhopassagens;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.usuario.voovermelhopassagens.dao.BancoController;
import com.example.usuario.voovermelhopassagens.dao.Consulta;
import com.example.usuario.voovermelhopassagens.dao.CriaBanco;

public class AlterarActivity extends AppCompatActivity {

    EditText passageiro;
    EditText cpf;
    EditText endereco;
    Button alterar;
    Button deletar;
    Cursor cursor;
    BancoController crud;
    String codigo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar);

        codigo = this.getIntent().getStringExtra("codigo");

        crud = new BancoController(getBaseContext());

        passageiro = (EditText) findViewById(R.id.editText5);
        cpf = (EditText) findViewById(R.id.editText6);
        endereco = (EditText) findViewById(R.id.editText7);

        clear((ViewGroup)findViewById(R.id.Alterar));

        alterar = (Button)findViewById(R.id.button2);
        deletar = (Button)findViewById(R.id.button3);

        cursor = crud.carregaDadoById(Integer.parseInt(codigo));
        passageiro.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.NOME)));
        cpf.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.CPF)));
            endereco.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.ENDERECO)));


        alterar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                crud.alteraRegistro(Integer.parseInt(codigo), passageiro.getText().toString(),cpf.getText().toString(),
                        endereco.getText().toString());
                Intent intent = new Intent(AlterarActivity.this,Consulta.class);
                startActivity(intent);
                finish();
            }
        });

        deletar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                crud.deletaRegistro(Integer.parseInt(codigo));
                Intent intent = new Intent(AlterarActivity.this,Consulta.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void clear(ViewGroup group) {

        int count = group.getChildCount();
        for (int i = 0; i < count; i++) {
            View view = group.getChildAt(i);
            if (view instanceof ViewGroup) {
                clear((ViewGroup) view);
                continue;
            }
            if (view instanceof EditText) {
                ((EditText)view).setText("");
                continue;
            }
        }
    }
}
