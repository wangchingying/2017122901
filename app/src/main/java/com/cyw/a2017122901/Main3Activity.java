package com.cyw.a2017122901;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {

    ImageView iv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        iv1=findViewById(R.id.imageView);
        String uriString=getIntent().getExtras().get(Intent.EXTRA_STREAM).toString();
        iv1.setImageURI(Uri.parse(uriString));
    }
}
