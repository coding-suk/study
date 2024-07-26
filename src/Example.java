import java.util.Scanner;

public class Example {
    public Example() {

        Scanner sc = new Scanner(System.in);

        int asciiNumber = sc.nextInt();
        char ch = (char)asciiNumber; // 문자로 형변환을 해주면 숫자에 맞는 문자로 표현

        System.out.println(ch);
    }
}
