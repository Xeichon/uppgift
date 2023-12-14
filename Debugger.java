import org.junit.jupiter.api.Test;

public class Debugger {


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