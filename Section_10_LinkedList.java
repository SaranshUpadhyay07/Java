import java.util.*;
public class Section_10_LinkedList {
    public static void main(String[] args) {
      //  LinkedList <String> placesToVisit = new LinkedList<>();
          var placesToVisit = new LinkedList<String>();

          placesToVisit.add("Mumbai");
          placesToVisit.addFirst("Udaipur");
          System.out.println(placesToVisit);

          addMore(placesToVisit);
          System.out.println(placesToVisit);

          remove(placesToVisit);
          System.out.println(placesToVisit);

          gettingElements(placesToVisit);

          System.out.println("------------------------------------------------------");
          printItinerary(placesToVisit);
          System.out.println();
          System.out.println("------------------------------------------------------");
          testIterator(placesToVisit);

    }

    private static void addMore(LinkedList<String> list) {
        list.addFirst("Puri");
        list.add("Goa");
        //Queue methods
        list.offer("Pune");
        list.offerFirst("Shimla");
        list.offerLast("Chennai");
        //Stack methods
        list.push("Dharamshala");
        list.addLast("Udaipur");
        list.addLast("Varanasi");
    }

    private static void remove(LinkedList<String> list) {
        String s2 = list.removeFirst();
        System.out.println(s2+" was removed");
        String p1 = list.poll();
        System.out.println(p1+" was removed");//first one is remove

        //Stack method
        String t = list.pop();
        System.out.println(t+" was removed");
    }
    private static void gettingElements(LinkedList<String>list){
        System.out.println("Retrieved Element = "+list.get(4));
        System.out.println("Retrieved Element = "+list.getLast());
        System.out.println("Retrieved Element = "+list.getFirst());

        System.out.println("Chennai is at the index: "+list.indexOf("Chennai"));
        System.out.println("Last index of Udaipur is "+list.lastIndexOf("Udaipur"));

        //Queue Retrieval method
        System.out.println("Element from element() = "+list.element());//first item out of the list

        //Stack Retrieval method
        System.out.println("Element from peek() = "+list.peek());
        System.out.println("Element from peekFirst() = "+list.peekFirst());
        System.out.println("Element from peekLast() = "+list.peekLast());
    }
    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip Starts at: "+list.getFirst());
        System.out.println("Trip ends at: "+list.getLast());

        System.out.println("Rest trip goes like:");
        for(String s: list){
            System.out.print(s+" ----> ");
        }
    }

    private static void testIterator(LinkedList<String> list) {
        var iterator = list.listIterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("Udaipur")){
//                iterator.remove();
                iterator.add("Manali");
            }
        }
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);
    }


}
