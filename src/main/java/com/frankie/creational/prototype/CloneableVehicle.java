package com.frankie.creational.prototype;

import com.frankie.oop.interfaces.Vehicle;

public interface CloneableVehicle extends Vehicle, Cloneable {

    CloneableVehicle clone() ;

}
