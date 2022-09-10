package com.example.mylesson11;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.TextView;


    public class SecondActivity2 extends AppCompatActivity {
        private TextView Name;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second2);
            Name = findViewById(R.id.tv_second);
            String txtName = getIntent().getStringExtra("Name");
            Name.setText(Name.getText().toString()+ " "+txtName);

        }
    }
