package com.example.mac.mytest3;

import android.app.Application;
import android.util.Log;

/**
 * Created by Mac on 2017/8/6.
 */

public class MainApp extends Application{

    String usertname;
    int data3;
    static int data4;


    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("text:","MainAPP();");
        usertname="test";
        data3=data4=250;
    }
}
