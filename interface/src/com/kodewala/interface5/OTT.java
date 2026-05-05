package com.kodewala.interface5;


public class OTT implements Cloneable{
	
	String ottName;
	
	OTT(String ottName){
		this.ottName = ottName;
	}
	
	@Override
	public OTT clone() throws CloneNotSupportedException{
		return (OTT) super.clone();
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		OTT ott1 = new OTT("Hotstar");
		
		OTT ott2 = ott1.clone();
		
		System.out.println(ott1.ottName);
		System.out.println(ott2.ottName);
		
		
		// this works internally no need to write code
		if(ott1 instanceof Cloneable) {
			System.out.println(" ott is type of clonable");
		}else {
			System.out.println("ott is not type of clonable");
		}
		
	}

}
