package com.example.myfirstbuildingapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView,textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageView=findViewById(R.id.secondimageID);
        textView=findViewById(R.id.secondtextID);
       // textView1=findViewById(R.id.secondtextID1);
        Bundle bundle=getIntent().getExtras();

        imageView.setImageResource(bundle.getInt("image1"));
        textView.setText(bundle.getString("details"));
       // textView.setText(bundle.getString("others"));



    }
}
