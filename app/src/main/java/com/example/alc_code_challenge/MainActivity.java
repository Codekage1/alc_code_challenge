package com.example.alc_code_challenge;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

     Button btn_about_alc, btn_my_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_about_alc = findViewById(R.id.btn_about_alc);
        btn_my_profile = findViewById(R.id.btn_my_profile);

        btn_about_alc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigateToWebView = new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(navigateToWebView);

            }
        });
        btn_my_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent navigateToProfileActivity = new Intent (MainActivity.this, ProfileActivity.class);
                startActivity(navigateToProfileActivity);
            }
        });


    }

}

