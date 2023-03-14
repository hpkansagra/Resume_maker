package com.hp.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public
class work_history extends AppCompatActivity {

    private EditText edtCompneyname, edtPost, edtExperience;

    private Button btnsubmit1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_history);

         btnsubmit1 =(Button) findViewById(R.id.btnSubmit1);

         edtCompneyname = findViewById(R.id.edtCompneyname);
         edtPost = findViewById(R.id.edtPost);
         edtExperience = findViewById(R.id.edtExperience);


        btnsubmit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View view) {

                String compneyname = edtCompneyname.getText().toString();
                String post = edtPost.getText().toString();
                String experience = edtExperience.getText().toString();

                if (compneyname.isEmpty()) {
                    edtCompneyname.setError("Enter CompneyName");
                } else if (post.isEmpty()) {
                    edtPost.setError("Enter post");
                } else if (experience.isEmpty()) {
                    edtExperience.setError("Enter experience");
                }else {
                    Intent Intent = new Intent(work_history.this, Education_Details.class);
                    startActivity(Intent);
                }
            }
        });
    }
}