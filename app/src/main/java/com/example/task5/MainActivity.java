package com.example.task5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Word_Database data;
    private EditText phrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = new Word_Database(this);
        data.insert();
        setContentView(R.layout.activity_main);
        phrase = findViewById(R.id.Phrase);
        phrase.animate();
    }

}
