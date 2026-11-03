abstract class PaymentMethod{
    private double amount;
    PaymentMethod(double amount){
        this.setAmount(amount);
    }
    public void setAmount(double amount){
        if (amount<=0){
            System.out.println("Ошибка: сумма должна быть больше 0");
            return;
        }
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public abstract double getCommissionPercent();
    public abstract String getMethodName();

    ////////////////////////////////////
    public double getFinalAmount(){
        return amount+amount*getCommissionPercent()/100.0;
    }
    public void pay(){
        System.out.println("Оплата через "+getMethodName()+": сумма "+amount+", комиссия "+getCommissionPercent()+"%, итого "+getFinalAmount());
    }
    //////////////////////////////////////

}
class CardPayment extends PaymentMethod{
    CardPayment(double amount){
        super(amount);
    }
    @Override
    public double getCommissionPercent(){
        return 2.0;
    }
    @Override
    public String getMethodName(){
        return "Банковская карта";
    }
}
class WalletPayment extends PaymentMethod{
    WalletPayment(double amount){
        super(amount);
    }
    @Override
    public double getCommissionPercent(){
        return 1.0;
    }
    @Override
    public String getMethodName(){
        return "Электронный кошелек";
    }
}
class CashPayment extends PaymentMethod{
    CashPayment(double amount){
        super(amount);
    }
    @Override
    public double getCommissionPercent(){
        return 0.0;
    }
    @Override
    public String getMethodName(){
        return "Наличные";
    }
}
public class PayMethod {
    public static void main(String[] args) {
        PaymentMethod[] methods = new PaymentMethod[3];
        methods[0] = new CardPayment(1000);
        methods[1] = new WalletPayment(1000);
        methods[2] = new CashPayment(1000);

        for (int i = 0; i < methods.length; i++) {
            methods[i].pay();
            System.out.println("---");
        }

        System.out.println("Проверка валидации:");
        CardPayment bad = new CardPayment(-500);
        bad.pay();
    }

}
