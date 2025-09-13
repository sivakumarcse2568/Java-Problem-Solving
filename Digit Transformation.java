import java.io.*;
import java.util.*;
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            int val = str.charAt(i) - '0';
            if(val%2 == 0){
                int r = (val*val) % 10;
                System.out.print(r);
            }
            else{
                int r = (val*val*val) % 10;
                System.out.print(r);
            }
        }
    }
}
