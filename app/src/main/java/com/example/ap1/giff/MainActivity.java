package com.example.ap1.giff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private Button showGifOneButton = null;

    private Button showGifTwoButton = null;

    private LinearLayout gifLinearLayout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("dev2qa.com - Android Show Gif Use Movie Example.");

        initControls();

        final ShowGifView showGifView = new ShowGifView(getApplicationContext());
        gifLinearLayout.addView(showGifView);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        showGifView.setLayoutParams(layoutParams);

        showGifOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showGifView.setGifImageDrawableId(R.drawable.travelgif);
                showGifView.drawGif();
            }
        });

        showGifTwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showGifView.setGifImageDrawableId(R.drawable.travelgif);
                showGifView.drawGif();
            }
        });

    }

    private void initControls()
    {
        if(showGifOneButton == null)
        {
            showGifOneButton = (Button)findViewById(R.id.showGifOne);
        }

        if(showGifTwoButton == null)
        {
            showGifTwoButton = (Button)findViewById(R.id.showGifTwo);
        }

        if(gifLinearLayout == null)
        {
            gifLinearLayout = (LinearLayout) findViewById(R.id.gifLinearLayout);
        }
    }
}
