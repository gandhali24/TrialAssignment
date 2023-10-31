package com.example.trialassignment.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.trialassignment.R;

import java.util.Objects;

public class RefineScreenActivity extends AppCompatActivity {
EditText etAddStatus;
Spinner spAvailability;
    String[] arraySpinner = new String[] {
            "Available | Hey Let Us Connect", "Away | Stay Discrete And Watch", "Busy | Do Not Disturb | Will Catch Up Later",
            "SOS | Emergency! Need Assistance! HELP"

    };

Button btnCoffee,btnBusiness,btnHobbies,
        btnFriendship,btnMovies,btnDinning,
        btnDating,btnMatrimony;
int clickedCount=0;
    boolean myButtonIsClicked1;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine_screen);
        setTitle("Refine");

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_arrow_back_ios_new_24);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initControls();

        changeButtonBackgroundColor();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spAvailability.setAdapter(adapter);
    }

    public  void initControls()
    {
        etAddStatus=findViewById(R.id.et_addStatus);

       spAvailability = (Spinner) findViewById(R.id.sp_availability);


        btnCoffee=findViewById(R.id.btn_coffee);
        btnBusiness=findViewById(R.id.btn_business);
        btnHobbies=findViewById(R.id.btn_hobbies);
        btnFriendship=findViewById(R.id.btn_friendship);
        btnMovies=findViewById(R.id.btn_movies);
        btnDinning=findViewById(R.id.btn_dinning);
        btnDating=findViewById(R.id.btn_dating);
        btnMatrimony=findViewById(R.id.btn_matrimony);

        //etAddStatus.setText(Character.toChars(0x1F389).toString());

    }

    public void changeButtonBackgroundColor()
    {

        btnCoffee.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
             //    tvCoffee.setBackgroundColor(getResources().getColor(R.color.darker_grey));
                if (myButtonIsClicked1) {
                //    btnCoffee.setBackground(getDrawable(R.drawable.layout_textview_corner));
                    btnCoffee.setBackgroundColor(Color.parseColor("#153C59"));
                    btnCoffee.setTextColor(Color.WHITE);
                    myButtonIsClicked1 = false;
                } else {
                   // btnCoffee.setBackground(getDrawable(R.drawable.layout_textview_corner));
                    btnCoffee.setBackgroundColor(Color.parseColor("#d3d3d3"));
                    btnCoffee.setTextColor(Color.parseColor("#153C59"));
                    myButtonIsClicked1 = true;
                }
            }
        });

        btnBusiness.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                //    tvCoffee.setBackgroundColor(getResources().getColor(R.color.darker_grey));
                if (myButtonIsClicked1) {
                    btnBusiness.setBackgroundColor(Color.parseColor("#153C59"));
                    btnBusiness.setTextColor(Color.WHITE);
                    myButtonIsClicked1 = false;
                } else {
                    btnBusiness.setBackgroundColor(Color.parseColor("#d3d3d3"));
                    btnBusiness.setTextColor(Color.parseColor("#153C59"));
                    myButtonIsClicked1 = true;
                }
            }
        });
        btnHobbies.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                //    tvCoffee.setBackgroundColor(getResources().getColor(R.color.darker_grey));
                if (myButtonIsClicked1) {
                    btnHobbies.setBackgroundColor(Color.parseColor("#153C59"));
                    btnHobbies.setTextColor(Color.WHITE);
                    myButtonIsClicked1 = false;
                } else {
                    btnHobbies.setBackgroundColor(Color.parseColor("#d3d3d3"));
                    btnHobbies.setTextColor(Color.parseColor("#153C59"));
                    myButtonIsClicked1 = true;
                }
            }
        });

        btnFriendship.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                //    tvCoffee.setBackgroundColor(getResources().getColor(R.color.darker_grey));
                if (myButtonIsClicked1) {
                    btnFriendship.setBackgroundColor(Color.parseColor("#153C59"));
                    btnFriendship.setTextColor(Color.WHITE);
                    myButtonIsClicked1 = false;
                } else {
                    btnFriendship.setBackgroundColor(Color.parseColor("#d3d3d3"));
                    btnFriendship.setTextColor(Color.parseColor("#153C59"));
                    myButtonIsClicked1 = true;
                }
            }
        });
        btnMovies.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                //    tvCoffee.setBackgroundColor(getResources().getColor(R.color.darker_grey));
                if (myButtonIsClicked1) {
                    btnMovies.setBackgroundColor(Color.parseColor("#153C59"));
                    btnMovies.setTextColor(Color.WHITE);
                    myButtonIsClicked1 = false;
                } else {
                    btnMovies.setBackgroundColor(Color.parseColor("#d3d3d3"));
                    btnMovies.setTextColor(Color.parseColor("#153C59"));
                    myButtonIsClicked1 = true;
                }
            }
        });
        btnDinning.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                //    tvCoffee.setBackgroundColor(getResources().getColor(R.color.darker_grey));
                if (myButtonIsClicked1) {
                    btnDinning.setBackgroundColor(Color.parseColor("#153C59"));
                    btnDinning.setTextColor(Color.WHITE);
                    myButtonIsClicked1 = false;
                } else {
                    btnDinning.setBackgroundColor(Color.parseColor("#d3d3d3"));
                    btnDinning.setTextColor(Color.parseColor("#153C59"));
                    myButtonIsClicked1 = true;
                }
            }
        });
        btnDating.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                //    tvCoffee.setBackgroundColor(getResources().getColor(R.color.darker_grey));
                if (myButtonIsClicked1) {
                    btnDating.setBackgroundColor(Color.parseColor("#153C59"));
                    btnDating.setTextColor(Color.WHITE);
                    myButtonIsClicked1 = false;
                } else {
                    btnDating.setBackgroundColor(Color.parseColor("#d3d3d3"));
                    btnDating.setTextColor(Color.parseColor("#153C59"));
                    myButtonIsClicked1 = true;
                }
            }
        });
        btnMatrimony.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                //    tvCoffee.setBackgroundColor(getResources().getColor(R.color.darker_grey));
                if (myButtonIsClicked1) {
                    btnMatrimony.setBackgroundColor(Color.parseColor("#153C59"));
                    btnMatrimony.setTextColor(Color.WHITE);
                    myButtonIsClicked1 = false;
                } else {
                    btnMatrimony.setBackgroundColor(Color.parseColor("#d3d3d3"));
                    btnMatrimony.setTextColor(Color.parseColor("#153C59"));
                    myButtonIsClicked1 = true;
                }
            }
        });
    }
}