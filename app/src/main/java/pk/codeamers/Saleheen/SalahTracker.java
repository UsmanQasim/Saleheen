package pk.codeamers.Saleheen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;

public class SalahTracker extends AppCompatActivity {
    CalendarView calender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salah_tracker);
        calender = (CalendarView) findViewById(R.id.calendar);
        calender.setMaxDate(System.currentTimeMillis());
    }
}