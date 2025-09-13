import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String words[] = str.split("\\s+");

        for (int i=0;i<words.length;i++){
            String ch = words[i];
            for (int j=0;j<ch.length();j++){
                if (j==0 && Character.isLowerCase(ch.charAt(j))) {
                    System.out.print(Character.toUpperCase(ch.charAt(j)));
                } else {
                    System.out.print(ch.charAt(j));   
                }   
            }   
        }   
    }    
}
