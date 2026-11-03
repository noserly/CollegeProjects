class Account{
    private String login;
    private String email;
    private boolean active;

    Account(String login, String email, boolean active){
        this.setLogin(login);
        this.setEmail(email);
        this.active = active;
    }
    public void setLogin(String login){
        if(login==null||login.length()==0){
            System.out.println("Ошибка неверное имя");
            return;
        }
        this.login = login;
    }
    public void setEmail(String email){
        if(email==null||!email.contains("@")){
            System.out.println("Ошибка неверный эмаил");
            return;
        }
        this.email = email;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public String getRole() {
        return "Account";
    }
    public String getEmail() {
        return email;
    }
    public String getLogin() {
        return login;
    }
    public String[] getPermissions(){
        return new String[0];
    }
    public boolean canEdit(){
        return false;
    }
    public void printInfo(){
        System.out.println("Роль: " + getRole() + ", логин: " + getLogin() + ", email: " + getEmail() + ", активен: " + isActive());
    }
    public boolean isActive(){
        return active;
    }
    public void printPermissions(){
        String[] perms = getPermissions();
        for (int i=0;i<perms.length;i++){
            System.out.println(perms[i]);
        }
    }
}

class AdminAccount extends Account{
    AdminAccount(String login, String email, boolean active){
        super(login, email, active);
    }
    @Override
    public String getRole(){
        return "Admin";
    }
    @Override
    public String[] getPermissions(){
        return new String[]{"read", "edit", "delete", "manage_users"};
    }
    @Override
    public boolean canEdit(){
        return true;
    }
}

class UserAccount extends Account{
    UserAccount(String login, String email, boolean active){
        super(login, email, active);
    }
    @Override
    public String getRole(){
        return "User";
    }
    @Override
    public String[] getPermissions(){
        return new String[]{"read", "edit"};
    }
    @Override
    public boolean canEdit(){
        return true;
    }
}

class GuestAccount extends Account{
    GuestAccount(String login, String email, boolean active){
        super(login, email, active);
    }
    @Override
    public String getRole(){
        return "Guest";
    }
    @Override
    public String[] getPermissions(){
        return new String[]{"read"};
    }
}
public class System_of_accounts {
    public static void main(String[] args) {
        Account[] accounts = new Account[3];
        accounts[0] = new AdminAccount("root", "root@mirea.ru", true);
        accounts[1] = new UserAccount("ivan", "ivan@mirea.ru", true);
        accounts[2] = new GuestAccount("guest", "guest@mirea.ru", false);

        for (int i = 0; i < accounts.length; i++) {
            Account a = accounts[i];
            a.printInfo();
            a.printPermissions();
            System.out.println("Может редактировать: " + a.canEdit());
            System.out.println("---");
        }

        System.out.println("Проверка валидации:");
        UserAccount bad = new UserAccount("", "no-dog", true);
        bad.printInfo();
    }
}
