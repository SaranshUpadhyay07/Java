import java.util.Arrays;

public class Section_9_SearchingAndMatching {
    public static void main(String[] args) {

        String[]sArray ={"Able", "gote"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));

        if(Arrays.binarySearch(sArray, "gote")>=0){
            System.out.println("Found it");
        }

        int[] s1 ={1,2,3,4,5};
        int[] s2 ={1,2,3,4,5};

        if(Arrays.equals(s1,s2)){ //Take the order of the items and the array length 
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
