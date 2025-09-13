import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 =sc.nextLine();
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(list.contains(str.charAt(i))){
                continue;
            }
            else{
                list.add(str.charAt(i));
            }
        }
        int flag=1;
        for(int i=0;i<str.length();i++){
            if(list.contains(str2.charAt(i))){
                continue;
            }
            else{
                flag=0;
            }
        }
               if(flag == 0){
                   System.out.println("No");
               }
               else{
                   System.out.println("Yes");
               }
    }
}
