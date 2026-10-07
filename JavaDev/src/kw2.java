//// №1
//import java.util.Scanner;
//import static java.lang.Math.abs;
//
//public class kw2{
//    static void main(String[] args){
//        Scanner scaner = new Scanner(System.in);
//        int price = 8;
//
//        int m1 = Integer.parseInt(scaner.nextLine());
//        if (!(m1==1||m1==2||m1==5||m1==10)){
//            System.out.print("Ошибка: неверная монета");
//            return;
//        }
//        int m2 = Integer.parseInt(scaner.nextLine());
//        if (!(m2==1||m2==2||m2==5||m2==10)){
//            System.out.print("Ошибка: неверная монета");
//            return;
//        }
//        int m3 = Integer.parseInt(scaner.nextLine());
//        if (!(m3==1||m3==2||m3==5||m3==10)){
//            System.out.print("Ошибка: неверная монета");
//            return;
//        }
//        int m4 = Integer.parseInt(scaner.nextLine());
//        if (!(m4==1||m4==2||m4==5||m4==10)){
//            System.out.println("Ошибка: неверная монета");
//            return;
//        }
//
//        int sum = m1+m2+m3+m4;
//        if (sum<price){
//            System.out.println("Нехватает рублей: "+(price-sum));
//        }
//        else if (sum==price){
//            System.out.println("Внесено: "+sum);
//            System.out.println("Сдачи нет");
//        }
//        else if (sum>price){
//            int sd = (sum-price);
//            System.out.println("Внесено: "+sum);
//            System.out.println("Сдача: "+sd);
//
//            int c10 = 0;
//            int c5 = 0;
//            int c2 = 0;
//            int c1 = 0;
//
//            if (sd>=10){
//                c10 = sd/10;
//                sd = sd-(10*c10);
//            }
//            if (sd>=5){
//                c5 = sd/5;
//                sd = sd-5*c5;
//            }
//            if (sd>=2){
//                c2 = sd/2;
//                sd = sd-2*c2;
//            }
//            else {
//                c1 = sd;
//            }
//
//            System.out.print("Монеты:");
//            if (c10>0){
//                System.out.print(" "+c10+"x10");
//            }
//            if (c5 > 0) {
//                System.out.print(" " + c5 + "x5");
//            }
//            if (c2 > 0) {
//                System.out.print(" " + c2 + "x2");
//            }
//            if (c1 > 0) {
//                System.out.print(" " + c1 + "x1");
//            }
//        }
//    }
//}

//// №2
//import java.util.Scanner;
//public class kw2{
//    static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        int s = Integer.parseInt(scanner.nextLine());
//
//        switch (s){
//            case 100 -> System.out.println("Стой");
//            case 010 -> System.out.println("Внимание");
//            case 001 -> System.out.println("Путь свободен");
//            case 110 -> System.out.println("Стой приготовиться");
//            case 011 -> System.out.println("Снизить скорость");
//            case 101 -> System.out.println("Ошибка: несовместимые сигналы");
//            case 111 -> System.out.println("Ошибка: несовместимые сигналы");
//            case 000 -> System.out.println("Ошибка: сигнал не подан");
//            default -> System.out.print("ничего не введено");
//        }
//    }
//}

//3
import java.util.Scanner;
public class kw2 {
    public static int damage(int ur, int resist){
        return (ur*20*resist)/100;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int hp = 100;
        int resist = 3;
        int mana = 50;
        int count = 0;
        int skip = 0;
        int break_defence = 0;
        int s = 1;

        while (s!=0||hp<=0){
            if(40<=hp && hp<70){
                resist = 2;
            }
            else if (10<=hp && hp<40) {
                resist = 1;
            }
            s = Integer.parseInt(scan.nextLine());
            if (s>4||s<0){
                System.out.println("Неизвестное заклинание");
                skip++;
                count++;
            }
            switch (s){
                case 1:
                    if (mana-10>=0){
                        hp = hp - damage(15,resist);
                        System.out.println("Прочность: "+hp+", Мана: "+mana+", Защита: "+resist);
                    }
                    else {
                        System.out.println("Нет маны");
                        skip++;
                    }
                    count++;
                    s = 1;
                    break;
                case 2:
                    if (mana-5>=0){
                        hp = hp - damage(8,resist);
                        System.out.println("Прочность: "+hp+", Мана: "+mana+", Защита: "+resist);
                    }
                    else {
                        System.out.println("Нет маны");
                        skip++;
                    }
                    count++;
                    s = 2;
                    break;
                case 3:
                    if (mana-20>=0){
                        hp = hp - damage(25,resist);
                        System.out.println("Прочность: "+hp+", Мана: "+mana+", Защита: "+resist);
                    }
                    else {
                        System.out.println("Нет маны");
                        skip++;
                    }
                    count++;
                    s = 3;
                    break;
                case 4:
                    mana +=15;
                    count++;
                    skip++;
                    s = 4;
                    break;
                default: break;
            }
        }
        if (hp<=0) {
            System.out.println("Замок пал!");
        }
    }
}