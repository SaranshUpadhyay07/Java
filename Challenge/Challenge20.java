package Challenge;

import java.util.*;

public class Challenge20 {
    public static void main(String[] args) {
        Random random = new Random();

        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        for(int i=0;i<array.length/2;i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
