package edu.hzuapps.androidlabs.soft1614080902123;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Soft1614080902123Activity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soft1614080902123);
        Button button1=(Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent intent=new Intent(Soft1614080902123Activity.this,SecondActivity.class);
                startActivity(intent);
            }
        });



    }



}