package com.frankie.creational.factory;

public class Sunday extends Routine{
    @Override
    public void createRoutine() {
        activities.put("morning", "reading");
        activities.put("afternoon", "play games");
        activities.put("evening", "more coding");
    }
}
