package com.krishna.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSpotify;
    private Button btnScores;
    private Button btnLibrary;
    private Button btnBuildBigger;
    private Button btnReader;
    private Button btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
    }

    private void initializeViews() {
        btnSpotify = (Button) findViewById(R.id.spotify);
        btnScores = (Button) findViewById(R.id.scores);
        btnLibrary = (Button) findViewById(R.id.library);
        btnBuildBigger = (Button) findViewById(R.id.buildItBigger);
        btnReader = (Button) findViewById(R.id.reader);
        btnCapstone = (Button) findViewById(R.id.capstone);

        btnSpotify.setOnClickListener(this);
        btnScores.setOnClickListener(this);
        btnLibrary.setOnClickListener(this);
        btnBuildBigger.setOnClickListener(this);
        btnReader.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spotify:
                Toast.makeText(MainActivity.this, "This button will launch spotify streamer!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.scores:
                Toast.makeText(MainActivity.this, "This button will launch scores app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.library:
                Toast.makeText(MainActivity.this, "This button will launch library app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buildItBigger:
                Toast.makeText(MainActivity.this, "This button will launch build it bigger app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.reader:
                Toast.makeText(MainActivity.this, "This button will launch xyz reader app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone:
                Toast.makeText(MainActivity.this, "This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
