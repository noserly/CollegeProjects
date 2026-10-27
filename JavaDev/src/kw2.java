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
//            case 10 -> System.out.println("Внимание");
//            case 1 -> System.out.println("Путь свободен");
//            case 110 -> System.out.println("Стой приготовиться");
//            case 11 -> System.out.println("Снизить скорость");
//            case 101 -> System.out.println("Ошибка: несовместимые сигналы");
//            case 111 -> System.out.println("Ошибка: несовместимые сигналы");
//            case 0 -> System.out.println("Ошибка: сигнал не подан");
//            default -> System.out.print("ничего не введено");
//        }
//    }
//}

////3
//import java.util.Scanner;
//public class kw2 {
//    public static int damage(int ur, int resist){
//        int result = ur - ur * 20 * resist / 100;
//        if (result < 1) {
//            result = 1;
//        }
//        return result;
//    }
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//
//        int hp = 100;
//        int resist = 3;
//        int mana = 50;
//        int count = 0;
//        int skip = 0;
//        int lost = 0;
//        int s = 1;
//
//        while (s!=0&&hp>0){
//            s = Integer.parseInt(scan.nextLine());
//            if (s==0){
//                break;
//            }
//            count++;
//            switch (s){
//                case 1:
//                    if (mana-10>=0){
//                        hp = hp - damage(15,resist);
//                        mana -= 10;
//                    }
//                    else {
//                        System.out.println("Нет маны");
//                        skip++;
//                    }
//                    count++;
//                    s = 1;
//                    break;
//                case 2:
//                    if (mana-5>=0){
//                        hp = hp - damage(8,resist);
//                        mana -= 5;
//                    }
//                    else {
//                        System.out.println("Нет маны");
//                        skip++;
//                    }
//                    count++;
//                    s = 2;
//                    break;
//                case 3:
//                    if (mana-20>=0){
//                        hp = hp - damage(25,resist);
//                        mana -= 20;
//                    }
//                    else {
//                        System.out.println("Нет маны");
//                        skip++;
//                    }
//                    count++;
//                    s = 3;
//                    break;
//                case 4:
//                    mana +=15;
//                    count++;
//                    skip++;
//                    s = 4;
//                    break;
//                default:
//                    System.out.println("Неизвестное заклинание");
//                    skip++;
//                    break;
//            }
//            if (resist == 3 && hp < 70) {
//                resist = 2;
//                lost++;
//            } else if (resist == 2 && hp < 40) {
//                resist = 1;
//                lost++;
//            } else if (resist == 1 && hp < 10) {
//                resist = 0;
//                lost++;
//            }
//            System.out.println("Прочность: "+hp+", Мана: "+mana+", Защита: "+resist);
//
//            if (hp<=0) {
//                System.out.println("Замок пал!");
//            }
//        }
//        System.out.println("Ходов: " + count);
//        System.out.println("Пропущено: " + skip);
//        System.out.println("Защиты потеряно: " + lost);
//    }
//}

import com.sun.source.tree.BreakTree;

////4
//import java.util.Scanner;
//public class kw2 {
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        int n = Integer.parseInt(scan.nextLine());
//        int l = Integer.parseInt(scan.nextLine());
//
//        boolean found = false;
//        int counter_of_proveryaemie_chisla = 0;
//        int tecushee_chislo = n;
//        do {
//            int res = tecushee_chislo;
//            int count_of_iteration = 0;
//            if (res!=1){
//                do {
//                    res = (res % 2 == 0) ? res / 2 : (res * 3) + 1;
//                    count_of_iteration += 1;
//                } while (res != 1);
//            }
//            if (count_of_iteration>=l){
//                found = true;
//            }
//            else{
//                tecushee_chislo++;
//                counter_of_proveryaemie_chisla++;
//            }
//        }while(!found&&counter_of_proveryaemie_chisla<1000);
//        if (!found){
//            System.out.println("Не найдено");
//        }
//        else{
//            int res = tecushee_chislo;
//            System.out.println(res);
//            int count_of_iteration = 0;
//            int max = 0;
//            if (res!=1){
//                do {
//                    res = (res % 2 == 0) ? res / 2 : (res * 3) + 1;
//                    count_of_iteration += 1;
//                    System.out.println(res);
//                    if(res>max){
//                        max = res;
//                    }
//                } while (res != 1);
//            }
//            System.out.println("Число: " + tecushee_chislo);
//            System.out.println("Шагов: " + count_of_iteration);
//            System.out.println("Максимум: " + max);
//        }
//    }
//}

