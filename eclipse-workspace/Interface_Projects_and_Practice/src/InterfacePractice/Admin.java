package InterfacePractice;

public class Admin {

	public static void main(String[] args) {
		
		NotificationService service = null;
		
		service = new EmailNotificationServiceImpl();
		service = new SmsNotificationServiceImpl();
		service = new WhatsappNotificationServiceImpl();
		
		service.send("Success");
		
	}
	
}
