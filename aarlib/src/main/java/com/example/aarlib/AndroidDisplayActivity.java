package com.example.aarlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AndroidDisplayActivity extends AppCompatActivity {

    public static final String JAVA_JOKE = "com.example.jokelib.JavaJoke.Joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_display);
        String javaJoke = "No jokes are available currently :(";

        if(getIntent().hasExtra(JAVA_JOKE)){
            Intent startingActivityIntent = getIntent();
            javaJoke = startingActivityIntent.getStringExtra(JAVA_JOKE);
        }

        TextView javaJokeTv = findViewById(R.id.joke_display_tv);
        javaJokeTv.setText(javaJoke);
    }
}
