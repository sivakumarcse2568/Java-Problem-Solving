import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] prev = {1};

        for (int i = 1; i <= n; i++) {
            int[] curr = new int[i];
            curr[0] = 1;
            curr[i - 1] = 1;

            for (int j = 1; j < i - 1; j++) {
                curr[j] = prev[j - 1] + prev[j];
            }

            for (int num : curr) {
                System.out.print(num + " ");
            }
            System.out.println();

            prev = curr;
        }
    }
}
