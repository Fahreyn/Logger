package inheritance2;

public class LogManager {

	public void log(int logType) {

//Bu yaz�m yanl��t�r!!!

		if (logType == 1) {
			System.out.println("veritaban�na logland�");
		} else if (logType == 2) {
			System.out.println("Dosyaya logland�");
		} else {
			System.out.println("Email g�nderildi");
		}
	}
}
//1 - Database
//2 - File
//3 - Email