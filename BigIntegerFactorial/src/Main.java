import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(new BigInteger("100")));
    }

    public static BigInteger factorial(BigInteger bigInteger){
        if(bigInteger.intValue() == 0) return new BigInteger("1");
        return bigInteger.multiply(factorial(bigInteger.subtract(new BigInteger("1"))));
    }
}