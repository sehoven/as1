package ca.ualberta.cs.shoven_habittracker;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by shoven on 2016-09-24.
 */

public class FormattedDate {
    private Integer year;
    private Integer month;
    private Integer day;

    public FormattedDate() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    public FormattedDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    public String getFormattedDate() {
        return Integer.toString(year) + "-" + Integer.toString(month) + "-" + Integer.toString(day);
    }
}