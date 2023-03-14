package com.hp.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public
class Hobbies_details extends AppCompatActivity {

    private Button btnsubmit3;


    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbies_details);

        Button  btnsubmit3 =(Button) findViewById(R.id.btnSubmit3);

        btnsubmit3.setOnClickListener(new View.OnClickListener() {
        @Override
        public
        void onClick(View v) {
            Intent Intent = new Intent(Hobbies_details.this,skill_details.class);
         startActivity(Intent);
        }
        });
    }
}