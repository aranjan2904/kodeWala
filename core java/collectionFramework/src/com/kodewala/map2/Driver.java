package com.kodewala.map2;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Laptop");
		list.add("Mobile");
		list.add("Keyboard");
		list.add("Screen");
		list.add("Mouse");
		
	     for(String p : list) {
	    	 if(p.startsWith("M")) {
	    		 list.remove(p);
	    	 }
	     }
	     
	     System.out.println(list);
		
	}
}
