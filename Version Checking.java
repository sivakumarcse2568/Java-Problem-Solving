import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ver1 = sc.nextLine();
        String ver2 = sc.nextLine();

        String[] text1 = ver1.split("\\s+");
        String[] text2 = ver2.split("\\s+");

        String[] parts1 = text1[1].split("\\.");
        String[] parts2 = text2[1].split("\\.");

        int i=0,j=0;
        while(i<parts1.length||j<parts2.length){
            int v1=0,v2=0;

            if (i<parts1.length){
                v1 = parts1[i].charAt(0) - '0';
            }
            if (j<parts2.length) {
                v2 = parts2[j].charAt(0) - '0';
            }

            if (v1 < v2) {
                System.out.println("upgraded");
                return;
            } else if (v1 > v2) {
                System.out.println("downgraded");
                return;
            }

            i++;
            j++;
        }

        System.out.println("not changed");
    }
}
