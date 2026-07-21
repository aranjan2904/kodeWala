package com.kodewala.set2;

import java.util.HashSet;

class Seat{
	String name;
	
	public Seat(String name) {
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Seat s = (Seat) obj;
		return this.name.equals(s.name);
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	@Override
	public String toString(){
		return name;
	}
}

public class Driver6 {
	public static void main(String[] args) {
		
		HashSet<Seat> seatSet = new HashSet<Seat>();
		
		seatSet.add(new Seat("A1"));
		seatSet.add(new Seat("A2"));
		seatSet.add(new Seat("A3"));
		seatSet.add(new Seat("A1"));
		
		System.out.println(seatSet);
	}
}
