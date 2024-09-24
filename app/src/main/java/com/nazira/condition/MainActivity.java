package com.nazira.condition;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String myString = editText.getText().toString();
                int myNumber = Integer.parseInt(myString);

                if (myNumber%2 ==0){
                    Toast.makeText(MainActivity.this,myNumber+" is even number",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this,myNumber+" is odd number",Toast.LENGTH_LONG).show();
                }


            }
        });

    }
}