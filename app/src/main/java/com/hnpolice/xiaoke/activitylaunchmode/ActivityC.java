package com.hnpolice.xiaoke.activitylaunchmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("----C----", "onCreate()");
        setContentView(R.layout.activity_activity_c);

        findViewById(R.id.activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityC.this, ActivityA.class));
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("----C----", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("----C----", "onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e("----C----", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("----C----", "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("----C----", "onRestart()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("----C----", "onDestroy()");
    }
}
