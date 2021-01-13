package com.example.menu_tech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecretMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret_menu);
    }

    public void switchProductDetail (View view) {
        Intent intent = new Intent(SecretMenu.this,ProductDetail.class);
        startActivity(intent);
    }
}