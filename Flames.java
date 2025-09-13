import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Boy Name: ");
        String name1 = sc.nextLine().toLowerCase();
        System.out.println("Enter Girl Name: ");
        String name2 = sc.nextLine().toLowerCase();

        List<Character> l1 = new ArrayList<>();
        List<Character> l2 = new ArrayList<>();

        for (int i = 0; i < name1.length(); i++) {
            l1.add(name1.charAt(i));
        }
        for (int i = 0; i < name2.length(); i++) {
            l2.add(name2.charAt(i));
        }

        for (int i = 0; i < l1.size(); i++) {
            for (int j = 0; j < l2.size(); j++) {
                if (l1.get(i).equals(l2.get(j))) {
                    l1.set(i, '2');
                    l2.set(j, '2');
                    break;
                }
            }
        }

        int c = 0;
        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i) != '2') {
                c++;
            }
        }
        for (int i = 0; i < l2.size(); i++) {
            if (l2.get(i) != '2') {
                c++;
            }
        }

        String fla = "FLAMES";
        List<Character> ans = new ArrayList<>();
        for (int i = 0; i < fla.length(); i++) {
            ans.add(fla.charAt(i));
        }

        int index = 0;
        while (ans.size() != 1) {
            index = (index + c - 1) % ans.size();
            ans.remove(index);
        }

        System.out.print(ans.get(0));
    }
}
