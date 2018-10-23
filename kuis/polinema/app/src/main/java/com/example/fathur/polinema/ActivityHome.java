package com.example.fathur.kuis;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class ActivityHome extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btn = (Button) findViewById(R.id.bt_profil);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(),ActivityProfil.class);
                startActivity(i1);
            }
        });
        Button btnn = (Button) findViewById(R.id.bt_nilai);
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getApplicationContext(),ActivityNilai.class);
                startActivity(i2);
            }
        });

        Button btnnn = (Button) findViewById(R.id.bt_motto);
        btnnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getApplicationContext(),ActivityMotto.class);
                startActivity(i3);
            }
        });
    }
}