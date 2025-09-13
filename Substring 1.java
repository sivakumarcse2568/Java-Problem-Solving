import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String pattern = sc.nextLine();

        int n = text.length();
        int m = pattern.length();
        int index = -1;

        for(int i=0; i <= n - m; i++){
            int j;
            for(j=0; j<m; j++){
                if(text.charAt(i+j) != pattern.charAt(j)){
                    break;
                }
            }
            if(j == m){ 
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
