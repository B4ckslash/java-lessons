public class Main {
    public static void main(String[] args) {
        StdoutLogger logger = new StdoutLogger();
        logger.WriteToLog("test", "Started.", StdoutLogger.DebugLevel.LEVEL_INFO);
    }
}
