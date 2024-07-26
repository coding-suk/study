package week02.array;

public class Arr02 {
    public static void main(String[] args) {
        //초기화

        //1. 배열에 특정값 대입해서 선언
        int[] intArr = {1,2,3,4,5};
        String[] strArray = {"a", "b", "c", "d", "e"};

        //2. for문을 통해서 대입
        for(int i=0; i<intArr.length;i++) {
            intArr[i] = i;
        }


    }
}
