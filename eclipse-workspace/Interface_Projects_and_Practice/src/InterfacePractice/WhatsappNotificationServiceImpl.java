package InterfacePractice;

public class WhatsappNotificationServiceImpl implements NotificationService{

	public String i ;
	
	@Override
	public void send(String messege) {
		i = messege;
		System.out.println("Whatsapp Payment Starus : " + messege );
	}

	@Override
	public String getNotificationDetails() {
		
		return "Payment :  "+ i;
	}

}
