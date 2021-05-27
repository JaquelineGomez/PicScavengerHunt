package com.example.picscavengerhunt;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class gameScreen extends AppCompatActivity {
    String [] items ={"dog","cat","pen", "shoe", "fork"};
    static int level= 1;
    TextView itemTV;
    ImageView imageDisplay;

    private long startTime;
    private long stopTime;
    private long timeElapsed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
        itemTV=findViewById(R.id.itemTV);
        setItemTV();
        startTime = System.currentTimeMillis();
    }

    public void returnHomeScreen(View view)
    {
        finish();
    }

    public void captureImage(View view)
    {
        imageDisplay = (ImageView)findViewById(R.id.cameraIV);
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bitmap = (Bitmap) data.getExtras().get("data");
        imageDisplay.setImageBitmap(bitmap);
        level++;
        Toast.makeText(getApplicationContext(),"Congrats!! Next Level in 5 seconds",Toast.LENGTH_SHORT).show();
        stopTime = System.currentTimeMillis();
        Toast.makeText(getApplicationContext(),"Time:"+ getElapsedTimeSecs()+"seconds",Toast.LENGTH_SHORT).show();
        setItemTV();
    }

    public void setItemTV()
    {
        itemTV.setText("Find: " +items[level-1]);
    }

    public long getElapsedTimeSecs()
    {
        long elapsed;
        elapsed = ((System.currentTimeMillis() - startTime) / 1000);
        return elapsed;
    }

}