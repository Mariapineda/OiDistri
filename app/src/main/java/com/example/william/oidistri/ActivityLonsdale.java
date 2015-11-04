package com.example.william.oidistri;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by William on 03/11/2015.
 */
public class ActivityLonsdale extends AppCompatActivity {
    Button b1, b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lonsdale);
        b1 = (Button) findViewById(R.id.boton1);
        b2 = (Button) findViewById(R.id.boton2);


        b1.setOnClickListener((View.OnClickListener) this);
        b2.setOnClickListener((View.OnClickListener) this);

    }

    public void onClick(View v) {
        if (v==b1)
        {
            Intent intent = new Intent(ActivityLonsdale.this, Activitylondszapato.class);
            startActivity(intent);
        }

        if (v==b2)
        {
            Intent intent = new Intent(ActivityLonsdale.this, Activitylonsdalcamisa.class);
            startActivity(intent);
        }


    }

}