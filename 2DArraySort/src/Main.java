import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[][] x= {{3,1}, {2, -1}, {2,0}};
        Arrays.sort(x, (e1, e2) -> e1[1] < e2[1] ? -1 : e1[1] == e2[1] ? 0 : 1);

        for(double[] doubles : x){
            for(double aDouble : doubles) System.out.print(aDouble + " ");
        }

    }
}