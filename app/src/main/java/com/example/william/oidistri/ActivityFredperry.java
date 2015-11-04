package com.example.william.oidistri;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class ActivityFredperry extends AppCompatActivity {
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fredperry);

            b1 = (Button) findViewById(R.id.boton1);
            b2 = (Button) findViewById(R.id.boton2);


            b1.setOnClickListener((View.OnClickListener) this);
            b2.setOnClickListener((View.OnClickListener) this);

        }

        public void onClick(View v) {
            if (v==b1)
            {
                Intent intent = new Intent(ActivityFredperry.this, Activitybotasdr.class);
                startActivity(intent);
            }

            if (v==b2)
            {
                Intent intent = new Intent(ActivityFredperry.this, Activityzapatodr.class);
                startActivity(intent);
            }


        }

    }
