public class forTest {
    static void main(String[] args){
        long cash = 0;
        long cents = 0;
        String clean = "198.243";
        for (int i = 0; i<3;i++){
            char c = clean.charAt(i);
            cash += c-'0';
            System.out.print(c);
        }
    }
}
