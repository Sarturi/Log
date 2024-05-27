public class Main {
    public static void main(String[] args) {
        // Log no console
        ConsoleLogger.log(ConsoleLogger.LogLevel.DEBUG, "Mensagem de debug");
        ConsoleLogger.log(ConsoleLogger.LogLevel.WARNING, "Mensagem de aviso");
        ConsoleLogger.log(ConsoleLogger.LogLevel.ERROR, "Mensagem de erro");

        // Log em arquivo
        FileLogger.log(FileLogger.LogLevel.DEBUG, "Mensagem de Debug");
        FileLogger.log(FileLogger.LogLevel.WARNING, "Mensagem de aviso");
        FileLogger.log(FileLogger.LogLevel.ERROR, "Mensagem de erro");
    }
}
