package com.example.wassimelahmar.tutorialfriday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Berries extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berries);

        Bundle applesData = getIntent().getExtras();
        if(applesData == null)
        {
            return;
        }
        String appleMessage = applesData.getString("appleMessage");
        final TextView berriesTextView = (TextView) findViewById(R.id.berriesTextView);
        berriesTextView.setText(appleMessage);
    }
}
