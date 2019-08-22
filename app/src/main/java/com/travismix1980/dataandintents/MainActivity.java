package com.travismix1980.dataandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nameEditText = findViewById(R.id.name_edit_text);
        final EditText ageEditText = findViewById(R.id.age_edit_text);
        final EditText emailEditText = findViewById(R.id.email_edit_text);
        final EditText phoneEditText = findViewById(R.id.phone_edit_text);
        Button sendButton = findViewById(R.id.send_button);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nameEditText.getText().length() < 1 ||
                        ageEditText.getText().length() < 1 ||
                        emailEditText.getText().length() < 1 ||
                        phoneEditText.getText().length() < 1){
                    Toast.makeText(getApplicationContext(), "Please fill in all data",
                            Toast.LENGTH_SHORT).show();
                }else{
                    Intent i = new Intent(MainActivity.this, DataReceiver.class);
                    i.putExtra("name", nameEditText.getText().toString());
                    i.putExtra("age", ageEditText.getText().toString());
                    i.putExtra("email", emailEditText.getText().toString());
                    i.putExtra("phone", phoneEditText.getText().toString());
                    startActivity(i);
                }
            }
        });

    }
}
