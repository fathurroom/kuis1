package com.example.windows.imagegallery;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class FullImageActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);
        Intent intent = getIntent();
        int position = intent.getExtras().getInt("id");
        ImageAdapter adapter = new ImageAdapter(this);
        imageView = (ImageView)findViewById(R.id.imV);
        imageView.setImageResource(adapter.images[position]);
    }
}
