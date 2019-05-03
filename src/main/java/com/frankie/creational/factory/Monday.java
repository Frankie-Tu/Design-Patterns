package com.frankie.creational.factory;

public class Monday extends Routine{

    @Override
    public void createRoutine() {
        activities.put("morning", "work");
        activities.put("afternoon", "work");
        activities.put("evening", "exercise");
    }
}
