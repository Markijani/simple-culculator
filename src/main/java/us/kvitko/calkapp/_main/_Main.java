package us.kvitko.calkapp._main;

import us.kvitko.calkapp.service.ResultWriteService;

import static us.kvitko.calkapp.util.Calculator.*;

public class _Main {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;
        int result = add(num1, num2);
        int result1 = subtract(num1,num2);
        int result2 = multiply(num1, num2);
        ResultWriteService.printResult(num1,num2, "addition", result);
        ResultWriteService.printResult1(num1,num2, "subtraction", result1);
        ResultWriteService.printResult2(num1, num2,"multiplication", result2);
    }



}
