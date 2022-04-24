package com.example.yes2life;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button doctorbtn = (Button) findViewById(R.id.listDoctors);

        doctorbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDoctor();
            }
        });


    }
    public  void openDoctor(){
        Intent intent = new Intent(this, Doctors_search.class);
        startActivity(intent);
    }

}