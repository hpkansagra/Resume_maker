package com.hp.resumemaker;

import static com.hp.resumemaker.R.id.btnSubmit2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public
class Education_Details extends AppCompatActivity {

    private
    EditText edt10th, edt12th, edtcollege, edtgraduation;

    private Button btnsubmit2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_deatails);

        Button btnsubmit2 = (Button)findViewById(btnSubmit2);

        edt10th = findViewById(R.id.edt10th);
        edt12th = findViewById(R.id.edt12th);
        edtcollege = findViewById(R.id.edtcollege);
        edtgraduation = findViewById(R.id.edtgraduation);


        btnsubmit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public


            void onClick(View view) {

                String 10'th = edt10th.getText().toString();
                String 12th = edt12th.getText().toString();
                String college = edtcollege.getText().toString();
                String graduation = edtgraduation.getText().toString();

                Intent Intent =new Intent(Education_Details.this,Hobbies_details.class);
               startActivity(Intent);
            }
        });

    }
}