package com.example.markos.basicuicontrols2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.loginText);
        ArrayAdapter<String> array = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,
                new String[]{"Koren", "Ivka", "Marek", "Francine", "Erika", "Lubos"});
        actv.setAdapter(array);
    }

    public void loginButtonAction(View view){
        EditText loginText = (EditText) findViewById(R.id.loginText);
        String login = loginText.getText().toString();
        EditText passwordText = (EditText) findViewById(R.id.passwordText);
        String password = passwordText.getText().toString();
        Toast.makeText(getApplicationContext(), login+" "+password,Toast.LENGTH_SHORT).show();
    }
}
