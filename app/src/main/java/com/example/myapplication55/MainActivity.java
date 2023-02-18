package com.example.myapplication55;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Context context = getApplicationContext();
        CharSequence text = "Hello everybody, now we are in 'onCreate'!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    protected void onStart() {
        Context context = getApplicationContext();
        CharSequence text = "Now we are in 'onStart'!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
        super.onStart();
    }
    @Override
    protected void onStop() {
        Context context = getApplicationContext();
        CharSequence text = "Now we are in 'onStop'!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
        super.onStop();

    }
    @Override
    protected void onDestroy() {
        Context context = getApplicationContext();
        CharSequence text = "Now we are in 'onDestroy'!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
        super.onDestroy();
    }
    @Override
    protected void onPause() {
        Context context = getApplicationContext();
        CharSequence text = "Now we are in 'onPause'!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
        super.onPause();
    }
    @Override
    protected void onResume() {
        Context context = getApplicationContext();
        CharSequence text = "Now we are in 'onResume'!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
        super.onResume();
    }
}