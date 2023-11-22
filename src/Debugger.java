import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Debugger {

	private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@Test
	void testDebug() {
		System.setOut(new PrintStream(outputStream));

		Debugger debugger = new Debugger();
		debugger.debug("Hello");

		System.setOut(originalOut); 
		assertEquals("Debugging: Hello\n", outputStream.toString());
	}

	public void debug(String hello) {
	}

	@Test
	void testNoDebug() {
		System.setOut(new PrintStream(outputStream));

		Debugger debugger = new Debugger();
		debugger.debug("stop");

		System.setOut(originalOut); 
		assertEquals("", outputStream.toString());
	}
}