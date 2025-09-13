import java.io.*;
import java.util.*;
class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = 0;
        int j = str.length() - 1;

        while (i < str.length()) {               
            if (!Character.isLetter(str.charAt(i))) {
                System.out.print(str.charAt(i));
                i++;
            } else {
                while (j >= 0 && !Character.isLetter(str.charAt(j))) {
                    j--;
                }
                if (j >= 0) {
                    System.out.print(str.charAt(j));
                    j--;
                } else {
                    System.out.print(str.charAt(i));
                }
                i++;
            }
        }
    }
}
