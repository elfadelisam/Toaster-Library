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
        tv.setBackgroundColor(Color.parseColor("#62A465"));
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
        tv.setBackgroundColor(Color.parseColor("#D92727"));
        tv.setPadding(50,20,50,20);
        tv.setTextColor(Color.WHITE);
        tv.setTextSize(14);
        toast.setView(tv);
        toast.show();
    }
    public static void info(Context context, String msg){
        Toast toast = new Toast(context);
        TextView tv = new TextView(context);
        tv.setText(msg);
        tv.setBackgroundColor(Color.parseColor("#5060BA"));
        tv.setPadding(50,20,50,20);
        tv.setTextColor(Color.WHITE);
        tv.setTextSize(14);
        toast.setView(tv);
        toast.show();
    }
    public static void warning(Context context, String msg){
        Toast toast = new Toast(context);
        TextView tv = new TextView(context);
        tv.setText(msg);
        tv.setBackgroundColor(Color.parseColor("#FDAF17"));
        tv.setPadding(50,20,50,20);
        tv.setTextColor(Color.WHITE);
        tv.setTextSize(14);
        toast.setView(tv);
        toast.show();
    }
}
