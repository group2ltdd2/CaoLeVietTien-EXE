package com.example.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgAlpha;
    ImageView imgRotate;
    ImageView imgScale;
    ImageView imgTrainslate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgAlpha = (ImageView) findViewById(R.id.imageAlpha);
        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        imgAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);
            }
        });


        imgRotate = (ImageView) findViewById(R.id.imageRotate);
        final Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
        imgRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animRotate);
            }
        });


        imgScale = (ImageView) findViewById(R.id.imageScale);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        imgScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
            }
        });

        imgTrainslate = (ImageView) findViewById(R.id.imageTrainslate);
        final Animation animTrainslate = AnimationUtils.loadAnimation(this, R.anim.anim_trainsla);
        imgTrainslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animTrainslate);
            }
        });
    }
}