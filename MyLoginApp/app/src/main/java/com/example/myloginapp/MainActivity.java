package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username =(TextView) findViewById(R.id.Username);
        TextView password =(TextView) findViewById(R.id.Password);

        Button loginbtn =(Button) findViewById(R.id.loginbtn);
        //Anil Kumar and A@123

        loginbtn.setOnClickListener(new View. OnClickListener() {
            @Override
            public void onClick(View v) {

                if(username.getText().toString().equals("Anil Kumar")&& password.getText().toString().equals("1234")){
                    //correctpassword
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();

                }else{
                    //incorrect
                    Toast.makeText(MainActivity.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();

                }

            }
        });
        }

    }