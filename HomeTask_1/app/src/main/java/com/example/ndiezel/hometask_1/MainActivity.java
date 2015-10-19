package com.example.ndiezel.hometask_1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static private int PICK_TEXT_BOX = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText editText = (EditText)findViewById(R.id.editText);
                if(editText.getText().toString().matches(""))
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Сначала введите текст";
                    int duration = Toast.LENGTH_SHORT;
                    Toast.makeText(context, text, duration).show();
                }
                else {
                    Intent intent = new Intent(getWindow().getContext(), SecondActivity.class);
                    intent.putExtra("EXTRA_TEXT_FROM_MAIN_ACTIVITY", editText.getText().toString());
                    startActivityForResult(intent, PICK_TEXT_BOX);
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == PICK_TEXT_BOX) {
            if (resultCode == RESULT_OK) {
                Bundle extras = data.getExtras();
                String newText = extras.getString("EXTRA_FROM_SECOND_ACTIVITY");
                TextView textView = (TextView)findViewById(R.id.textView);
                textView.setText(newText);
            }
        }

    }
}
