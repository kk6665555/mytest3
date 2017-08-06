package com.example.mac.mytest3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Page3 extends AppCompatActivity {
    private TextView mesg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        mesg=(TextView)findViewById(R.id.Page_mesg);

        Intent intent =  getIntent();
        int stage = intent.getIntExtra("stage",0);
        String usertname = intent.getStringExtra("username");
        Boolean soud = intent.getBooleanExtra("sound",false);

        mesg.append(stage + usertname + soud);


    }
}
