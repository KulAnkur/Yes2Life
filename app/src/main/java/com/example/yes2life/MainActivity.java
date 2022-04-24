package com.example.yes2life;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);
        TextView signup = (TextView) findViewById(R.id.Signup);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        // admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                    openHome();

                }else
                    Toast.makeText(MainActivity.this, "Login Fail", Toast.LENGTH_SHORT).show();

                }

        });

        signup.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignup();
            }
        }));
    }

    private void openSignup() {
        Intent intent = new Intent(this, Register_main.class);
        startActivity(intent);
    }

    public void openHome(){
        Intent intent = new Intent(this, HomeAct.class);
        startActivity(intent);
    }
}