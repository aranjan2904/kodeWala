package com.kodewala.override;

public class CommonSms {
	public CommonSms(String name) {
		
	}
}

class SpecificSms extends CommonSms{
	public SpecificSms(String name, int age) {
		super(name);
		// TODO Auto-generated constructor stub
	}
}
