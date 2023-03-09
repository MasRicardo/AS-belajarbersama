package com.example.kelompokbiasa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ruang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruang);
    }
    public void persegi(View view) {
        Intent intent = new Intent(ruang.this, persegi.class);
        startActivity(intent);
    }
    public void segitiga(View view) {
        Intent intent = new Intent(ruang.this, segitiga.class);
        startActivity(intent);
    }
    public void lingkaran(View view) {
        Intent intent = new Intent(ruang.this, lingkaran.class);
        startActivity(intent);
    }
    public void panjang(View view) {
        Intent intent = new Intent(ruang.this, panjang.class);
        startActivity(intent);
    }
}