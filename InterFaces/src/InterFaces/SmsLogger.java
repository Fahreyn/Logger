package InterFaces;
// bir class bir interfaceden implement ederken implements anahtar kelimesi kullanılır
public class SmsLogger implements Logger {

	@Override
	public void log(String message) {
		
		System.out.println("Sms gönderildi:"+ message);
		
	}

}
