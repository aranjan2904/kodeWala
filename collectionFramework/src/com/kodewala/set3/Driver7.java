package com.kodewala.set3;

import java.util.HashSet;
import java.util.Iterator;

public class Driver7 {

    public static void main(String[] args) {

        BusPass b1 = new BusPass(1001, "Abhishek");
        BusPass b2 = new BusPass(1002, "Suraj");
        BusPass b3 = new BusPass(1003, "Mohan");
        BusPass b4 = new BusPass(1004, "Suresh");
        BusPass b5 = new BusPass(1001, "Abhishek");
        BusPass b6 = new BusPass(1005, "Rahul");

        HashSet<BusPass> passSet = new HashSet<>();

        passSet.add(b1);
        passSet.add(b2);
        passSet.add(b3);
        passSet.add(b4);
        passSet.add(b5);
        passSet.add(b6);

        System.out.println(passSet);

        System.out.println("------ For Each ------");

        for (BusPass pass : passSet) {
            System.out.println(pass.holderName);
        }

        System.out.println("------ Iterator ------");

        Iterator<BusPass> itr = passSet.iterator();

        while (itr.hasNext()) {
            BusPass pass = itr.next();
            System.out.println(pass.holderName);
        }
    }
}