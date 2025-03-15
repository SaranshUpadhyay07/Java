package Challenge;

import java.util.*;

public class Challenge21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> grocery = new ArrayList<String>();
        while(true){
        System.out.println("Enter your choice \n" +
                "0 - to shutdown \n"+
                "1 - to add any items (comma delimited list)\n"+
                "2- to remove any items (comma delimited list)");

            int n = sc.nextInt();

            if(n==0){
                break;
            }
            else if(n==1){
                sc.nextLine();
                String items = sc.nextLine();
                String item[] = items.split("\\s*,\\s*"); // Handles spaces around commas

                for (String s : item) {
                    if (grocery.contains(s)) {
                        continue;
                    }else{
                    grocery.add(s);
                    }
                }
                grocery.sort(Comparator.naturalOrder());
                System.out.println(grocery);
            }
            else if(n==2){
                sc.nextLine();
                String items = sc.nextLine();
                String item[] = items.split("\\s*,\\s*");

                for (String s : item) {
                    if (grocery.contains(s)) {
                        grocery.remove(s);
                    }else{
                        continue;
                    }
                }
                grocery.sort(Comparator.naturalOrder());
                System.out.println(grocery);
            }
            else{
                System.out.println("Invalid choice, Please try again");
            }
        }
    }
}
