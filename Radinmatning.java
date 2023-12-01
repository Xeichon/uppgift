import java.util.Scanner;
public class Radinmatning {
	Scanner scanner = new Scanner (System.in);
	public static void main(String[] args) {
		TextReader textreader = new TextReader();
		System.out.println("Skriv en rad (eller 'stop' för att avsluta):");

		while (true) {
			if(!textreader.userInput()){
				break;
			}
		}
	}
}

