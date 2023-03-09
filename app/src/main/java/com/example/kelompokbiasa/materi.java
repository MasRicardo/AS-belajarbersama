package com.example.kelompokbiasa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class materi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
    }
    public void persegi(View view) {
        Intent intent = new Intent(materi.this, materipersegi.class);
        startActivity(intent);
    }
    public void segitiga(View view) {
        Intent intent = new Intent(materi.this, materisegitiga.class);
        startActivity(intent);
    }
    public void lingkaran(View view) {
        Intent intent = new Intent(materi.this, materilingkaran.class);
        startActivity(intent);
    }
    public void panjang(View view) {
        Intent intent = new Intent(materi.this, materipanjang.class);
        startActivity(intent);
    }
}