import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String text = "Good morning. Have a good class . " +
                "Have a good visit. Have fun!";

        text = text.toLowerCase();
        Map<String, Integer> count = new TreeMap<>();
        String[] words = text.split("[\\s+\\p{P}]");
        for(String s: words){
            if(count.containsKey(s)){
                int initialVal = count.get(s);
                count.put(s, initialVal + 1);
            }else{
                count.put(s, 1);
            }
        }
        count.forEach((k,v) -> System.out.println(k + "\t" + v));
    }
}