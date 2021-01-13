package com.example.menu_tech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class McdoMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcdo_menu);
    }

    public void switchBreakfastMenu (View view) {
        Intent intent = new Intent(McdoMenu.this,BreakfastMenu.class);
        startActivity(intent);
    }

    public void switchSecretMenu (View view) {
        Intent intent = new Intent(McdoMenu.this,SecretMenu.class);
        startActivity(intent);
    }

    public void switchRegularMenu (View view) {
        Intent intent = new Intent(McdoMenu.this,RegularMenu.class);
        startActivity(intent);
    }

    public void switchDaB (View view) {
        Intent intent = new Intent(McdoMenu.this,DessertAndBeverages.class);
        startActivity(intent);
    }

    public void switchHappyMeal (View view) {
        Intent intent = new Intent(McdoMenu.this,HappyMeal.class);
        startActivity(intent);
    }

    public void switchPartyPackage (View view) {
        Intent intent = new Intent(McdoMenu.this,PartyPackage.class);
        startActivity(intent);
    }

    public void switchProductDetail(View view) {
        Intent intent = new Intent(McdoMenu.this,ProductDetail.class);
    }
}