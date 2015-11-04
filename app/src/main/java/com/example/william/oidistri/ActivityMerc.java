package com.example.william.oidistri;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by William on 03/11/2015.
 */
public class ActivityMerc extends AppCompatActivity implements View.OnClickListener{
    ImageView ivfoto1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.merc);


        ivfoto1 = (ImageView) findViewById(R.id.imagen1);
        ivfoto1.setOnClickListener((View.OnClickListener) this);
    }


    @Override
    public void onClick(View v)
    {

        if (v==ivfoto1)
        {
            Intent intent = new Intent(ActivityMerc.this, Activitymerclogo.class);
            startActivity(intent);
        }


}}
