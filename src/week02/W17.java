package week02;

import java.util.Scanner;

public class W17 {
    public static void main(String[] args) {
        //입력받는 단을 제외하고 출력
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt(); //출력을 제외할 구구단수 값

        for(int i=2;i<10;i++) {
            if(i == passNum) {
                continue;
            }
            for(int j=1;j<10;j++) {
                System.out.println(i+"단: "+ i + " x " + j +"="+ i*j);
            }
        }

        //구구단
        for(int i=2;i<10;i++) {
            for(int j=1;j<10;j++) {
                System.out.println(i+"단: "+ i + " x " + j +"="+ i*j);
            }
        }
    }
}
