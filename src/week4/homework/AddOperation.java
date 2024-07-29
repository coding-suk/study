package week4.homework;

import week4.homework.AbstractOperation;

public class AddOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}