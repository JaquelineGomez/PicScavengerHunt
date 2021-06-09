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

import java.util.Timer;
import java.util.TimerTask;

public class gameScreen extends AppCompatActivity {
    String [] items ={"dog","cat","pen", "shoe", "fork"};
    static int level= 1;
    TextView itemTV;
    ImageView imageDisplay;

    private long startTime;
    private long stopTime;
     static long points=0;

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
        stopTime = System.currentTimeMillis();
        Bitmap bitmap = (Bitmap) data.getExtras().get("data");
        imageDisplay.setImageBitmap(bitmap);
        level++;
        setPoints();

        Toast.makeText(getApplicationContext(),"Time:"+ getElapsedTimeSecs()+"seconds",Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(),"Congrats!! Next Level in 5 seconds",Toast.LENGTH_SHORT).show();
        setItemTV();
//        startTime = System.currentTimeMillis();
//        while((System.currentTimeMillis()-startTime)!=0)
//        {
//
//        }
//        setItemTV();
        //        new java.util.Timer().schedule(
//                new java.util.TimerTask() {
//                    @Override
//                    public void run() {
//                        setItemTV();
//                    }
//                }, 5000
//        );
    }

    public void setItemTV()
    {
        itemTV.setText("Find: " +items[level-1]);
    }
    public static int getLevel() {
        return level;
    }

    public static void setLevel(int level) {
        gameScreen.level = level;
    }

    public static long getPoints() {
        return points;
    }

    public static void setPoints(long point) {
        points = point;
        if(point<0)
        {
            points=(long)0.0;
        }
    }

    public long calculatePoints()
    {
        double timeElapse= (double) getElapsedTimeSecs();
        double i= (1/timeElapse);
        return Math.round(points+(level*(i)*1000)+100);
    }

    public void setPoints()
    {
        points+= calculatePoints();
        TextView textView = findViewById(R.id.pointTV);
        textView.setText("  "+points);
    }
    public long getElapsedTimeSecs()
    {
        long elapsed;
        elapsed = ((System.currentTimeMillis() - startTime) / 1000);
        return elapsed;
    }

//    public void countDownNextLevel()
//    {
//        TimerTask timerTask= new TimerTask() {
//            @Override
//            public void run() {
//                Toast.makeText(getApplicationContext(),"Time:"+ getElapsedTimeSecs()+"seconds",Toast.LENGTH_SHORT).show();
//                setItemTV();
//            }
//        };
//        Timer timer =new Timer("Timer");
//        long delay=5000L;
//
//        timer.schedule(timerTask,delay);
//    }
}