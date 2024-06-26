package com.adlawan.mystorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Page8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page8);
    }

    public void goToPage7(View v){
        Intent i = new Intent(this, Page7.class);
        startActivity(i);
        finish();
    }

    public void goToPage9(View v){
        Intent i = new Intent(this, Page9.class);
        startActivity(i);
        finish();
    }

    public void onBackPressed(){
        Toast.makeText(this, "Back Button is Pressed.", Toast.LENGTH_SHORT).show();
    }
}
