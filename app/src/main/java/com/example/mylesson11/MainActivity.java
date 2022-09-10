package com.example.mylesson11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText NameEntry;
    private Button changeActivityButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeActivityButton = findViewById(R.id.btn_click);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity2.class);
                NameEntry = findViewById (R.id.et_first);
                intent.putExtra("Name",NameEntry.getText().toString());
                startActivity(intent);
                finish();

            }
        });
    }
}