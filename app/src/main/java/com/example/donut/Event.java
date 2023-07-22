package com.example.donut;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Event extends AppCompatActivity {
    Button get_details,feedback,Event_Descriptions,layout_map;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        get_details=findViewById(R.id.more_details);
        feedback=findViewById(R.id.feedback);
        Event_Descriptions=findViewById(R.id.event_descriptions);
        layout_map=findViewById(R.id.layout_map);
        get_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Event.this,Get_Details.class);
                startActivity(intent);
            }
        });
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Event.this,Feedback.class);
                startActivity(intent);

            }
        });
        Event_Descriptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Event.this,Event_Descriptions.class);
                startActivity(intent);
            }
        });
            layout_map.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(Event.this,Layout_Map.class);
                    startActivity(intent);
                }
            });

    }
}