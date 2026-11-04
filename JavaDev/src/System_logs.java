interface LogHandler{
    void log(String level, String message);
    String getTarget();
}
abstract class BaseLogger implements LogHandler{
    private String prefix;
    BaseLogger(String prefix){
        this.setPrefix(prefix);
    }
    public String getPrefix() {
        return prefix;
    }
    public void setPrefix(String prefix) {
        if(prefix==null||prefix.length()==0){
            System.out.println("Ошибка: префикс не может быть пустым");
            return;
        }
        this.prefix = prefix;
    }
    public String format(String level,String message){
        return prefix + " [" + level + "] " + message;
    }
    abstract void write(String formattedMessage);
    @Override
    public void log(String level, String message){
        if (level==null||level.length()==0){
            level = "INFO";
        }
        if (message==null||message.length()==0){
            System.out.println("Ошибка: пустое сообщение");
            return;
        }
        write(format(level, message));
    }
    @Override
    public abstract String getTarget();
}
class ConsoleLogger extends BaseLogger{
    ConsoleLogger(String prefix){
        super(prefix);
    }
    @Override
    public String getTarget(){
        return "Консоль";
    }
    @Override
    public void write(String formattedMessage){
        System.out.println("[Консоль]"+formattedMessage);
    }
}
class FileLogger extends BaseLogger{
    FileLogger(String prefix){
        super(prefix);
    }
    @Override
    public String getTarget(){
        return "Файл";
    }
    @Override
    public void write(String formattedMessage){
        System.out.println("[Файл]"+formattedMessage);
    }
}
class RemoteLogger extends BaseLogger{
    RemoteLogger(String prefix){
        super(prefix);
    }
    @Override
    public String getTarget(){
        return "Удалённый сервер";
    }
    @Override
    public void write(String formattedMessage){
        System.out.println("[Удалённый сервер]"+formattedMessage);
    }
}
public class System_logs {
    public static void main(String[] args) {
        LogHandler[] handlers = new LogHandler[3];
        handlers[0] = new ConsoleLogger("APP");
        handlers[1] = new FileLogger("APP");
        handlers[2] = new RemoteLogger("APP");

        for (int i = 0; i < handlers.length; i++) {
            LogHandler h = handlers[i];
            System.out.println("Цель: " + h.getTarget());
            h.log("INFO", "Система запущена");
            h.log("WARNING", "Мало памяти");
            h.log("ERROR", "Ошибка соединения");
            h.log("", "Пустой уровень — станет INFO");
            h.log("INFO", "");
            System.out.println("---");
        }

        System.out.println("Проверка валидации:");
        new ConsoleLogger("");
        new FileLogger(null);
    }

}
