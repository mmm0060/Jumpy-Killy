package com.sweatervestcoding.matthew.jumpykilly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/* Not much in the way of fancy mechanics here, just a title screen
a la summoners war. User taps screen to reveal main menu which will simply be
Start and Scores for now. */
public class TitleScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);
    }
}
