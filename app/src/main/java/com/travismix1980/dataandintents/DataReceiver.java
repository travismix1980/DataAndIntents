package com.travismix1980.dataandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DataReceiver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_reciever);

        Bundle intentData = getIntent().getExtras();

        TextView name = findViewById(R.id.name_receiver);
        TextView age = findViewById(R.id.age_receiver);
        TextView email = findViewById(R.id.email_receiver);
        TextView phone = findViewById(R.id.phone_receiver);

        if(intentData != null){
            name.setText(intentData.getString("name"));
            age.setText(intentData.getString("age"));
            email.setText(intentData.getString("email"));
            phone.setText(intentData.getString("phone"));
        }
    }
}
