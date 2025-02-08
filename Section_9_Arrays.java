import java.util.*;
public class Section_9_Arrays {
    public static void main(String[] args) {
        int[] integerArray;
        int integerArray2 [];
        int[] integerArray3 = new int[10];

        integerArray3[9]=10;

        int [] integerArray4 = new int[]{1,2,3,4,5,6}; // The array initializer
        int [] integerArray5 ={1,2,3,4,5,6};// The array initializer as an anonymous array

        System.out.println(integerArray5[2]);
        System.out.println(integerArray4.length);

        int[] array = new int[5];
        int [] array2 = new int[5];

        for(int i=0;i<array.length;i++){
            array[i]=i+1;
        }
        System.out.println(Arrays.toString(array));

        for(int element:array){
            System.out.println(element); // For each loop
        }
        Object objectVariable = array;

        if(objectVariable instanceof int[]){
            System.out.println("it is an int array");
        }
    }
}
