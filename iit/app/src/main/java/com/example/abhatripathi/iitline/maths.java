package com.example.abhatripathi.iitline;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class maths extends AppCompatActivity {
    Button btn1,btn2;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maths);

        btn1=findViewById(R.id.mainsMaths);
        btn2=findViewById(R.id.advanceMaths);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(maths.this,mathsMainsTopics.class);
                startActivity(i);
            }
        });


//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i=new Intent(maths.this,mathsMainsTopics.class);
//                startActivity(i);
//            }
//        });


    }
}
