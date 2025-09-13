import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Password:");
        String str = sc.nextLine();
        if(str.length() < 8){
            System.out.println("Password Must be of length 8!");
            return;
        }
        int uC=0,lC=0,dig=0,spC=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                uC++;
            }
            else if(Character.isLowerCase(ch)){
                lC++;
            }
            else if(Character.isDigit(ch)){
                dig++;
            }
            else{
                spC++;
            }
        }
        if(uC>0 && lC>0 && dig>0 && spC>0){
            System.out.println("Strong Password!!!");
        }
        else{
            System.out.print("Weak Password!! The passWord must contains ");
            if(uC == 0){
                System.out.print("Atleast 1 Uppercase.");
            }
            else if(lC == 0){
                System.out.print("Atleast 1 Lowercase.");
            }
            else if(dig == 0){
                System.out.print("Atleast 1 Digit.");
            }
            else if(spC == 0){
                System.out.print("Atleast 1 Special Symbol.");
            }
        }
        
    }
}
