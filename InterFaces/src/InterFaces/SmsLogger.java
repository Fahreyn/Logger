package InterFaces;
// bir class bir interfaceden implement ederken implements anahtar kelimesi kullan�l�r
public class SmsLogger implements Logger {

	@Override
	public void log(String message) {
		
		System.out.println("Sms g�nderildi:"+ message);
		
	}

}
