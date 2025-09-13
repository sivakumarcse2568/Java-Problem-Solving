import java.io.*;
import java.util.*;
class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        int x=0;
        while(n!=0){
            arr[x] = n % 2;
            n = n / 2;
            x++;
        }
        for(int i=arr.length;i>=k;i--){
            if((i == k) && (arr[i] == 1)){
                System.out.print("true");
                return;
            }
        }
        System.out.print("false");
    }
}
