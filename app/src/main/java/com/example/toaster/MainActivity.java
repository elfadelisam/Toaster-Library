package com.example.toaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toast.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Toaster test
        Toaster.success(this,"Successful");
        Toaster.error(this, "Error");
        Toaster.info(this, "Info");
        Toaster.warning(this, "Warning");
    }
}