public class Main {
    public static void main(String[] args) {
        Integer[][] list = new Integer[10][10];
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length; j++){
                list[i][j] = (int) (Math.random() * 100);
            }
        }
        print(list);
        System.out.println("--------------------");
        System.out.println();
        System.out.println(max(list));
    }

    public static <E extends Comparable<E>> E max(E[][] list){
        E currentMax = list[0][0];
        for (E[] es : list) {
            for (int j = 0; j < list.length; j++) {
                if (es[j].compareTo(currentMax) > 0) currentMax = es[j];
            }
        }
        return currentMax;
    }

    public static void print(Object[][] list){
        for (Object[] objects : list) {
            for (int j = 0; j < list.length; j++) {
                System.out.print(objects[j] + "  ");
            }
            System.out.println();
        }
    }
}