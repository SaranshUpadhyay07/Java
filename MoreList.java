import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
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

        System.out.println("Third item "+ grocery.get(2)); // To get an item from the array list

        if(grocery.contains("Mustard")){
            System.out.println("There is Mustard"); // .contains() gives a boolean
        }

        grocery.add("Yogurt");
        System.out.println("first Yogurt is at the index: "+grocery.indexOf("Yogurt")); //Will give the index when yogurt first time appears
        System.out.println("Last Yogurt is at the index: "+grocery.lastIndexOf("Yogurt")); //Will give the index when yogurt last time appears

        System.out.println(grocery);
        grocery.remove(1);
        System.out.println(grocery);
        grocery.remove("Yogurt"); //Will remove the first Yogurt
        System.out.println(grocery);

        grocery.removeAll(List.of("Apples", "Eggs")); // will remove all the elements at all the places
        System.out.println(grocery);

        grocery.retainAll(List.of("Apples","Milk","Mustard","Cheese"));//Apart from these items all will be removed
        System.out.println(grocery);

        grocery.clear();
        System.out.println(grocery);
        System.out.println("isEmpty = "+ grocery.isEmpty());

        grocery.addAll(List.of("Apples", "Milk", "Mustard", "Cheese"));
        grocery.addAll(Arrays.asList("Eggs", "Pickles","Mustard","Ham"));

        System.out.println(grocery);
        grocery.sort(Comparator.naturalOrder()); //This allows instances to be compared with one another
        System.out.println(grocery);

        grocery.sort(Comparator.reverseOrder());
        System.out.println(grocery);

        var groceryArray = grocery.toArray(new String[grocery.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }
}

// A Factory Method is a static method that creates and returns an object. Instead of manually creating a list using new ArrayList<>(), the List.of() method creates a list for us.
