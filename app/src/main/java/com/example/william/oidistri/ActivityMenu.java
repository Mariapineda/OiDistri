package com.example.william.oidistri;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ActivityMenu extends AppCompatActivity implements View.OnClickListener{

    ImageView ivfoto1,ivfoto2,ivfoto3,ivfoto4,ivfoto5,ivfoto6;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivfoto1 = (ImageView) findViewById(R.id.imagen1);
        ivfoto2 = (ImageView) findViewById(R.id.imagen2);
        ivfoto3 = (ImageView) findViewById(R.id.imagen3);
        ivfoto4 = (ImageView) findViewById(R.id.imagen4);
        ivfoto5 = (ImageView) findViewById(R.id.imagen5);
        ivfoto6 = (ImageView) findViewById(R.id.imagen6);

        ivfoto1.setOnClickListener((View.OnClickListener) this);
        ivfoto2.setOnClickListener((View.OnClickListener) this);
        ivfoto3.setOnClickListener((View.OnClickListener) this);
        ivfoto4.setOnClickListener((View.OnClickListener) this);
        ivfoto5.setOnClickListener((View.OnClickListener) this);
        ivfoto6.setOnClickListener((View.OnClickListener) this);

    }


    @Override
    public void onClick(View v)
    {
        if (v==ivfoto1)
        {
            Intent intent = new Intent(ActivityMenu.this, ActivityDrmartens.class);
            startActivity(intent);
        }

        if (v==ivfoto2)
        {
            Intent intent = new Intent(ActivityMenu.this, ActivityFredperry.class);
            startActivity(intent);
        }
        if (v==ivfoto3)
        {
            Intent intent = new Intent(ActivityMenu.this, ActivityLonsdale.class);
            startActivity(intent);
        }
        if (v==ivfoto4)
        {
            Intent intent = new Intent(ActivityMenu.this, ActivityMerc.class);
            startActivity(intent);

        }
        if (v==ivfoto5)
        {
            Intent intent = new Intent(ActivityMenu.this, ActivityParches.class);
            startActivity(intent);
        }
        if (v==ivfoto6)
        {
            Intent intent = new Intent(ActivityMenu.this, ActivityMusica.class);
            startActivity(intent);
        }

    }
}
