package com.frankie.creational.factory;

import java.util.HashMap;

public abstract class Routine {

    HashMap<String, String> activities = new HashMap<>();

    public void showActivities (Time time)  {
        String timeRequested = null;

        switch (time){
            case MORNING:{ timeRequested = "morning"; break; }
            case AFTERNOON: { timeRequested = "afternoon"; break; }
            case EVENINING: { timeRequested = "evening"; break; }
        }
        System.out.println(String.format("My routine for %s is %s", timeRequested, activities.get(timeRequested)));
    }

    public Routine(){
        this.createRoutine();
    }

    public abstract void createRoutine();
}
