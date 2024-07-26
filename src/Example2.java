import java.util.Scanner;

public class Example2 {
    public Example2() {
        Scanner sc = new Scanner(System.in);

        char letter = sc.nextLine().charAt(0); // 첫번째 글자만 받아오기위해 charAt(0) 메서드를 사용
        int asciiNumber = (int)letter; //숫자로 형변환을 해주면 저장되어있더 아스키 숫자값으로 표현

        System.out.println(asciiNumber);
    }
}
