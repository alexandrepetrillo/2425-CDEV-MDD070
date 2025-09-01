package singleton.bon;

public class Logger {
    private Logger() {
    }

    private static Logger logger = new Logger();

    public static Logger getLogger() {
        return logger;
    }
}