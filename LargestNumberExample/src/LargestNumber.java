import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(45);
        list.add(3445.33);
        list.add(new BigInteger("32382212391313"));
        list.add(new BigDecimal("2.2382212391313"));
        System.out.println("The largest number is " + getLargestNumber(list));

    }

    public static Number getLargestNumber(ArrayList<Number> list){
        if(list == null || list.size() == 0) return null;
        Number number = list.get(0);
        for(int i = 1; i < list.size(); i++) number = Math.max(list.get(i).doubleValue(),  number.doubleValue());
        return number;
    }
}
