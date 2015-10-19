package com.example.asoman97.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.ResultSet;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView t = (TextView)findViewById(R.id.textView1);
        final EditText editText = (EditText)findViewById(R.id.editText1);
        Intent intent = getIntent();
        t.setText(intent.getStringExtra("text"));
        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFinish();
            }
        });
    }

   /* @Override
    protected void onStop()
    {
        super.onStop();
        onFinish();
    }*/

    private void onFinish()
    {
        EditText editText = (EditText)findViewById(R.id.editText1);
        if(!editText.getText().toString().equals(""))
        {
            Intent result = new Intent();
            result.putExtra("text",editText.getText().toString());
            setResult(RESULT_OK, result);
            super.onBackPressed();
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Сначала введите текст", Toast.LENGTH_SHORT).show();
        }

    }
}
