package com.example.sandeep_c0766628_ft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button adduser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adduser=findViewById(R.id.adduserbtn);

    }
    public void addclick(View view){
        Intent intent = new Intent(this, UserinputActivity.class);

        startActivity(intent);
    }
}
