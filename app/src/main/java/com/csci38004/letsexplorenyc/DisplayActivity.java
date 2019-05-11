package com.csci38004.letsexplorenyc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Button activityButton = (Button) findViewById(R.id.viewActivities);
        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewActivities = new Intent(DisplayActivity.this, ViewActivitiesActivity.class);
                startActivity(viewActivities);
            }
        });

        Button boroughButton = (Button) findViewById(R.id.viewBoroughs);
        boroughButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewBoroughs = new Intent(DisplayActivity.this, ViewBoroughsActivity.class);
                startActivity(viewBoroughs);
            }
        });
    }
}
