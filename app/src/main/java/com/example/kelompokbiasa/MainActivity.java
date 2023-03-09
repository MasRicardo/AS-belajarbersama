package com.example.kelompokbiasa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void kalkulator(View view) {
        Intent intent = new Intent(MainActivity.this, kalkulator.class);
        startActivity(intent);
    }
    public void ruang(View view) {
        Intent intent = new Intent(MainActivity.this, ruang.class);
        startActivity(intent);
    }
    public void materi(View view) {
        Intent intent = new Intent(MainActivity.this, materi.class);
        startActivity(intent);
    }
}