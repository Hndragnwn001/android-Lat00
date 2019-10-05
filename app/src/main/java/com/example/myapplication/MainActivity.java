package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan view dengan source code kita
        Button btFirst = findViewById(R.id.btfirst);
        Button btSecond = findViewById(R.id.btSecond);
        Button btThird = findViewById(R.id.btThird);
        Button btFourth = findViewById(R.id.btFourth);

        //interface onclicklistener merupakan interface yang ada dikelas view
        //hanya berisi satu method onclick(view view)

        //berikut kode memasang onclicklistener onclick pada object button
        btFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Anda baru saja mengklik tombol pertama", Toast.LENGTH_SHORT).show();
            }


        });

        btSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Anda baru saja mengklik tombol Kedua", Toast.LENGTH_SHORT).show();
            }
        });

        btThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Anda baru saja mengklik tombol ketiga", Toast.LENGTH_SHORT).show();
            }
        });

        btFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Anda Baru saja mengklik tombol keempat", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
