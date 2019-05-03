package com.frankie.creational.factory;

import org.junit.Test;

public class RoutinePlannerTest {
    @Test
    public void mondayTest () {
        for (Weekdays weekday: Weekdays.values()){
            Routine myRoutine = RoutinePlanner.getRoutine(weekday);
            System.out.println(String.format("=====================%s======================", weekday));
            for (Time time: Time.values()){
                myRoutine.showActivities(time); // manual testing. Also to check if showActivities method throws any errors
            }
        }
    }
}