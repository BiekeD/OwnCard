package com.example.android.owncard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getNewText(View view){
        TextView finalTextView = (TextView) findViewById(R.id.finaltext);
        finalTextView.setText("I changed the text");
    }
}
