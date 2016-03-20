package com.example.android.estudefora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tour3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour3);
    }

    public void proxima(View view) {
        Intent intent = new Intent(this, Tour4Activity.class);
        startActivity(intent);
    }
    //voltar a pagina de categorias

    public void voltar(View view) {
        Intent intent = new Intent(this, Tour0Activity.class);
        startActivity(intent);
    }
}
