import java.io.*;
import java.util.*;
class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        int arrM[] = new int[n - k + 1];   

        for(int i=0; i <= n-k; i++){       
            int max = arr[i];
            for(int j=i; j < i+k; j++){    
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            arrM[i] = max;
        }

        for(int i=0; i<arrM.length; i++){  
            System.out.print(arrM[i] + " ");
        }
    }
}
