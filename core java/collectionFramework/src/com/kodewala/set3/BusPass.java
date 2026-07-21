package com.kodewala.set3;

public class BusPass {

    int passNumber;
    String holderName;

    public BusPass(int passNumber, String holderName) {
        this.passNumber = passNumber;
        this.holderName = holderName;
    }

    @Override
    public boolean equals(Object obj) {
        BusPass bp = (BusPass) obj;
        return this.passNumber == bp.passNumber;
    }
    
    @Override
    public int hashCode() {
        return passNumber;
    }

    @Override
    public String toString() {
        return passNumber + " " + holderName;
    }
}