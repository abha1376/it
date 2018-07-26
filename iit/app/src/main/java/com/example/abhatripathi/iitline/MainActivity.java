package com.example.abhatripathi.iitline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("TAG", "onCreate: splash activity called" );
//        ImageView image = findViewById(R.id.image);
//        image.setImageDrawable(getResources().getDrawable(R.drawable.splash));

        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(MainActivity.this, googleLogin.class);
                            startActivity(i);
                            finish();
                        }
                    });

                } catch (InterruptedException e) {
                    Log.e("TAG", "run: error occurred:"+e.getMessage());
                    e.printStackTrace();
                }
            }
        }.start();

    }


}
