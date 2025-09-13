import java.io.*;
import java.util.*;

class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        Map<Character,Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        
        int tot = 0;
        for(int i=0;i<str.length();i++){
            int val = roman.get(str.charAt(i));
            if(((i+1) < str.length()) && (val < roman.get(str.charAt(i+1)))){
                tot -= val;
            }
            else{
                tot += val;
            }
        }
        System.out.print(tot);
    }
}
