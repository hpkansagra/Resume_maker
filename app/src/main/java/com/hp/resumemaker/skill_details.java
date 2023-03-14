package com.hp.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public
class skill_details extends AppCompatActivity {

    private Button btnsubmit4;


    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill_details);

        Button btnsubmit4 =(Button) findViewById(R.id.btnSubmit4);
        btnsubmit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View v) {
                Intent Intent = new Intent(skill_details.this,projects_details.class);
                startActivity(Intent);
            }
        });
    }
}