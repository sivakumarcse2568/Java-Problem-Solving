import java.io.*;
import java.util.*;
class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int totSum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            totSum += arr[i];
        }
        int leftSum = 0,rightSum=0,flag=0;
        for(int i=0;i<n;i++){
            rightSum = totSum - leftSum - arr[i];
            if(leftSum == rightSum){
                System.out.print(i);
                flag=1;
                break;
            }
            leftSum += arr[i];
        }
        if(flag == 0){
            System.out.print("-1");
        }
        
        
    }
}
