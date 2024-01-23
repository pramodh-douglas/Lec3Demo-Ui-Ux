package com.example.lec3demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final String TAG ="GESTURE VIEW DEMO";

    ImageView imgViewSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txtViewSample = findViewById(R.id.txtViewSample);
        imgViewSample = findViewById(R.id.imgViewSample);
        Button btnShowTxtOrImg = findViewById(R.id.btnShowTextOrImage);
        Button btnShowBoth = findViewById(R.id.btnShowBoth);
        Drawable img = ResourcesCompat.getDrawable(getResources(), R.drawable.border, getTheme());
        img.setBounds(0, 0, img.getIntrinsicWidth(), img.getIntrinsicHeight());

        txtViewSample.setVisibility(View.GONE);
        imgViewSample.setVisibility(View.GONE);

        txtViewSample.setCompoundDrawables(img, null, img, null);
        txtViewSample.setCompoundDrawablePadding(30);
        txtViewSample.setAlpha(0.8f); // alpha - 1.0f - fully opaque

        btnShowBoth.setOnClickListener(view -> {
            txtViewSample.setVisibility(View.VISIBLE);
            imgViewSample.setVisibility(View.VISIBLE);
        });

        btnShowTxtOrImg.setOnClickListener(view -> {
        });
    }


}