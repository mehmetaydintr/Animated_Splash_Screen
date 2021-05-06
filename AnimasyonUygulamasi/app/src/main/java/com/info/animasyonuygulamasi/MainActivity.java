package com.info.animasyonuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    private Button button;

    private Animation downtoup, uptodown;
    private Animation righttoleft, lefttoright;
    private Animation uptodowninfinitive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        /*downtoup = AnimationUtils.loadAnimation(this, R.anim.downtoup);
        uptodown = AnimationUtils.loadAnimation(this, R.anim.uptodown);

        imageView.setAnimation(uptodown);
        textView.setAnimation(uptodown);
        button.setAnimation(downtoup);*/

        /*righttoleft = AnimationUtils.loadAnimation(this, R.anim.righttoleft);
        lefttoright = AnimationUtils.loadAnimation(this, R.anim.lefttoright);

        imageView.setAnimation(lefttoright);
        textView.setAnimation(lefttoright);
        button.setAnimation(righttoleft);*/


        uptodowninfinitive = AnimationUtils.loadAnimation(this, R.anim.uptodowninfinite);
        imageView.setAnimation(uptodowninfinitive);
    }
}