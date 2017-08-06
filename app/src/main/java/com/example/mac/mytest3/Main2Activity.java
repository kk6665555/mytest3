package com.example.mac.mytest3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private long lastKeytime;
    private MainApp mainApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mainApp = (MainApp) getApplication();
        Log.i("test","username"+mainApp.usertname);
        Log.i("test","data3"+mainApp.data3);
        Log.i("test","data4"+mainApp.data4);

    }
    public void  doExit(View view){
        finish();
    }

    @Override
    public void finish() {

        Log.i("test","page2:finish");
        if(System.currentTimeMillis() - lastKeytime <=3*1000){
            super.finish();
        }else {
            Toast.makeText(this,"Exit",Toast.LENGTH_SHORT).show();
        }
        lastKeytime = System.currentTimeMillis();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("test","page2:onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("test","page2:onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("test","page2:onDestroy");
    }
}
