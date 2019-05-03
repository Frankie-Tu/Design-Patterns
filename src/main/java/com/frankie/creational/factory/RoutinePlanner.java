package com.frankie.creational.factory;

// factory pattern, delegating responsibility of deciding which class to be instantiated to the subclass
// done by implementing abstract create method from super class
// in this case, Routine is an abstract class with getRoutine abstract method which is implement in subclass such as Monday to create Monday object based on implementation
// similar to java.util.Calendar
public class RoutinePlanner {
    public static Routine getRoutine(Weekdays day){
        switch (day){
            case MONDAY: { return new Monday(); }
            case TUESDAY:{ return new Tuesday(); }
            case WEDNESDAY:{return new Wednesday();}
            case THURSDAY:{ return new Thursday(); }
            case FRIDAY:{ return new Friday(); }
            case SATURDAY:{ return new Saturday(); }
            case SUNDAY:{ return new Sunday(); }
            default : { return null; }
        }
    }
}
