package com.example.picscavengerhunt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
EditText mEmail,mPassword;
Button loginBtn, signupBtn;
FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mEmail = findViewById(R.id.ET_email);
        mPassword = findViewById(R.id.ET_password);
        fAuth = FirebaseAuth.getInstance();
        
        if(fAuth.getCurrentUser()!=null)
        {
            Intent i = new Intent(this, homeScreen.class);
            startActivity(i);
        }
    }

    //Will lead to different functions later on
    public void onClickSignUpBtn(View view)
    {
        String email = mEmail.getText().toString();
        String password = mPassword.getText().toString();

        if(TextUtils.isEmpty(email))
        {
            mEmail.setError("Email is required");
            return;
        }
        if(TextUtils.isEmpty(password))
        {
            mPassword.setError("Password is required");
            return;
        }
        if(password.length()<6)
        {
            mPassword.setError("Password must be 6 or more characters long");
            return;
        }
        
        fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(MainActivity.this,"User created", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, homeScreen.class);
                    startActivity(i);
                }
                else 
                {
                    Toast.makeText(MainActivity.this,"ERROR! Couldn't create account "+task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
        
    }
    //Will lead to different functions later on

    public void onClickLogInBtn(View view)
    {
        Intent i = new Intent(this, homeScreen.class);
        startActivity(i);
    }
}