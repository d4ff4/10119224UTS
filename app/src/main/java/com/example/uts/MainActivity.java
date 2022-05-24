/*
Tanggal pengerjaan : 8 Mei 2022
        NIM : 10119224
        Nama : Daffa adisthia
        Kelas : IF-6
*/
package com.example.uts;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static int splash_timeout = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent walktroughIntent = new Intent( MainActivity.this, Walkthrough.class);
                startActivity(walktroughIntent);
                finish();
            }
        }, splash_timeout);
    }
}