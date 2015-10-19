package com.example.boris.android_homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActivityBase {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startUI();
        initButton();
    }

    private void initButton() {
        button = (Button) findViewById(R.id.FirstViewButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!editText.getText().toString().equals("")){
                    Intent intent = new Intent(getApplicationContext(), SecondAvtivity.class);
                    intent.putExtra("Text", editText.getText().toString());
                    startActivityForResult(intent, 1);
                }
                else
                    showErrorToast();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1 && resultCode == RESULT_OK){
            setText(data.getStringExtra("ResultText"));
        }

    }

    @Override
    protected void initTextView() {
        textView = (TextView)findViewById(R.id.FirstTextView);
    }

    @Override
    protected void initEditText() {
        editText = (EditText)findViewById(R.id.EditText);
    }
}
