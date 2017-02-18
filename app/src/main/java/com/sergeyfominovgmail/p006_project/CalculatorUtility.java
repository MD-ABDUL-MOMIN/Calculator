package com.sergeyfominovgmail.p006_project;

/**
 * Created by Sergey Fominov on 18.02.2017.
 */

public final class CalculatorUtility {
    private CalculatorUtility(){

    }

    //возвращение оператора, если оператор этот равен одному из этих операций, статик, потому что
    //он должен передаться MainActivity
    public static boolean Operator(char op){
        return op == '/' || op == '*' || op == '+' || op == '-';
    }
}
