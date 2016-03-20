package com.example.android.estudefora;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
//botão para mmostrar as categorias
    public void inicio(View view) {

        Intent intent = new Intent(this, Tour0Activity.class);
        startActivity(intent);


//        String url = "http://www.google.com";
//        Intent i = new Intent(Intent.ACTION_VIEW);
//        i.setData(Uri.parse(url));
//        startActivity(i);

    }
//chamar para a pagina de mais informações
    //como usar o app
    public void moreinfo(View view) {
        Intent intent = new Intent(this,MoreInfoActivity.class);
        startActivity(intent);
    }

//botão para voltar ao inicio
    public void comousar1(View view) {
        Intent intent = new Intent(this,ComousarActivity.class);
        startActivity(intent);
    }
}
