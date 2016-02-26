package com.hnpolice.xiaoke.activitylaunchmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("----E----", "onCreate()");
        setContentView(R.layout.activity_activity_e);

        findViewById(R.id.activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityE.this, ActivityA.class));
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("----E----", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("----E----", "onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e("----E----", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("----E----", "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("----E----", "onRestart()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("----E----", "onDestroy()");
    }
}
