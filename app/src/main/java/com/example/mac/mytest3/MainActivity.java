package com.example.mac.mytest3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private View test2, test3, test4;

    public void test1(View view){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void test2(){

    }
    public void test3(){

    }
    public void test4( ){

    }
    public void test34(View view){
        if (view == test3) {
            Log.i("test", "test3");
        }else if (view == test4){
            Log.i("test", "test4");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("test","onCreate");
        test2= findViewById(R.id.test2);
        test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                test2();
                Log.i("brad", "test2");
            }
        });
        test3= findViewById(R.id.test3);
        test4= findViewById(R.id.test4);



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("test","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("test","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("test","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("test","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("test","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("test","onDestroy");
    }

}
