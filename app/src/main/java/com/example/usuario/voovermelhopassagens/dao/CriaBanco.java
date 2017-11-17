package com.example.usuario.voovermelhopassagens.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Usuario on 15/11/2017.
 */

public class CriaBanco extends SQLiteOpenHelper {

    public static final String NOME_BANCO = "banco.aerea";
    public static final String TABELA = "Passageiro";
    public static final String ID = "_id";
    public static final String NOME = "nome";
    public static final String CPF = "cpf";
    public static final String ENDERECO = "endereco";
    public static final int VERSAO = 2;

    public CriaBanco(Context context){
        super(context, NOME_BANCO,null,VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase aerea) {

        aerea.execSQL("CREATE TABLE " + TABELA + "("
                + ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + NOME + " text,"
                + CPF + " text,"
                + ENDERECO + " text"
                +");");

    }

    @Override
    public void onUpgrade(SQLiteDatabase aerea, int oldVersion, int newVersion) {
       // aerea.execSQL("DROP TABLE IF EXISTS" + TABELA);
        onCreate(aerea);
    }
}
