import java.io.*;
import java.util.*;
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        
        int i=0,j=n-1;
        while(i<=j){
            if(i==j){
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[j] + " " + arr[i]+" ");
            i++;
            j--;
        }
    }
}
