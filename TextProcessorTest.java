package src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextProcessorTest {

    @Test
    void testTextAnalyzer() {
        TextAnalyzer textAnalyzer = new TextAnalyzer();
        textAnalyzer.count("Hello");
        assertEquals("Antal tecken: 5\nAntal rader (exklusive 'stop'): 1", textAnalyzer.totalLines());
    }

    @Test
    void testDebugger() {
        Debugger debugger = new Debugger();
        debugger.debug("Hello");
        assertEquals("Debugging: Hello\n", debugger.getOutput());
    }

    @Test
    void testTextReader() {
        TextReader textReader = new TextReader();
        textReader.setCurrentText("stop");
        assertEquals("Antal tecken: 0\nAntal rader (exklusive 'stop'): 0\n", textReader.printTotalLines());
    }
}