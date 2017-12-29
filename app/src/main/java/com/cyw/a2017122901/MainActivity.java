package com.cyw.a2017122901;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Log","This is on create!");
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Log","This is on resume!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Log","This is on stop!!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Log","this is on destroy!!!");
    }

    public void click1(View v)
    {
        Intent it=new Intent();
        it.setAction(Intent.ACTION_SEND);
        it.setType("text/plain");
        it.putExtra(Intent.EXTRA_TEXT,"這是要分享的文字");
        startActivity(it);
    }
    public void click2(View v)
    {
        Intent it=new Intent();
        it.setAction(Intent.ACTION_SEND);
        it.setType("image/jpeg");
        Uri uri=Uri.parse("android.resource://" +
                getApplicationContext().getPackageName() + "/" + R.drawable.rainbow);
        it.putExtra(Intent.EXTRA_STREAM,uri);
         //it.putExtra(Intent.EXTRA_STREAM,Uri.fromFile(@);
        startActivity(it);

    }
}
