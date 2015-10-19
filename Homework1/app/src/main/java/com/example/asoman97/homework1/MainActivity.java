package com.example.asoman97.homework1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static final int REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText1 = (EditText)findViewById(R.id.editText1);
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!editText1.getText().toString().equals(""))
                {
                    Intent intent = new Intent(
                          getWindow().getContext(),Main2Activity.class);
                    intent.putExtra("text", editText1.getText().toString());
                    startActivityForResult(intent,REQUEST);
                } else {
                    Toast.makeText(getApplicationContext(),"Введите текст в поле!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if(requestCode == REQUEST)
        {
            if(resultCode == RESULT_OK)
            {
                TextView t = (TextView)findViewById(R.id.textView1);
                t.setText(data.getStringExtra("text"));

            }
        }
    }

    @Override
    protected void onResume(){
        super.onResume();
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setBackgroundColor(Color.BLACK);

    }

}
