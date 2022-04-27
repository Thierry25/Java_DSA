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

        sort(numbers);
        System.out.println(numbers);
    }

    /**
     * @param list O(n2)
     */
    public static void sort(ArrayList<Number> list){
        for(int i = 0; i < list.size(); i++){
            Number min = list.get(i);
            int currentIndex = i;

            for(int j = i + 1; j < list.size(); j++){
                if(list.get(j).doubleValue() < min.doubleValue()){
                    min = list.get(j);
                    currentIndex = j;
                }
            }

            if(currentIndex != i){
                // Swap the values
                list.set(currentIndex, list.get(i));
                list.set(i, min);
            }
        }
    }
}
