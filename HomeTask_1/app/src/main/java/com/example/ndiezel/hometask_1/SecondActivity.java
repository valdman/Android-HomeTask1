package com.example.ndiezel.hometask_1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            TextView textView = (TextView) findViewById(R.id.textView2);
            textView.setText(extras.getString("EXTRA_TEXT_FROM_MAIN_ACTIVITY"));
        }
    }

    @Override
    public void onBackPressed() {
        EditText editText = (EditText)findViewById(R.id.editText2);
        if(editText.getText().toString().matches("")) {
            Context context = getApplicationContext();
            CharSequence text = "Сначала введите текст";
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(context, text, duration).show();
        }
        else {
            Intent data = new Intent();
            data.putExtra("EXTRA_FROM_SECOND_ACTIVITY",editText.getText().toString());
            setResult(RESULT_OK, data);
            super.onBackPressed();
        }
    }
}
