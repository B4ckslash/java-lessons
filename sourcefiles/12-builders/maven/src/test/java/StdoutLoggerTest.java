import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StdoutLoggerTest {
    private StdoutLogger logger;
    @BeforeEach
    public void setup() {
        logger = new StdoutLogger();
    }

    @Test
    public void generateLogMsgTest() {
        String expected = "[TIME]test: [INFO]Generated unit test message" + System.lineSeparator();
        String actual = logger.generateLogMsg("test", "Generated unit test message", StdoutLogger.DebugLevel.LEVEL_INFO);
        assertTrue(expected.equals(actual));
    }
}
