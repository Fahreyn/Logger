package InterFaces;

public class Utils {
//static yaptýðýmýz zaman newlememize gerek kalmadan sadece clasýn ismini baþa yazarak diðer classlarda kullanabiliriz.

	public static void runLoggers(Logger[] loggers, String message) {
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
}
