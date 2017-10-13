package com.example.stu00001.mesacollegeapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    private Button callButton;
    private Intent intent;
    private String tag = "orientation";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // lock screen orientation:
        Log.e(tag,"running onCreate()!");

        callButton = (Button)findViewById(R.id.call);
        callButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String phone = "6193882600";
                intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
    }

    public void mesacollegeapplication(View view){
        Intent mesacollegeapplication = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sdmesa.edu/"));
        startActivity(mesacollegeapplication);
    }

}