//import java.util.Scanner;
//public class kw2 {
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        int reject = 0;
//        int max_bet = 0;
//        int index_of_winner = 0;
//        for (int i=0;i<6;i++){
//            int s = Integer.parseInt(scan.nextLine());
//            if (s<100){reject++;continue;}
//            else if (s>5000){reject++;continue;}
//            else if (s>max_bet){
//                max_bet = s;
//                index_of_winner = i+1;
//            }
//        }
//        System.out.println("Победитель: "+index_of_winner+", ставка: "+max_bet);
//        System.out.println("Отклонено: "+reject);
//    }
//}

////6
//public class kw2 {
//    static int[] boundingBox(int[][] grid){
//        if (grid.length==0||grid==null){
//            return new int[0];
//        }
//        int rows = grid.length;
//        int cols = grid[0].length;
//
//        int top = rows;
//        int bottom = -1;
//        int left = cols;
//        int right = -1;
//        for (int r = 0; r < grid.length; r++){
//            for (int c = 0; c < grid[r].length; c++){
//                if (grid[r][c]==1){
//                    if (r < top) top = r;
//                    if (r>bottom) bottom = r;
//                    if (c<left) left = c;
//                    if (c>right) right = c;
//                }
//            }
//        }
//        if (bottom==-1){return new int[0];}
//        return new int[]{top,left,bottom,right};
//    }
//
//    static int[][] cut(int[][] grid,int[] box) {
//        if (box.length == 0 || box == null || box.length != 4)
//            return new int[0][0];
//        int top = box[0];
//        int left = box[1];
//        int bottom = box[2];
//        int right = box[3];
//        if (top < 0 || left < 0 || bottom >= grid.length || right >= grid[0].length || top > bottom || left > right) {
//            return new int[0][0];
//        }
//        int newRows = bottom - top + 1;
//        int newCol = right - left + 1;
//        int[][] newAr = new int[newRows][newCol];
//        for (int r = top; r <= bottom; r++) {
//            for (int c = left; c <= right; c++) {
//                newAr[r - top][c - left] = grid[r][c];
//            }
//        }
//        return newAr;
//    }
//    static int countOnes(int[][] grid){
//        if (grid.length==0||grid==null){
//            return 0;
//        }
//        int c = 0;
//        for (int i=0;i<grid.length;i++){
//            for (int g=0;g<grid[i].length;g++){
//                if (grid[i][g]==1){
//                    c++;
//                }
//            }
//        }
//        return c;
//    }
//    static int area(int[] box) {
//        if (box == null || box.length != 4) {
//            return 0;
//        }
//
//        int top = box[0];
//        int left = box[1];
//        int bottom = box[2];
//        int right = box[3];
//
//        return (bottom - top + 1) * (right - left + 1);
//
//    }
//        public static void main(String[] args) {
//            int[][] grid = {
//                    {0, 0, 0, 0, 0},
//                    {0, 0, 0, 0, 0},
//                    {0, 0, 0, 1, 0},
//                    {0, 1, 0, 0, 0},
//                    {0, 0, 0, 0, 0}
//            };
//            int[] box = boundingBox(grid);
//            int[][] c = cut(grid, box);
//            for (int[] row : c) {
//                for (int val : row) {
//                    System.out.print(val + " ");
//                }
//                System.out.println();
//            }
//            int count = countOnes(grid);
//            System.out.println(count);
//            int ar = area(box);
//            System.out.println(ar);
//        }
//}

////7
//import java.util.Scanner;
//public class kw2 {
//    static int haming(String a, String b){
//        int hamming = 0;
//        if (a.length()!=b.length())return 0;
//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i) != b.charAt(i)) hamming++;
//        }
//        return hamming;
//    }
//    static int[] diffPosition(String a,String b){
//        int hamming = haming(a,b);
//        if (hamming==0)return new int[0];
//
//        int[] ar = new int[hamming];
//        int ind = 0;
//        for (int i =0; i<a.length();i++){
//            if (a.charAt(i)!=b.charAt(i)) ar[ind++]=i;
//        }
//        return ar;
//    }
//    static char[] diffChars(String a,String b){
//        int hamming = haming(a,b);
//        if (hamming==0)return new char[0];
//        int[] pos = diffPosition(a,b);
//        char[] res = new char[pos.length];
//        int i=0;
//        for (int p : pos){
//            res[i++]=b.charAt(p);
//        }
//        return res;
//    }
//    static int similar(String a, String b){
//        int ham = haming(a,b);
//        return (100-((ham*100)/a.length()));
//    }
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        String a = scan.nextLine();
//        String b = scan.nextLine();
//        int haming = haming(a,b);
//        System.out.println(haming);
//        int[] pos = diffPosition(a,b);
//        System.out.println(java.util.Arrays.toString(pos));
//        char[] res = diffChars(a,b);
//        System.out.println(java.util.Arrays.toString(res));
//        int sim = similar(a,b);
//        System.out.print(sim);
//    }
//}
