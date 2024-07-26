import java.util.*;

public class homeWork2 {
    public static void main(String[] args) {
        // List 사용
        ArrayList<String> arr = new ArrayList<String>();
        Set<String> setarr = new HashSet<String>();
        Map<Integer, String> maparr = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.equals("List")) {
            String a = sc.nextLine();
            System.out.println(s + a);
            while (true) {
                String ac = sc.nextLine();
                if (ac.equals("끝")) {
                    break;
                }
                arr.add(ac);
            }
            for (int i = 0; i < arr.size(); i++) {
                System.out.println((i + 1) + ". " + arr.get(i));
            }
        }

        if(s.equals("Set")) {
            String a = sc.nextLine();
            System.out.println(s + a);
            while(true) {
                String ac = sc.nextLine();
                if (ac.equals("끝")) {
                    break;
                }
                arr.add(ac);
            }
            for (int i = 0; i < arr.size(); i++) {
                System.out.println((i + 1) + ". " + arr.get(i));
            }
        }

        if(s.equals("Map")) {
            String a = sc.nextLine();
            System.out.println(s + a);
            int p = 0;
            while(true) {
                String ac = sc.nextLine();
                if (ac.equals("끝")) {
                    break;
                }

                p++;
                maparr.put(p, ac);
            }
            for (int i=1;i<=maparr.size();i++) {
                System.out.println(i + maparr.get(i));
            }

        }

    }
}
