import java.util.*;

public class Section_9_Arrays_sort_fill_copyof {
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int [] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int [] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int [] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));//the third Array is not sorted
        System.out.println(Arrays.toString(fourthArray));
    }

    private static int [] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];

        for(int i=0;i<len;i++){
            newInt[i]=random.nextInt(100);//Excludes 100
        }
        return newInt;
    }
}
