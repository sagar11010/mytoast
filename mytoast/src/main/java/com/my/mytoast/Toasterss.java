package com.my.mytoast;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class Toasterss
{

    public static  void showToast(Context c,String message){
        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
    }
}
