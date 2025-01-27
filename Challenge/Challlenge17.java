//package Challenge;
//
//public class Challlenge17 {
//    Refrigerator refrigerator = new Refrigerator(true) ;
//    DishWasher dishWasher = new DishWasher(true);
//    CoffeeMaker coffeeMaker = new CoffeeMaker(true);
//    SmartKitchen smartKitchen = new SmartKitchen( refrigerator,dishWasher,coffeeMaker);
//
//   smartKitchen.getRefrigerator().work(true);
//
//}
package Challenge;

public class Challlenge17 {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator(true);
        DishWasher dishWasher = new DishWasher(true);
        CoffeeMaker coffeeMaker = new CoffeeMaker(true);
        SmartKitchen smartKitchen = new SmartKitchen(refrigerator, dishWasher, coffeeMaker);

//        smartKitchen.getRefrigerator().work();
//        smartKitchen.getDishWasher().work();
//        smartKitchen.getCoffeeMaker().work();

        smartKitchen.addWater();
        smartKitchen.refrigerate();
        smartKitchen.dishWash();
    }
}
