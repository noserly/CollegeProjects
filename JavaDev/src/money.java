public class money {
    static boolean hasDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                return true;
            }
        }
        return false;
    }
    public static long parseAmount(String s){
        s = s.trim();
        boolean isNeg = false;
        if (s.startsWith("(") && s.endsWith(")")){
            isNeg = true;
            s = s.substring(1, s.length() - 1);
        }
        String clean = "";
        for (int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            if (c == '-'){
                isNeg = true;
            }else if (c >= '0'&&c<='9')
            {
                clean += c;
            } else if (c == '.'||c==',') {
                clean+=c;
            }
        }
        while (clean.length() > 0 && (clean.charAt(clean.length() - 1) == '.' || clean.charAt(clean.length() - 1) == ',')) {
            clean = clean.substring(0, clean.length() - 1);
        }
        int decind = -1;
        for (int i = clean.length()-1;i>=0;i--){
            if(clean.charAt(i)=='.'||clean.charAt(i)==','){
                decind = i;
                break;
            }
        }
        if (decind!=-1){
            int aftersplit = clean.length()-decind-1;
            if(aftersplit==3){
                decind = -1;
            }
        }
        long cash = 0;
        long cents = 0;
        int pointofcent = (decind==-1)?clean.length():decind;
        for (int i = 0; i<pointofcent;i++){
            char c = clean.charAt(i);
            if (c >= '0' && c <= '9') {
                cash = cash*10 + (c-'0');
            }
        }
        if (decind != -1){
            int countOfNums = 0;
            for (int i = pointofcent+1;i<clean.length();i++){
                char c = clean.charAt(i);
                if (c>='0'&&c<='9'){
                    if (countOfNums==0){
                        cents += 10*(c-'0');
                        countOfNums++;
                    } else if (countOfNums==1) {
                        cents += c-'0';
                        countOfNums++;
                    }
                }
            }
        }
        long totalCent = cash*100+cents;
        if (isNeg){
            return -totalCent;
        }else {
            return totalCent;
        }
    }

    public static String parseCurrency(String s){
        s = s.toUpperCase();
        if (s.contains("РУБ") || s.contains("₽") || s.contains("RUB")) return "RUB";
        if (s.contains("$") || s.contains("USD")) return "USD";
        if (s.contains("€") || s.contains("EUR")) return "EUR";
        return "UNKNOWN";
    }
    public static String amountToWordsShort(long money, String name){
        boolean isNeg = money < 0;
        if (isNeg) {
            money = -money;
        }
        long cents = money % 100;
        money = money / 100;
        long millions = money / 1_000_000;
        long thousands = (money / 1000) % 1000;
        long units = money % 1000;

        String main;
        String small;
        switch (name){
            case "USD":
                main = "долл.";
                small = "ц.";
                break;
            case "EUR":
                main = "евро";
                small = "ц.";
                break;
            default:
                main = "руб.";
                small = "коп.";
                break;
        }

        String res = "";
        if (millions > 0) {
            res += millions + " млн ";
        }
        if (thousands > 0) {
            if (millions > 0) {
                if (thousands < 10) {
                    res += "00";
                } else if (thousands < 100) {
                    res += "0";
                }
            }
            res += thousands + " тыс. ";
        }
        if (millions > 0 || thousands > 0) {
            if (units < 10) {
                res += "00";
            } else if (units < 100) {
                res += "0";
            }
        }
        res += units + " " + main + " ";
        if (cents < 10) {
            res += "0";
        }
        res += cents + " " + small;
        if (isNeg) {
            return "-" + res;
        } else {
            return res;
        }
    }
    public static void main(String[] args){
        String[] amounts = {
                "1 234 567,89 руб.",
                "$1,234.56",
                "1.234.567,89 EUR",
                "1234567.89",
                "100",
                "0,5",
                "1 000",
                "мусор",
                "007,50",
                "-100,50",
                "-$100.50",
                "(100,00)",
                "(0)"
        };
        System.out.print("=== parseAmount and parseCurrency ===\n");
        for (String s:amounts){
            if (!hasDigit(s)) {
                System.out.println("\"" + s + "\"\tошибка");
            } else {
                System.out.println("\"" + s + "\"\t" + parseAmount(s) + "\t" + parseCurrency(s));
            }
        }
        System.out.print("=== amountToWordsShort ===\n");
        long[] sums = {123456789, 123456, 100, 0, 1005000, -10050};
        String[] curs = {"RUB", "USD", "RUB", "RUB", "RUB", "RUB"};
        for (int i = 0;i<sums.length;i++){
            System.out.println(sums[i]+"\t"+curs[i]+"\t"+amountToWordsShort(sums[i],curs[i]));
        }
    }
}
