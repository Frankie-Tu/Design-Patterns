package com.frankie.creational.factory;

public class Sunday extends Routine{
    @Override
    public void createRoutine() {
        activities.put("morning", "work");
        activities.put("afternoon", "work");
        activities.put("evening", "more coding");
    }
}
