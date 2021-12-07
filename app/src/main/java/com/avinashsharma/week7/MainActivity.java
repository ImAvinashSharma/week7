package com.avinashsharma.week7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText name,email,rno,address;
    private Button btn;
    private ArrayList<ArrayList<String> > db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btnSubmit);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        rno = findViewById(R.id.rono);
        address = findViewById(R.id.address);
        db = new ArrayList<ArrayList<String> >();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> data = new ArrayList<>();
                data.add(name.getText().toString());
                data.add(email.getText().toString());
                data.add(rno.getText().toString());
                data.add(address.getText().toString());
                db.add(data);
                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                i.putStringArrayListExtra("data",data);
                startActivity(i);
            }
        });
    }
}