package com.example.boris.android_homework;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by boris on 19.10.15.
 */
public class SecondAvtivity extends ActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String intetntStrig = getIntent().getStringExtra("Text");

        setText(intetntStrig);

        startUI();
    }

    @Override
    protected void initTextView() {
        textView = (TextView)findViewById(R.id.SecondTextView);
    }

    @Override
    protected void initEditText() {
        editText = (EditText) findViewById(R.id.SecondEditText);
    }

    @Override
    public void onBackPressed() {
        if(!editText.getText().toString().equals("")){
            Intent intent = new Intent();
            intent.putExtra("ResultText", editText.getText().toString());
            setResult(RESULT_OK, intent);
            super.onBackPressed();
        }
        else
            showErrorToast();
    }
}
