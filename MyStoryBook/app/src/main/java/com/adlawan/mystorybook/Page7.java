package com.adlawan.mystorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Page7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page7);
    }

    public void goToPage6(View v){
        Intent i = new Intent(this, Page6.class);
        startActivity(i);
        finish();
    }

    public void goToPage8(View v){
        Intent i = new Intent(this, Page8.class);
        startActivity(i);
        finish();
    }

    public void onBackPressed(){
        Toast.makeText(this, "Back Button is Pressed.", Toast.LENGTH_SHORT).show();
    }
}
