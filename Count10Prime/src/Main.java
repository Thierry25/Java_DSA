import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       int COUNT = 1;
       List<Integer> primes = new ArrayList<>();
       primes.add(2);
       int n = 3;
       while(COUNT < 150){
           boolean isPrime = true;
           for(int i = 2; i <= Math.sqrt(n); i++){
               if(n % i == 0){
                   isPrime = false;
                   break;
               }
           }
           if(isPrime){
               primes.add(n);
               COUNT += 1;
           }
           n += 1;
       }
       System.out.println(primes);
    }
}