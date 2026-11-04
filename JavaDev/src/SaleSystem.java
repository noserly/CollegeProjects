interface DiscountPolicy{
    double apply(double amount);
    String getName();
}
class NoDiscount implements DiscountPolicy{
    @Override
    public String getName(){
        return "Без скидки";
    }
    @Override
    public double apply(double amount){
        return 0.0;
    }
}
class FixedDiscount implements DiscountPolicy{
    private double amount;
    FixedDiscount(double amount){
        this.setAmount(amount);
    }
    @Override
    public String getName(){
        return "Фикс скидка";
    }
    @Override
    public double apply(double amount){
        if (this.amount>amount){
            return amount;
        }return this.amount;
    }
    public void setAmount(double amount) {
        if(amount<=0){
            System.out.println("Ошибка: скидка должна быть больше 0");
            return;
        }
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
class PercentDiscount implements DiscountPolicy{
    private double percent;
    PercentDiscount(double percent){
        this.setPercent(percent);
    }
    public double getPercent() {
        return percent;
    }
    public void setPercent(double percent) {
        if(percent<0||percent>100){
            System.out.println("Ошибка: процент должен быть от 0 до 100");
            return;
        }
        this.percent = percent;
    }
    @Override
    public String getName(){
        return "Процентная скидка";
    }
    @Override
    public double apply(double amount){
        return amount*percent/100.0;
    }
}
class Order{
    private int id;
    private double amount;
    private DiscountPolicy policy;
    Order(int id,double amount,DiscountPolicy policy){
        this.setId(id);
        this.setAmount(amount);
        this.setPolicy(policy);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        if(id<=0){
            System.out.println("Ошибка: id должен быть больше 0");
            return;
        }
        this.id = id;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        if(amount<=0){
            System.out.println("Ошибка: сумма должна быть больше 0");
            return;
        }
        this.amount = amount;
    }
    public DiscountPolicy getPolicy() {
        return policy;
    }
    public void setPolicy(DiscountPolicy policy) {
        if(policy==null){
            System.out.println("Ошибка: политика не может быть null");
            return;
        }
        this.policy = policy;
    }
    public double getDiscount(){
        return policy.apply(amount);
    }
    public double getFinalAmount(){
        return amount-getDiscount();
    }
    public void printOrder(){
        System.out.println("Заказ #" + id + ": сумма " + amount + ", политика \"" + policy.getName() + "\", скидка " + getDiscount() + ", итого " + getFinalAmount());
    }
}


public class SaleSystem {
    public static void main(String[] args) {
        Order order = new Order(101, 1000, new NoDiscount());
        order.printOrder();
        System.out.println("---");

        order.setPolicy(new FixedDiscount(150));
        order.printOrder();
        System.out.println("---");

        order.setPolicy(new PercentDiscount(20));
        order.printOrder();
        System.out.println("---");

        order.setPolicy(new FixedDiscount(5000));
        order.printOrder();
        System.out.println("---");

        System.out.println("Проверка валидации:");
        new FixedDiscount(-10);
        new PercentDiscount(150);
        order.setPolicy(null);
        Order bad = new Order(0, -100, null);
    }

}
