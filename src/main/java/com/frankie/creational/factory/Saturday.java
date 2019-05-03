package com.frankie.creational.factory;

public class Saturday extends Routine{
    @Override
    public void createRoutine() {
        activities.put("morning", "Hang out");
        activities.put("afternoon", "Hang out");
        activities.put("evening", "meditate");
    }
}
