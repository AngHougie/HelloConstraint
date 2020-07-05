package com.example.HelloConstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    View v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);

        toast.show();
    }

    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        if(mCount%2==0)
            view.setBackgroundColor(getResources().getColor(R.color.even));
        if(mCount%2!=0)
            view.setBackgroundColor(getResources().getColor(R.color.odd));
        v=findViewById(R.id.button_zero);
        v.setBackgroundColor(getResources().getColor(R.color.green));
    }

    public void countZero(View view) {
        mCount=0;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        view.setBackgroundColor(getResources().getColor(R.color.darker_gray));
        v=findViewById(R.id.button_count);
        v.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
    }

}