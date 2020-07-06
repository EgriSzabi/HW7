package com.example.hw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Ex2_BatteryActivity extends AppCompatActivity {

    private ImageView imageView;
    private int levelIndicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2__battery);
        imageView=findViewById(R.id.imageViewBattery);
        levelIndicator=0;
        imageView.setImageLevel(levelIndicator);
    }

    public void addLevelOnClick(View view) {
        if(levelIndicator<4)
        {
            levelIndicator++;
            imageView.setImageLevel(levelIndicator);
        }
    }

    public void subtractLevelOnClick(View view) {
        if(levelIndicator>0) {
        levelIndicator--;
        imageView.setImageLevel(levelIndicator);
        }
    }
}
