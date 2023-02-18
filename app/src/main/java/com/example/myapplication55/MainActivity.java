package com.example.myapplication55;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Application";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Context context = getApplicationContext();
        CharSequence text = "Hello everybody, now we are in 'onCreate'!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "Ошибка в методе onCreate");
        Log.w(TAG, "Предупреждение в методе onCreate");
        Log.i(TAG, "Информация в методе onCreate");
        Log.d(TAG, "Откладка в методе onCreate");
        Log.v(TAG, "Подробности в методе onCreate");
    }
    @Override
    protected void onStart() {
        Context context = getApplicationContext();
        CharSequence text = "Now we are in 'onStart'!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
        super.onStart();
        Log.e(TAG, "Ошибка в методе onStart");
        Log.w(TAG, "Предупреждение в методе onStart");
        Log.i(TAG, "Информация в методе onStart");
        Log.d(TAG, "Откладка в методе onStart");
        Log.v(TAG, "Подробности в методе onStart");
    }
    @Override
    protected void onStop() {
        Context context = getApplicationContext();
        CharSequence text = "Now we are in 'onStop'!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
        super.onStop();
        Log.e(TAG, "Ошибка в методе onStop");
        Log.w(TAG, "Предупреждение в методе onStop");
        Log.i(TAG, "Информация в методе onStop");
        Log.d(TAG, "Откладка в методе onStop");
        Log.v(TAG, "Подробности в методе onStop");
    }
    @Override
    protected void onDestroy() {
        Context context = getApplicationContext();
        CharSequence text = "Now we are in 'onDestroy'!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
        super.onDestroy();
        Log.e(TAG, "Ошибка в методе onDestroy");
        Log.w(TAG, "Предупреждение в методе onDestroy");
        Log.i(TAG, "Информация в методе onDestroy");
        Log.d(TAG, "Откладка в методе onDestroy");
        Log.v(TAG, "Подробности в методе onDestroy");
    }
    @Override
    protected void onPause() {
        Context context = getApplicationContext();
        CharSequence text = "Now we are in 'onPause'!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
        super.onPause();
        Log.e(TAG, "Ошибка в методе onPause");
        Log.w(TAG, "Предупреждение в методе onPause");
        Log.i(TAG, "Информация в методе onPause");
        Log.d(TAG, "Откладка в методе onPause");
        Log.v(TAG, "Подробности в методе onPause");
    }
    @Override
    protected void onResume() {
        Context context = getApplicationContext();
        CharSequence text = "Now we are in 'onResume'!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
        super.onResume();
        Log.e(TAG, "Ошибка в методе onResume");
        Log.w(TAG, "Предупреждение в методе onResume");
        Log.i(TAG, "Информация в методе onResume");
        Log.d(TAG, "Откладка в методе onResume");
        Log.v(TAG, "Подробности в методе onResume");
    }
}