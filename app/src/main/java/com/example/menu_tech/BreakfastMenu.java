package com.example.menu_tech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BreakfastMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast_menu);
    }

    public void switchProductDetail (View view) {
        Intent intent = new Intent(BreakfastMenu.this,ProductDetail.class);
        startActivity(intent);
    }

}