package com.frankie.creational.factory;

public class Thursday extends Routine{
    @Override
    public void createRoutine() {
        activities.put("morning", "work");
        activities.put("afternoon", "work");
        activities.put("evening", "code challenge");
    }
}
