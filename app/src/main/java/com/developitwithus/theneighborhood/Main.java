package com.developitwithus.theneighborhood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.developitwithus.theneighborhood.UserIntroduce.PersonalInformation.PersonalInformationRequest;

public class Main extends AppCompatActivity {

    Button singIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        singIn = findViewById(R.id.singupButton);
    }


    @Override
    protected void onResume() {
        super.onResume();

        Intent intent = new Intent(getApplicationContext(), PersonalInformationRequest.class);


        singIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}