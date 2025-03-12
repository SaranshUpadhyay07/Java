import java.util.Arrays;
import java.util.Objects;

public class Section_9_TwoD_ThreeD_Arrays {
    public static void main(String[] args) {

        int[][] array = new int[4][4];
        System.out.println(Arrays.toString(array));

        System.out.println("-".repeat(60));
        for(int[] outer: array){
            System.out.println(Arrays.toString(array));
        } 
        System.out.println("-".repeat(60));

        for(var outer: array){
            for(var element: outer){
                System.out.println(element+" ");
            }
            System.out.println();
        }

        System.out.println("-".repeat(60));

        System.out.println(Arrays.deepToString(array));

        System.out.println("-".repeat(60));

        Object[] Anarray = new Object[3];
        Anarray[2] = new int[2][2][2];

        System.out.println(Arrays.deepToString(Anarray));

    }
}
