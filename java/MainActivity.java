package com.example.spark.firstapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button login;
    private  TextView message;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=(Button) findViewById(R.id.login);
        message=(TextView) findViewById(R.id.message);

        login.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        LayoutInflater inflater = getLayoutInflater();
        View myLayout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toastid), false);
        Toast toast=new Toast(MainActivity.this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.setView(myLayout);
        toast.show();

    }
}
