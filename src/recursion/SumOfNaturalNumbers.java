package recursion;

import java.math.BigInteger;

public class SumOfNaturalNumbers {
    public static BigInteger recursiveSumOfNaturalNumbers(long n){
        if (n == 0)
            return  BigInteger.valueOf(0);
        else
            return BigInteger.valueOf(n).add(recursiveSumOfNaturalNumbers(n-1));
    }
    public static void main(String[] args) {
        System.out.println(recursiveSumOfNaturalNumbers(100));
    }
}
