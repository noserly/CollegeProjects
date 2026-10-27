import java.util.Scanner;
public class backendValidator {
    public static boolean isValidEmail(String email){
        boolean isNotEmpty = email.length()!=0;
        if (isNotEmpty) {
            int countOfDog = 0;
            int countOfSpace = 0;
            for (int i = 0; i < email.length(); i++) {
                char c = email.charAt(i);
                if (c == '@') countOfDog += 1;
                if (c == ' ') countOfSpace += 1;
            }
            if (countOfDog == 1 && countOfSpace == 0) {
                int countOfSymvBeforeDog = 0;
                int lastDotIndex=email.lastIndexOf('.');
                for (int i=0;i<email.indexOf('@');i++) {
                    countOfSymvBeforeDog++;
                }
                if (countOfSymvBeforeDog >0 &&lastDotIndex != -1 && lastDotIndex > email.indexOf('@') && (email.length() - lastDotIndex - 1) >= 2){
                    return true;
                }

            } else {
                return false;
            }
        }else {
            return false;}
        return false;
    }
    public static void main(String[] args){

    }
}
