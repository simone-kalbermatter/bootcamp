package com.github.simonekalbermatter.bootcamp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mainButton = findViewById(R.id.mainButton);
        EditText enterNameField = findViewById(R.id.enterNameField);
        
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), GreetingActivity.class);
                String name = enterNameField.getText().toString();
                intent.putExtra("Name", name);
                view.getContext().startActivity(intent);
            }

        });
    }


}