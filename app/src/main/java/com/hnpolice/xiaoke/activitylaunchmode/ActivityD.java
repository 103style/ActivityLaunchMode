package com.hnpolice.xiaoke.activitylaunchmode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class ActivityD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("----D----", "onCreate()");
        setContentView(R.layout.activity_activity_d);

        findViewById(R.id.activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityD.this, ActivityE.class));
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("----D----", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("----D----", "onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e("----D----", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("----D----", "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("----D----", "onRestart()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("----D----", "onDestroy()");
    }

}
