package com.example.william.oidistri;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by William on 03/11/2015.
 */
public class ActivityDrmartens extends AppCompatActivity implements View.OnClickListener {


        Button b1, b2,b3;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.drmartens);

            b1 = (Button) findViewById(R.id.boton1);
            b2 = (Button) findViewById(R.id.boton2);
            b3 = (Button) findViewById(R.id.boton3);

            b1.setOnClickListener((View.OnClickListener) this);
            b2.setOnClickListener((View.OnClickListener) this);
            b3.setOnClickListener((View.OnClickListener) this);
        }

    @Override
    public void onClick(View v) {
        if (v==b1)
        {
            Intent intent = new Intent(ActivityDrmartens.this, Activitybotasdr.class);
            startActivity(intent);
        }

        if (v==b2)
        {
            Intent intent = new Intent(ActivityDrmartens.this, Activityzapatodr.class);
            startActivity(intent);
        }
        if (v==b3)
        {
            Intent intent = new Intent(ActivityDrmartens.this, Activitydrmarteaccesorio.class);
            startActivity(intent);
        }

    }
}
