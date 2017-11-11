package com.sweatervestcoding.matthew.jumpykilly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


/*This will be the main controller for the gameplay itself.
There will be separate files for movement mechanics, enemy ai,
enemy wave contents, map data, etc. This file will tie everything together
to run teh actual game.*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
