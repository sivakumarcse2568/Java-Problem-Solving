import java.util.*;
class Square_root {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			double sqrt = 0;

			for (int i=0;i<=n;i++) {
				if (i * i <= n) {
					sqrt = i;
				} 
			}
			double inc = 0.1;
			for (int i=0;i<5;i++){ 
				while ((sqrt + inc) * (sqrt + inc) <= n) {
					sqrt += inc;
				}
				inc /= 10; 
			}
			System.out.printf("%.5f",sqrt);
	}
}
