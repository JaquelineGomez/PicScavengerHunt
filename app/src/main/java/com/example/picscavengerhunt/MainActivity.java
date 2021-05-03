package com.example.picscavengerhunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Will lead to different functions later on
    public void onClickSignUpBtn(View view)
    {
        Intent i = new Intent(this, homeScreen.class);
        startActivity(i);
    }
    //Will lead to different functions later on

    public void onClickLogInBtn(View view)
    {
        Intent i = new Intent(this, homeScreen.class);
        startActivity(i);
    }
}