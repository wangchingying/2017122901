package com.cyw.a2017122901;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1=findViewById(R.id.textView);

        Intent it = getIntent();
        String data = it.getStringExtra(Intent.EXTRA_TEXT);
        tv1.setText(data);
    }

}
