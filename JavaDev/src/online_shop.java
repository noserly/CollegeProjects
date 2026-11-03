class Product{
    private String name;
    private double price;
    private int discountPercent;
    private int stock;
    Product(String name,double price, int discountPercent, int stock){
        this.setName(name);
        this.setPrice(price);
        this.setDiscountPercent(discountPercent);
        this.setStock(stock);
    }
    public void setName(String name){
        if (name==null||name.length()==0){
            System.out.println("Ошибка неверное имя");
            return;
        }
        this.name = name;
    }
    public void setPrice(double price){
        if(price<=0){
            System.out.println("Ошибка: цена должна быть больше 0");
            return;
        }
        this.price = price;
    }
    public void setDiscountPercent(int discountPercent){
        if(discountPercent<0||discountPercent>90){
            System.out.println("Ошибка: неверная скидка");
            return;
        }
        this.discountPercent = discountPercent;
    }
    public void setStock(int stock){
        if(stock<0){
            System.out.println("Ошибка: uncorrect stock");
            return;
        }
        this.stock = stock;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getDiscountPercent(){
        return discountPercent;
    }
    public int getStock(){
        return stock;
    }

    public double getFinalPrice(double price, int discountPercent){
        return price-price*discountPercent/100.0;
    }
    public void sell(int quantiti){
        if(quantiti<=0)System.out.println("Ошибка: количество должно быть больше 0");
        else if (quantiti>stock) System.out.println("Ошибка: недостаточно товара на складе");
        else {
            stock-=quantiti;
            System.out.println("Продано: "+quantiti+" шт. Остаток: "+stock);
        }
    }
    public void printInfo(){
        System.out.println("Товар: "+name+", цена: "+price+", скидка: "+discountPercent+"%, итоговая цена: "+
                getFinalPrice(price,discountPercent)+", остаток: "+stock);
    }
}


public class online_shop {
    public static void main(String[] args) {
        Product p = new Product("Наушники", 5000, 10, 3);
        p.printInfo();
        System.out.println("---");
        p.sell(2);
        p.sell(5);
        p.sell(-1);
        System.out.println("---");
        p.setPrice(100);
        p.setDiscountPercent(75);
        p.setStock(10);
        p.setName("kjsrhgkjeng");
        System.out.println("---");
        p.setDiscountPercent(50);
        p.setStock(10);
        p.printInfo();
    }

}
