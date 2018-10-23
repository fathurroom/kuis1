package com.example.fathur.kuis;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ActivityHome extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView btn = (ImageView) findViewById(R.id.img_map);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent();
                i1.setAction(Intent.ACTION_VIEW);
                i1.addCategory(Intent.CATEGORY_BROWSABLE);
                i1.setData(Uri.parse("https://www.google.com/maps/place/Museum+Singhasari/@-7.881243,112.641053,15z/data=!4m5!3m4!1s0x0:0xd7a397a9bba06247!8m2!3d-7.881243!4d112.641053"));
                startActivity(i1);
            }
        });
        ImageView btnn = (ImageView) findViewById(R.id.img_desc);
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getApplicationContext(),Halaman2Activity.class);
                startActivity(i2);
            }
        });
        ImageView btnnn = (ImageView) findViewById(R.id.img_image);
        btnnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getApplicationContext(),Halaman4Activity.class);
                startActivity(i3);
            }
        });
    }
}