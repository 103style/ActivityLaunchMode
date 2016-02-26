package com.hnpolice.xiaoke.activitylaunchmode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("----A----", "onCreate()");
        setContentView(R.layout.activity_main);

        findViewById(R.id.activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityA.this, ActivityB.class));
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("----A----", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("----A----", "onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e("----A----", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("----A----", "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("----A----", "onRestart()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("----A----", "onDestroy()");
    }

}
