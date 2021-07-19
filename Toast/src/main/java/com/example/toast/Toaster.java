package com.example.toast;

import android.content.Context;
import android.graphics.Color;
import android.widget.TextView;
import android.widget.Toast;

public class Toaster {
    public static void success(Context context, String msg){
        Toast toast = new Toast(context);
        TextView tv=new TextView(context);
        tv.setText(msg);
        tv.setBackgroundColor(Color.parseColor("#61A465"));
        tv.setPadding(50,20,50,20);
        tv.setTextColor(Color.WHITE);
        tv.setTextSize(14);
        toast.setView(tv);
        toast.show();
    }
    public static void error(Context context, String msg){
        Toast toast = new Toast(context);
        TextView tv = new TextView(context);
        tv.setText(msg);
        tv.setBackgroundColor(Color.parseColor("#D82727"));
        tv.setPadding(50,20,50,20);
        tv.setTextColor(Color.WHITE);
        tv.setTextSize(14);
        toast.setView(tv);
        toast.show();
    }
}
