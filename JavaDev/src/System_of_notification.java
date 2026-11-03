interface Notifier{
    boolean send(String recipient, String message);
    String getChannelName();
}
class EmailNotifier implements Notifier {
    @Override
    public String getChannelName(){
        return "Email";
    }
    @Override
    public boolean send(String recipient, String message){
        if(recipient.contains("@")){
            System.out.println("Email "+recipient+message);
            return true;
        }
        else {
            System.out.println("Email: некорректный адрес "+recipient);
            return false;
        }
    }
}
class SmsNotifier implements Notifier {
    @Override
    public String getChannelName(){
        return "SMS";
    }
    @Override
    public boolean send(String recipient, String message){
        boolean digitsOnly = true;
        for (int i = 0; i < recipient.length(); i++) {
            if (!Character.isDigit(recipient.charAt(i))) { digitsOnly = false; 			break; }
        }
        if (recipient.length()==0||digitsOnly==false){
            System.out.println("SMS: некорректный номер "+recipient);
            return false;
        } else if (message.length()>160) {
            System.out.println("SMS: сообщение слишком длинное ("+message.length()+" символов)");
            return false;
        } else {
            System.out.println("SMS "+recipient+": "+message);
            return true;
        }
    }
}
class PushNotifier implements Notifier {
    @Override
    public String getChannelName(){
        return "Push";
    }
    @Override
    public boolean send(String recipient, String message){
        if (recipient.length()==0){
            System.out.println("Push: пустой идентификатор устройства ");
            return false;
        } else if (message.length()>100) {
            System.out.println("Push: сообщение слишком длинное ("+message.length()+" символов)");
            return false;
        } else {
            System.out.println("SMS "+recipient+": "+message);
            return true;
        }
    }
}


public class System_of_notification {
    public static void main(String[] args) {
        Notifier[] notifiers = new Notifier[3];
        notifiers[0] = new EmailNotifier();
        notifiers[1] = new SmsNotifier();
        notifiers[2] = new PushNotifier();

        String[] recipients = {"user@mail.com", "89991234567", "device-1"};

        for (int i = 0; i < notifiers.length; i++) {
            Notifier n = notifiers[i];
            System.out.println("Канал: " + n.getChannelName());
            System.out.println("Результат: " + n.send(recipients[i], "Привет"));
            System.out.println("---");
        }

        System.out.println("Проверка ошибок:");
        new EmailNotifier().send("no-dog", "Привет");
        new SmsNotifier().send("abc", "Привет");
        new SmsNotifier().send("123", "Очень длинное сообщение, которое точно превышает сто шестьдесят символов и должно быть отклонено системой, потому что SMS не умеет в длинные тексты без разбивки на части.");
        new PushNotifier().send("", "Привет");
        new PushNotifier().send("device-1", "Очень длинное push-сообщение, которое превышает сто символов и должно быть отклонено, потому что push-уведомления короткие.");
    }

}
