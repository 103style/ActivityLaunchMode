package com.hnpolice.xiaoke.activitylaunchmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("----B----", "onCreate()");
        setContentView(R.layout.activity_activity_b);

        findViewById(R.id.activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityB.this, ActivityC.class));
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("----B----", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("----B----", "onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e("----B----", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("----B----", "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("----B----", "onRestart()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("----B----", "onDestroy()");
    }
}
