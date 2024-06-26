package com.adlawan.mystorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToPage2(View v) {
        Intent i = new Intent(this, Page2.class);
        startActivity(i);
        finish();
    }

    int j = 1;

    public void onBackPressed() {

        if (j == 1) {
            j++;
            Toast.makeText(this, "Press the back button again to exit.", Toast.LENGTH_SHORT).show();
        } else {
            finish();

        }
    }
}