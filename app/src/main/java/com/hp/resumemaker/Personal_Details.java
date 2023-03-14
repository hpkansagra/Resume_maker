package com.hp.resumemaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public
class Personal_Details extends AppCompatActivity {

    private EditText  edtName, edtEge, edtGender, edtNumber, edtEmail, edtAddress ;

    private Button btnsubmit;
    @SuppressLint("MissingInflatedId")
    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_details);

        btnsubmit = (Button) findViewById(R.id.btnSubmit);

        edtName = findViewById(R.id.edtName);
        edtEge = findViewById(R.id.edtAge);
        edtGender = findViewById(R.id.edtGender);
        edtNumber = findViewById(R.id.edtNumber);
        edtEmail = findViewById(R.id.edtEmail);
        edtAddress = findViewById(R.id.edtAddress);


        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View view) {

                String name = edtName.getText().toString();
                String age = edtEge.getText().toString();
                String gender = edtGender.getText().toString();
                String number = edtNumber.getText().toString();
                String email  = edtEmail.getText().toString();
                String address = edtAddress.getText().toString();


                if (name.isEmpty()) {
                    edtName.setError("Enter Name!");
                } else if (age.isEmpty()) {
                    edtEge.setError("Enter your Age");
                }
                else if (gender.isEmpty()) {
                    edtEge.setError("Enter your Gender");
                }
                else if (number.isEmpty()) {
                    edtEge.setError("Enter your Number");
                }
                else if (email.isEmpty()) {
                    edtEge.setError("Enter your Email");
                }
                else if (address.isEmpty()) {
                    edtEge.setError("Enter your Address");
                }else {
                    Intent Intent = new Intent(Personal_Details.this,work_history.class);
                    startActivity(Intent);
                }

            }
        });

    }
}