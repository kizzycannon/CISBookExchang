package com.example.cisbookexchange;

import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public ArrayList usernames = new ArrayList<String>();
    public ArrayList passwords = new ArrayList<String>();

    /** Called when the user taps the sign up button on register page */
    public void registration(View view) {
        EditText editTextRegisterUsername = (EditText) findViewById(R.id.editTextRegisterUsername);
        EditText editTextRegisterPassw1 = (EditText) findViewById(R.id.editTextRegisterPassw1);
        EditText editTextRegisterPassw2 = (EditText) findViewById(R.id.editTextRegisterPassw2);
        if(usernames.contains(editTextRegisterUsername)) {
            Intent intent = new Intent(this, Registration_failure.class);
            startActivity(intent);
        }
    }
}