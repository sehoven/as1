package ca.ualberta.cs.shoven_habittracker;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by shoven on 2016-09-27.
 */

public class HabitList {
    private ArrayList<Habit> habitList;

    public HabitList() {
        this.habitList = new ArrayList<>();
    }

    public ArrayList<Habit> getHabitList() {
        return habitList;
    }

    public void addHabit(Habit habit) {
        if(!habitList.contains(habit)) {
            this.habitList.add(habit);
        }
    }

    public void removeHabit(Habit habit) {
        if(habitList.contains(habit)) {
            this.habitList.remove(habit);
        }
    }

    public void clear() {
        this.habitList = new ArrayList<>();
    }

    public boolean hasHabit(Habit habit) {
        return habitList.contains(habit);
    }
}
