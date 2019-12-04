package co.pragra.app;

public class Calculator {

    public int sum(int a, int b){
        return a+b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Dont pass 0");
        }
        return a/b;
    }
}
