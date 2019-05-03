package com.frankie.creational.factory;

public class Friday extends Routine {
    @Override
    public void createRoutine() {
        activities.put("morning", "work");
        activities.put("afternoon", "work");
        activities.put("evening", "exercise");
    }
}
