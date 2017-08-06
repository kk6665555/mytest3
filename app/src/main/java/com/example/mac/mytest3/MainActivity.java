package com.example.mac.mytest3;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private View test2, test3, test4;
    private MainApp mainApp;
    public void test1(View view){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void test2(){
        Intent intent = new Intent(this,Page3.class);
        intent.putExtra("username","mike");
        intent.putExtra("stage",(int)(Math.random()*49));
        intent.putExtra("sound",false);
        startActivity(intent);
    }
    public void test3(){
        Intent intent = new Intent(this,Page4.class);

        startActivityForResult(intent,66);
    }
    public void test4( ){
        Intent intent = new Intent(this,Page5.class);
        startActivityForResult(intent,38);

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
                Log.i("test", "test2");
            }
        });
        test3= findViewById(R.id.test3);
        test4= findViewById(R.id.test4);

        mainApp = (MainApp)getApplication();
        Log.i("test","username"+mainApp.usertname);
        Log.i("test","data3"+mainApp.data3);
        Log.i("test","data4"+mainApp.data4);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.i("test","back:"+requestCode);
        if(requestCode==200){
            int data1 = data.getIntExtra("data1",-1);
            String data2 = data.getStringExtra("data2");
            Log.i("test", data1 + " : " + data2);
        }
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
