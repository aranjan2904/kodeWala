package com.kodewala.override;

public class CommonReply {
	public CommonReply(String text) {

	}

}

class InstaReply extends CommonReply {
	public InstaReply(String text, int date) {
		super(text);

	}
}