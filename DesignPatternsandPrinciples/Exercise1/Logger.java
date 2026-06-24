public class Logger {

    // Single instance of Logger
    private static Logger instance;

    // Private constructor prevents object creation from outside
    private Logger() {
    }

    // Method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Log method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}