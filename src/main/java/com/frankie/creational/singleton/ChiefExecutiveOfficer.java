package com.frankie.creational.singleton;

/*
Allows only one instance of the class at runtime
 */
public class ChiefExecutiveOfficer {
    // memory visibility, all threads get the latest value from main memory
    private static volatile ChiefExecutiveOfficer onlyInstance = null;

    // Private constructor so the class can only be instantiated with getInstance method
    private ChiefExecutiveOfficer() {}

    // lazy execution
    public static ChiefExecutiveOfficer getInstance(){
        if (onlyInstance == null) {
            // thread safe, other threads cannot access this class until it is released
            synchronized (ChiefExecutiveOfficer.class) {
                // Check volatile onlyInstance value after the lock is released
                if (onlyInstance == null) {
                    onlyInstance = new ChiefExecutiveOfficer();
                }
            }
        }

        return onlyInstance;
    }
}
