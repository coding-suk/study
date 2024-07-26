import java.util.Scanner;

public class homeWork1 {
    public homeWork1() {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        float score = sc.nextFloat();


        System.out.println(a);
        if(score == 5) {
            System.out.println("별점 : "+ (int)score + " (100.0%)");
        } else if(score < 5  && score >= 4) {
            System.out.println("별점 : " +(int)score + " (80.0%)");
        } else if (score < 4 && score >= 3) {
            System.out.println("별점 : " +(int)score + " (60.0%)");
        } else if (score < 3 && score >= 2 ) {
            System.out.println("별점 : "+(int)score + " (40.0%)");
        } else if (score < 2 && score > 1 ) {
            System.out.println("별점 : "+(int)score + " (20.0%)");
        } else {
            System.out.println("별점 : "+(int)score + " (0.0%)");
        }

        for (int i = 1; i <= 10; i++) {
            Scanner sc2 = new Scanner(System.in);
            System.out.print(i + "번째: ");
            String b = sc2.nextLine();
            System.out.println(i+"." + b);
        }

    }
}
