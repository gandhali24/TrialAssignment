package com.example.trialassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.trialassignment.views.ExploreScreenActivity;
import com.example.trialassignment.views.RefineScreenActivity;

public class MainActivity extends AppCompatActivity {
Button btnRefine,btnExplore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControls();
        initListeners();
    }

    public  void initControls()
    {

        btnRefine=findViewById(R.id.btn_refine);
        btnExplore=findViewById(R.id.btn_explore);


    }
    public void  initListeners()
    {
        btnRefine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               startActivity(new Intent(MainActivity.this, RefineScreenActivity.class));
            }
        });
        btnExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, ExploreScreenActivity.class));
            }
        });

    }
}