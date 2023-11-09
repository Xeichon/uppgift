import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class TextReader {
	Scanner scanner = new Scanner (System.in);
	TextAnalyzer textAnalyzer = new TextAnalyzer();
	String currentText;

	@Test
	void readText(){
		System.out.print("Rad " + (textAnalyzer.lineCount + 1) + ": ");
		currentText = scanner.nextLine();
	}

	public boolean userInput() {
		readText();

		if(currentText.equalsIgnoreCase("stop")) {
			printTotalLines();
			return false;
		}
		else {
			textAnalyzer.count(currentText);
			return  true;
		}

	}

	@Test
	void printTotalLines(){

		System.out.println(textAnalyzer.totalLines());
	}
}
