package com.github.simonekalbermatter.bootcamp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        TextView textView = findViewById(R.id.greetingMessage);
        String name = getIntent().getExtras().getString("Name");
        textView.setText("Hello " + name + "!");
    }
}