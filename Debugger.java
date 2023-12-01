import org.junit.jupiter.api.Test;

public class Debugger {



	@Test
	void testDebug() {


		Debugger debugger = new Debugger();
		debugger.debug("Hello");


	}

	public void debug(String hello) {
	}

	@Test
	void testNoDebug() {

	}
}