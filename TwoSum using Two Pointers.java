import java.util.*;
public class TwoSum_using_2_ptr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter target Sum:");
		int target = sc.nextInt();
		
		int left  = arr[0], right = arr.length-1;
		int flag = 1;
		
		while(left < right) {
			int cur_Sum = arr[left] + arr[right];
			if(cur_Sum > target) {
				right--;
			}
			else if(cur_Sum < target) {
				left++;
			}
			else if(cur_Sum == target) {
				System.out.println("Two Sum elem:");
				System.out.print(arr[left]+" "+ arr[right]);
				flag = 0;
				break;
			}
			
		}
		if(flag != 0) {
			System.out.println("Invalid Target!");
		}
		
	}
	

}
