package com.example.android.estudefora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tour0Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour0);
    }

    public void inicio(View view) {
        Intent intent = new Intent(this,MenuActivity.class);
        startActivity(intent);
    }
    public void Tour2(View view) {
        Intent intent = new Intent(this,Tour2Activity.class);
        startActivity(intent);
    }

    public void p1(View view) {
        Intent intent = new Intent(this,Tour01Activity.class);
        startActivity(intent);
    }

    public void p3(View view) {
        Intent intent = new Intent(this,Tour3Activity.class);
        startActivity(intent);
    }

    public void p4(View view) {
        Intent intent = new Intent(this,Tour4Activity.class);
        startActivity(intent);
    }

    public void p5(View view) {
        Intent intent = new Intent(this,Tour5Activity.class);
        startActivity(intent);
    }

    public void p6(View view) {
        Intent intent = new Intent(this,Tour6Activity.class);
        startActivity(intent);

    }
}
