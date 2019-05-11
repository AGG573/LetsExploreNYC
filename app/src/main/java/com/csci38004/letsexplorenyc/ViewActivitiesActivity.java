package com.csci38004.letsexplorenyc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class ViewActivitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_activities);

        Button museums = (Button) findViewById(R.id.museums);
        museums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewMuseum = new Intent(ViewActivitiesActivity.this, MuseumInfo.class);
                startActivity(viewMuseum);
                    }
                });

        Button activities = (Button) findViewById(R.id.activites);
        activities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewActivity = new Intent(ViewActivitiesActivity.this, ActivityInfo.class);
                startActivity(viewActivity);
                    }
                });

        Button parks = (Button) findViewById(R.id.parks);
        parks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewPark = new Intent(ViewActivitiesActivity.this, ParkInfo.class);
                startActivity(viewPark);
            }
        });

        Button sightSeeing = (Button) findViewById(R.id.sightseeing);
        sightSeeing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewSights = new Intent(ViewActivitiesActivity.this, MuseumInfo.class);
                startActivity(viewSights);
            }

        });

    }
}

