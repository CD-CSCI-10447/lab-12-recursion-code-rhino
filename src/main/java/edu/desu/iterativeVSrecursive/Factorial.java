package edu.desu.iterativeVSrecursive;

public class Factorial {

    public static int factorialIterative(int n) {
        int factorialResult = 1; // We start off at 1
        for (int i = 1; i <= n; i++) { // we start off at 1 and we continue until i = n
            factorialResult = factorialResult * i; // take the previous result and multiply that by i
        }
        return factorialResult;
    }

    // Todo : Complete Function
    public static int factorialRecursive(int n) {
        if (n <= 1){
            return 1;
        }
        // step n! = n * (n-1)!
        return n * factorialRecursive(n-1);
    }
}
