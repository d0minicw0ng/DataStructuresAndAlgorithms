package com.dominicwong.CommonProblems;

/**
 * Created by dominicwong on 3/2/15.
 */
public class StackProblems {
    public static double polishNotationCalculator(String str) {
        double[] numbers = new double[50];
        int top = -1;
        String operations = "+-*/%";

        for (int i = str.length() - 1; i >= 0; i--) {
            char val = str.charAt(i);
            try {
                Double doubleVal = Double.parseDouble(Character.toString(val));
                numbers[++top] = doubleVal;
            } catch (NumberFormatException e) {
                if (operations.indexOf(val) != -1) {
                    double numOne = numbers[top--];
                    double numTwo = numbers[top--];
                    double result;

                    switch (val) {
                        case '+':
                            result = numOne + numTwo;
                            numbers[++top] = result;
                            break;
                        case '-':
                            result = numTwo - numOne;
                            numbers[++top] = result;
                            break;
                        case '*':
                            result = numOne * numTwo;
                            numbers[++top] = result;
                            break;
                        case '/':
                            result = numTwo / numOne;
                            numbers[++top] = result;
                            break;
                        case '%':
                            result = numTwo % numOne;
                            numbers[++top] = result;
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        return numbers[top--];
    }
}
