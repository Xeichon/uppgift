import org.junit.jupiter.api.Test;

public class TextAnalyzer {
	public byte lineCount = 0;
	public byte characterCount = 0;
	@Test
	public void count(String text) {
		characterCount += text.length();
		lineCount++;
	}

	public String totalLines()
	{
		return "Antal tecken: " + characterCount + "\nAntal rader (exklusive 'stop'): " + lineCount;
	}
}
