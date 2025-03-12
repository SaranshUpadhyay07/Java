import java.util.ArrayList;
import java.util.List;
public class MoreList {
    public static void main(String[] args) {
        String[] items = {"Apples", "Banana", "Milk", "Eggs"};


        List<String> list =List.of(items);//factory method
        System.out.println(list);
        System.out.println(list.getClass().getName());

        ArrayList<String> grocery = new ArrayList<>(list);
        grocery.add("Yogurt");
        System.out.println(grocery);

        ArrayList<String> grocery2 = new ArrayList<>(List.of("Pickle","Mustard","Cheese"));
        System.out.println(grocery2);

        grocery.addAll(grocery2);
        System.out.println(grocery);
    }
}

// A Factory Method is a static method that creates and returns an object. Instead of manually creating a list using new ArrayList<>(), the List.of() method creates a list for us.
