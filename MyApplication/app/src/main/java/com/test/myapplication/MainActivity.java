package com.test.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView1;
    private TextView mTextView2;
    private TextView mTextView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView1 = (TextView) findViewById(R.id.text_view_1);
        mTextView1.setText(R.string.app_name);

        mTextView2 = (TextView) findViewById(R.id.text_view_2);
        mTextView2.setText(R.string.app_name);

        mTextView3 = (TextView) findViewById(R.id.text_view_3);
        mTextView3.setText(R.string.app_name);


    }
}
