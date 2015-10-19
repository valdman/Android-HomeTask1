package com.example.boris.android_homework;


import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public abstract class ActivityBase extends ActionBarActivity{

    protected TextView textView;
    protected EditText editText;

    void startUI(){
        initTextView();
        initEditText();
    }
    abstract protected void initTextView();
    abstract protected void initEditText();

    protected void setText(String text)
    {
        if(textView != null)
            textView.setText(text);
    };

    protected void showErrorToast(){
        Toast.makeText( getApplicationContext(), "Ошибка $12", Toast.LENGTH_SHORT ).show();

    }
}
