package com.adlawan.mystorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }

    public void goToPage2(View v){
        Intent i = new Intent(this, Page2.class);
        startActivity(i);
        finish();
    }

    public void goToPage4(View v){
        Intent i = new Intent(this, Page4.class);
        startActivity(i);
        finish();
    }

    public void onBackPressed(){
        Toast.makeText(this, "Back Button is Pressed.", Toast.LENGTH_SHORT).show();
    }
}
