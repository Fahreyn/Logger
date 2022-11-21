package inheritance2;

public class Main {

	public static void main(String[] args) {
		//birbirinin alternatifi kodlar için if yazýlmaz her bir alternatif için ayrý classlar oluþturulur.
		
	CustomerManager customermanager = new CustomerManager();
	customermanager.add(new Logger());

	}

}

