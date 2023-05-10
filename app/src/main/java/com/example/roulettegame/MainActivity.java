package com.example.roulettegame;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    float startDegree = 0f;
    float endDegree = 0f;
    ImageView iVRoulette;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iVRoulette = findViewById(R.id.roulette);
    }

    public void rotate(View view) {
        startDegree = endDegree;
        Random rand = new Random();
        int degree_rand = rand.nextInt(360);
        endDegree = startDegree + degree_rand + 360*3;
        ObjectAnimator object = ObjectAnimator.ofFloat(iVRoulette,"rotation",startDegree, endDegree);
        object.setInterpolator(new AccelerateDecelerateInterpolator());
        object.setDuration(3000);
        object.start();
    }

    public void animationTest(View view) {
        ImageView iVStar = findViewById(R.id.star);
        ObjectAnimator objectRotate = ObjectAnimator.ofFloat(iVStar,"rotation",0,360+5);
        objectRotate.setInterpolator(new AccelerateDecelerateInterpolator());
        objectRotate.setDuration(2000);

        ObjectAnimator objectX = ObjectAnimator.ofFloat(iVStar,"translationX",0,1000,0);
        objectX.setInterpolator(new AccelerateDecelerateInterpolator());
        objectX.setDuration(2000);

        ObjectAnimator objectY = ObjectAnimator.ofFloat(iVStar,"translationY".0f,2000f,0);
        objectY.setInterpolator(new AccelerateDecelerateInterpolator);
        objectY.setDuration(2000);

        objectRotate.start();
        objectX.start();
        objectY.start();
    }
}