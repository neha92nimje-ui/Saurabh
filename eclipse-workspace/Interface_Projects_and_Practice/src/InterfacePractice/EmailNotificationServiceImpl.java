package InterfacePractice;

public class EmailNotificationServiceImpl implements NotificationService{

	public String i ;
	
	@Override
	public void send(String messege) {
		i = messege;
		System.out.println("Email Payment Starus : " + messege );
	}

	@Override
	public String getNotificationDetails() {
		
		return "Payment :  "+i;
	}

	
	
}
