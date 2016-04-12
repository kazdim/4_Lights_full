package com.example.dk.lights;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private RelativeLayout mRelativeLayout;
    private TextView mInfoTextView;
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        mInfoTextView = (TextView) findViewById(R.id.textView);

        button1 = (Button)findViewById(R.id.buttonRed);
        button2 = (Button)findViewById(R.id.buttonYellow);
        button3 = (Button)findViewById(R.id.buttonGreen);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

    }

/*
    public void onRedBClick(View view) {
        mInfoTextView.setText(R.string.redButton);
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redBkgrnd));
    }
    public void onYellowBClick(View view) {
        mInfoTextView.setText(R.string.yellowButton);
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowBkgrnd));
    }
    public void onGreenBClick(View view) {
        mInfoTextView.setText(R.string.greenButton);
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenBkgrnd));
    }
*/

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonRed:
                mInfoTextView.setText(R.string.redButton);
                mRelativeLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redBkgrnd));
                break;
            case R.id.buttonYellow:
                mInfoTextView.setText(R.string.yellowButton);
                mRelativeLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowBkgrnd));
                break;
            case R.id.buttonGreen:
                mInfoTextView.setText(R.string.greenButton);
                mRelativeLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenBkgrnd));
                break;
        }
    }
}
