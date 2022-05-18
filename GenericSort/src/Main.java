public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {10,9,8,7,6,5,4,11};
        String[] strings = {"Daniel", "Thierry", "Marcelin", "Annie", "Loudwige", "Fabrice", "Kathlyn"};
        Character[] characters = {'z', 'y', 'c', 'e', 'l', 'o'};
        Double[] doubles = {10.10, 123.22, 1.03, 0.001, -1.23};

        sort(intArray);
        sort(strings);
        sort(characters);
        sort(doubles);

        System.out.print("Sorted Integer Objects: ");
        printList(intArray);

        System.out.print("Sorted String Objects: ");
        printList(strings);

        System.out.print("Sorted Character Objects: ");
        printList(characters);

        System.out.print("Sorted Double Objects: ");
        printList(doubles);
    }

    public static <E extends Comparable<E>> void sort(E[] list){
        E currentMin;
        int currentMinIndex;
        for(int i = 0 ; i < list.length; i++){
            currentMin = list[i];
            currentMinIndex = i;

            for(int j = i + 1; j < list.length; j++){
                if(list[j].compareTo(currentMin) < 0){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void printList(Object[] list){
        for(Object o: list){
            System.out.print(o + " ");
        }
        System.out.println();
    }
}