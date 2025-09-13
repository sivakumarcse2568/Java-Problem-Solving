import java.util.*;
public class Main
{
    static void primeFact(int a,int num){
        if(num == 1){
            return;
        }
        while(num % a != 0){
            a++;
        }
        System.out.print(a+" ");
        primeFact(a,(num/a));
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a Number: ");
	    int n = sc.nextInt();
	    primeFact(2,n);
	}
}
