import java.util.*;
class Binary_Search {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = sc.nextInt();
		System.out.println("Enter elements:");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter Target:");
		int t = sc.nextInt();
		int left = arr[0];
		int right = arr[arr.length-1];
		int x=0;
		while(true) {
			x++;
			int mid = (left+right) / 2;
			if(mid == t) {
				System.out.println("Element found at index: "+x);
				break;
			}
			else if(mid > t) {
				right = mid;
			}
			else if(mid < t) {
				left = mid;
			}
		}
	}

}
