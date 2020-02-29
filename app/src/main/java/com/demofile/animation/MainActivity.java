package com.demofile.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvOne, tvTwo, tvThree, tvFour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOne = (TextView) findViewById(R.id.tvone);
        tvTwo = (TextView) findViewById(R.id.tvtwo);
        tvThree = (TextView) findViewById(R.id.tvthree);
        tvFour = (TextView) findViewById(R.id.tvfour);

        android.view.animation.Animation s1 = AnimationUtils.loadAnimation(this,R.anim.translate);
        android.view.animation.Animation s2 = AnimationUtils.loadAnimation(this,R.anim.translate);
        android.view.animation.Animation s3 = AnimationUtils.loadAnimation(this,R.anim.translate);
        android.view.animation.Animation s4 = AnimationUtils.loadAnimation(this,R.anim.translate);

        tvOne.startAnimation(s1);
        tvTwo.startAnimation(s2);
        tvThree.startAnimation(s3);
        tvFour.startAnimation(s4);
    }
}
