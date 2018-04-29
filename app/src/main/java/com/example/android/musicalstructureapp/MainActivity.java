package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView pentatonix = findViewById(R.id.pentatonix);
        pentatonix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pentatonix = new Intent(MainActivity.this, Pentatonix.class);
                startActivity(pentatonix);
            }
        });
    }
}
