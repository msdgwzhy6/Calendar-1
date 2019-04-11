package com.jqueue.calendar;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.jqueue.calendarview.CalendarView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CalendarView calendarView = new CalendarView(this);
        calendarView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        setContentView(calendarView);
    }
}
