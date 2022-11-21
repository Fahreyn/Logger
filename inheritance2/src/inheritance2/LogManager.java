package inheritance2;

public class LogManager {

	public void log(int logType) {

//Bu yazým yanlýþtýr!!!

		if (logType == 1) {
			System.out.println("veritabanýna loglandý");
		} else if (logType == 2) {
			System.out.println("Dosyaya loglandý");
		} else {
			System.out.println("Email gönderildi");
		}
	}
}
//1 - Database
//2 - File
//3 - Email