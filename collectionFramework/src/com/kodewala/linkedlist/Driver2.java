package com.kodewala.linkedlist;

import java.util.LinkedList;

public class Driver2 {

    public static void main(String[] args) {

        LinkedList<String> history = new LinkedList<String>();

        history.add("Google");

        history.add("YouTube");

        history.add("GitHub");

        history.add("ChatGPT");

        System.out.println(history);


        history.add(2, "Instagram");

        System.out.println(history);

        history.remove("Google");

        System.out.println(history);
    }
}