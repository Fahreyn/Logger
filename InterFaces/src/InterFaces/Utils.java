package InterFaces;

public class Utils {
//static yapt���m�z zaman newlememize gerek kalmadan sadece clas�n ismini ba�a yazarak di�er classlarda kullanabiliriz.

	public static void runLoggers(Logger[] loggers, String message) {
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
}
