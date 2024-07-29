package week3.homework;

public class Calculator {
    AddOperation addOperation;
    SubtractOperation subtractOperation;
    MultiplyOperation multiplyOperation;
    DivideOperation divideOperation;

    public Calculator() {
        this.addOperation = new AddOperation();
        this.subtractOperation = new SubtractOperation();
        this.multiplyOperation = new MultiplyOperation();
        this.divideOperation = new DivideOperation();


    }

    public double calculator(String Operator, int firstNumber, int secondNumber) {

        double result = 0.0;

        if (Operator.equals("+")) {
            result = firstNumber + secondNumber;

        } else if (Operator.equals("-")) {
            result = firstNumber - secondNumber;

        } else if (Operator.equals("*")) {
            result = firstNumber * secondNumber;

        } else if (Operator.equals("/")) {
            if (secondNumber != 0) {
                result = firstNumber / secondNumber;
            } else {
                System.out.println("0을 분모로 나눌수 없습니다.");
            }
        }
        return result;
    }
}