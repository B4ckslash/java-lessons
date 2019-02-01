public class StdoutLogger {
    public void WriteToLog(String process, String msg, DebugLevel level) {
        String logMsg = generateLogMsg(process, msg, level);
        System.out.println(logMsg);
    }
    public enum DebugLevel {
        LEVEL_INFO("INFO"), LEVEL_CRITICAL("CRITICAL"), LEVEL_DEBUG("DEBUG");
        String out;
        DebugLevel(String out) {
            this.out = out;
        }
        String getOut() {return this.out;}
    }
    public String generateLogMsg(String process, String msg, DebugLevel level) {
        long timestamp = System.nanoTime();
        String ret = String.format("[%s]%s: [%s]%s%n", "TIME", process, level.getOut(), msg);
        return ret;
    }
}

