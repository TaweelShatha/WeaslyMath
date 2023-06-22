package com.example.weaslymath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ImageView imageView = findViewById(R.id.SplashScreenImage);
        Animation slide = AnimationUtils.loadAnimation(this,R.anim.side_slide);
        imageView.startAnimation(slide);
        Intent intent = new Intent(this , MainActivity.class);
        startActivity(intent);


    }
}