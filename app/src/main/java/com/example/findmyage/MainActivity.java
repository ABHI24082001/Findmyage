package com.example.findmyage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText etDOB;
    TextView tvShowAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etDOB=(EditText) findViewById(R.id.etDOB);
        tvShowAge=(TextView) findViewById(R.id.tvShowAge);
    }

    public void buFindAge(View view) {
        int DOB=Integer.parseInt(etDOB.getText().toString());
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int Age = year-DOB;
        tvShowAge.setText("Your age is"+Age+"And is month"+Age*12+",In days"+Age*365);
    }
}