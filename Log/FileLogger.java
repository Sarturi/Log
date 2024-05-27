import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger {
    private static final String FILENAME = "log.txt";

    public enum LogLevel {
        DEBUG, WARNING, ERROR
    }

    public static void log(LogLevel level, String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String logMessage = timestamp + " [" + level + "] " + message + System.lineSeparator();

        try {
            Files.write(Paths.get(FILENAME), logMessage.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo");
            e.printStackTrace();
        }
    }
}
