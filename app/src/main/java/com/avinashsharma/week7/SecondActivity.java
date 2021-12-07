package com.avinashsharma.week7;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    TextView data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ArrayList<String> regData =getIntent().getExtras().getStringArrayList("data");
        data = findViewById(R.id.data);
        data.setText("Name : "+regData.get(0)+"\n"+"Email : "+regData.get(1)+"\n"+"RNO : "+regData.get(2)+"\n"+"Address : "+regData.get(3)+"\n");
    }
}