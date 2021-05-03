package com.example.picscavengerhunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    public void onClickGameBtn(View view)
    {
        Intent i = new Intent(this, gameScreen.class);
        startActivity(i);
    }
    public void returnMainActivity(View view)
    {
        finish();
    }
}