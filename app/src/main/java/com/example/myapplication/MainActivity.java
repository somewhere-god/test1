package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("act_A:","执行onCreate方法");

        btn_a = (Button) findViewById(R.id.btn_a);
        btn_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Main2Activity.class);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("act_A:","执行onStart方法");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("act_A:","执行onRestart方法");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("act_A:","执行onResume方法");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("act_A:","执行onStop方法");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("act_A:","执行onPause方法");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("act_A:","执行onDestroy方法");
    }
}
