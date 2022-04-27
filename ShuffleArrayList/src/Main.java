import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(100);
        numbers.add(71);
        numbers.add(3.112);
        numbers.add(1.2112);
        numbers.add(-112132131);
        numbers.add(90121);
        shuffle(numbers);

        System.out.println(numbers);
    }

    public static void shuffle(ArrayList<Number> list){
        for(int i = 0; i < list.size(); i++){
            int randomIndex = (int) (Math.random() * list.size());
            Number randomN = list.get(randomIndex);
            Number currentNumber = list.get(i);
            list.set(i, randomN);
            list.set(randomIndex, currentNumber);

        }
    }
}
