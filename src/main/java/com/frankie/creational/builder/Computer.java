package com.frankie.creational.builder;

// StringBuilder is an example of builder pattern in Java

public class Computer {
    // static so it can be called without initiating Computer class first
    // Computer object will be instantiated by calling build() method only, no public Computer constructor
    // No setters and only final variables in Computer class to ensure immutability
    public static class Builder {
        private String cpu = "default cpu";
        private String discreteGpu;
        private String ram = "default ram";
        private String motherboard = "default motherboard";
        private String cooling = "default cooling";
        private String powerSupply = "default power supply";
        private String hardDrive = "default hard drive";
        private String computerCase = "default case";

        // returns Computer object with private variables specified in this Builder class
        public Computer build () {
            return new Computer(this);
        }

        public Builder cpu (String cpu){
            this.cpu = cpu;
            return this; // returns this object instance which is Builder
        }

        public Builder discreteGpu (String discreteGpu){
            this.discreteGpu = discreteGpu;
            return this;
        }

        public Builder ram (String ram){
            this.ram = ram;
            return this;
        }
        public Builder motherboard (String motherboard){
            this.motherboard = motherboard;
            return this;
        }
        public Builder cooling (String cooling){
            this.cooling = cooling;
            return this;
        }
        public Builder powerSupply (String powerSupply){
            this.powerSupply = powerSupply;
            return this;
        }
        public Builder hardDrive (String hardDrive){
            this.hardDrive = hardDrive;
            return this;
        }
        public Builder computerCase (String computerCase){
            this.computerCase = computerCase;
            return this;
        }
    }
    // immutability
    private final String cpu;
    private final String discreteGpu;
    private final String ram;
    private final String motherboard;
    private final String cooling;
    private final String powerSupply;
    private final String hardDrive;
    private final String computerCase;

    private Computer (Builder myBuild) {
        this.cpu = myBuild.cpu;
        this.discreteGpu = myBuild.discreteGpu;
        this.ram = myBuild.ram;
        this.motherboard = myBuild.motherboard;
        this.cooling = myBuild.cooling;
        this.powerSupply = myBuild.powerSupply;
        this.hardDrive = myBuild.hardDrive;
        this.computerCase = myBuild.computerCase;
    }

    // only getter methods
    public String getCpu() {
        return cpu;
    }

    public String getDiscreteGpu() {
        return discreteGpu;
    }

    public String getRam() {
        return ram;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getCooling() {
        return cooling;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public String getComputerCase() {
        return computerCase;
    }
}
