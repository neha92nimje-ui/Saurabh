package InterfacePractice;

public class SmsNotificationServiceImpl implements NotificationService{

	
	public String i ;
	
	@Override
	public void send(String messege) {
		i = messege;
		System.out.println("Payment Starus : " + messege );
	}

	@Override
	public String getNotificationDetails() {
		
		return "Payment : " + i;
	}

}
