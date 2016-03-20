package com.example.android.estudefora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tour01Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour01);
    }



    public void v1(View view) {
        Intent intent = new Intent(this, Tour0Activity.class);
        startActivity(intent);
    }
}
