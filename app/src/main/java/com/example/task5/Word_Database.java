package com.example.task5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class Word_Database extends SQLiteOpenHelper{

    private static final String DATABASE_NAME = "wordDB";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_WORD = "word";
    private static final String MISSPELLED_WORD = "misspelled_word";
    private static final String CORRECT_WORD = "correct_word";

    public Word_Database(Context context) {
        super(context , DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlCreate = "create table " + TABLE_WORD + "( " + MISSPELLED_WORD;
        sqlCreate += " text," + CORRECT_WORD + "text )";

        db.execSQL(sqlCreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table if exists " +TABLE_WORD );
        onCreate(db);
    }

    public void insert(){
        SQLiteDatabase db = this.getWritableDatabase();
        String word1 = "insert into "+ TABLE_WORD +" values ( 'teh','the')";
        String word2 = "insert into "+ TABLE_WORD +" values ( 'sheo','shoe')";
        String word3 = "insert into "+ TABLE_WORD +" values ( 'sikc','sick')";
        String word4 = "insert into "+ TABLE_WORD +" values ( 'paht','path')";
        String word5 = "insert into "+ TABLE_WORD +" values ( 'hta','hat')";

        db.execSQL(word1);
        db.execSQL(word2);
        db.execSQL(word3);
        db.execSQL(word4);
        db.execSQL(word5);
        db.close();
    }
}
