package com.kodewala.polymorphism;

class Notification {
	void send() {
		System.out.println("sending notification");
	}
}

class Email extends Notification{
	@Override
	void send() {
		System.out.println("sending Email");
	}
}

class SMS extends Notification {
	@Override
	void send() {
		System.out.println("sending sms");
	}
}

class WhatsApp extends Notification{
	@Override
	void send() {
		System.out.println("sending whatsapp message");
	}
}

//processor Class
class NotificationService{
	void sendNotification(Notification n) {
		n.send();
	}
}

public class NotificationSystem {
	public static void main(String[] args) {
		
		NotificationService service = new NotificationService();
		
		Notification n1 = new Email();
		Notification n2 = new SMS();
		Notification n3 = new WhatsApp();
		
		service.sendNotification(n1);

	}
}
