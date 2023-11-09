public class Radinmatning {

	public static void main(String[] args) {
		TextReader textreader = new TextReader();
		System.out.println("Skriv en rad (eller 'stop' för att avsluta):");

		while (textreader.userInput()) {}
	}
}

