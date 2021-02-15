package com.example.cisbookexchange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Log In button */
    public void logIn(View view) {
        //if log in successful, want to display the home page
        Intent intent = new Intent(this, DisplayHomePage.class);
        //check for username and password
        EditText editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        // if(listOfUsernames.contains(editTextUsername) && listOfPasswords.contains(editTextPassword)) { startActivity(intent);}
        startActivity(intent);

    }

    /** Called when the user taps the Register button */
    public void register(View view) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}