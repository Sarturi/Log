import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleLogger {
    public enum LogLevel {
        DEBUG, WARNING, ERROR
    }

    public static void log(LogLevel level, String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String color;

        switch (level) {
            case DEBUG:
                color = "\u001B[32m"; // Verde
                break;
            case WARNING:
                color = "\u001B[33m"; // Amarelo
                break;
            case ERROR:
                color = "\u001B[31m"; // Vermelho
                break;
            default:
                color = "\u001B[0m"; // Reset
        }

        System.out.println(color + timestamp + " [" + level + "] " + message + "\u001B[0m");
    }
}
