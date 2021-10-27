package com.my.mylibrarydemos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.my.mytoast.Toasterss;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_SHORT).show();
    }
}
