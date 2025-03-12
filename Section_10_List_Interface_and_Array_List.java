import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    public GroceryItem (String name){
        this(name, "DAIRY", 1);
    }
    @Override
    public String toString(){
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}
public class Section_10_List_Interface_and_Array_List {

    public static void main(String[] args) {
    GroceryItem[] groceryArray = new GroceryItem[3];
    groceryArray[0] = new GroceryItem("Bread", "Fresh", 1);
    groceryArray[1] = new GroceryItem("Milk");
    groceryArray[2] = new GroceryItem("Chicken");
    System.out.println(Arrays.toString(groceryArray));

    ArrayList objectList = new ArrayList();
    objectList.add(new GroceryItem("Bread", "Fresh", 1));
    objectList.add("Ohooo");

    ArrayList<GroceryItem> groceryList = new ArrayList<>(); //<> are known as the diamond operator
       groceryList.add(new GroceryItem("Bread", "Fresh", 1));
       groceryList.add(new GroceryItem("Milk"));
       groceryList.addFirst(new GroceryItem("Chicken"));// you can use this or .add(0, new)
       groceryList.remove(1);
        System.out.println(groceryList);
    }
}
