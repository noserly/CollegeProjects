import java.util.Scanner;
import static java.lang.Math.abs;

public class kw2{
    static void main(String[] args){
        Scanner scaner = new Scanner(System.in);
        int price = 8;

        int m1 = Integer.parseInt(scaner.nextLine());
        if (!(m1==1||m1==2||m1==5||m1==10)){
            System.out.print("Ошибка: неверная монета");
            return;
        }
        int m2 = Integer.parseInt(scaner.nextLine());
        if (!(m2==1||m2==2||m2==5||m2==10)){
            System.out.print("Ошибка: неверная монета");
            return;
        }
        int m3 = Integer.parseInt(scaner.nextLine());
        if (!(m3==1||m3==2||m3==5||m3==10)){
            System.out.print("Ошибка: неверная монета");
            return;
        }
        int m4 = Integer.parseInt(scaner.nextLine());
        if (!(m4==1||m4==2||m4==5||m4==10)){
            System.out.println("Ошибка: неверная монета");
            return;
        }

        int sum = m1+m2+m3+m4;
        if (sum<price){
            System.out.println("Нехватает рублей: "+(price-sum));
        }
        else if (sum==price){
            System.out.println("Внесено: "+sum);
            System.out.println("Сдачи нет");
        }
        else if (sum>price){
            int sd = (sum-price);
            System.out.println("Внесено: "+sum);
            System.out.println("Сдача: "+sd);

            int c10 = 0;
            int c5 = 0;
            int c2 = 0;
            int c1 = 0;

            if (sd>=10){
                c10 = sd/10;
                sd = sd-(10*c10);
            }
            if (sd>=5){
                c5 = sd/5;
                sd = sd-5*c5;
            }
            if (sd>=2){
                c2 = sd/2;
                sd = sd-2*c2;
            }
            else {
                c1 = sd;
            }
            System.out.println("Сдача: 10 x " + c10 + ", 5 x " + c5 + ", 2 x " + c2 + ", 1 x " + c1);
        }
    }
}