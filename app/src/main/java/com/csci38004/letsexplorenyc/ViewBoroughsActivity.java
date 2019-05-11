package com.csci38004.letsexplorenyc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class ViewBoroughsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_boroughs);

        Button Manhattan = (Button) findViewById(R.id.ManhattanButton);
        Manhattan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewBoroughsActivity.this, ActivityInfo.class);
                startActivity(intent);
            }
        });

        Button Queens = (Button) findViewById(R.id.QueensButton);
        Queens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewBoroughsActivity.this, MuseumInfo.class);
                startActivity(intent);
            }
        });

        Button Brooklyn = (Button) findViewById(R.id.BrooklynButton);
        Brooklyn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewBoroughsActivity.this, ParkInfo.class);
                startActivity(intent);
            }
        });

    }
}
