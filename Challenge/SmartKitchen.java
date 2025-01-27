//package Challenge;
//
//public class SmartKitchen {
////    public SmartKitchen(boolean work) {
////        super(work);
////    }
//     Refrigerator refrigerator;
//     DishWasher dishWasher;
//     CoffeeMaker coffeeMaker;
//
//    public SmartKitchen( Refrigerator refrigerator, DishWasher dishWasher, CoffeeMaker coffeeMaker) {
//
//        this.refrigerator = refrigerator;
//        this.dishWasher = dishWasher;
//        this.coffeeMaker = coffeeMaker;
//    }
//
//    public CoffeeMaker getCoffeeMaker() {
//        return coffeeMaker;
//    }
//
//    public DishWasher getDishWasher() {
//        return dishWasher;
//    }
//
//    public Refrigerator getRefrigerator() {
//        return refrigerator;
//    }
//
//    public void addWater(){
//        coffeeMaker.work(true);
//    }
//    public void refrigerate(){
//        refrigerator.work(true);
//    }
//    public void dishWash(){
//        dishWasher.work(true);
//    }
//}
package Challenge;

public class SmartKitchen {
    Refrigerator refrigerator;
    DishWasher dishWasher;
    CoffeeMaker coffeeMaker;

    public SmartKitchen(Refrigerator refrigerator, DishWasher dishWasher, CoffeeMaker coffeeMaker) {
        this.refrigerator = refrigerator;
        this.dishWasher = dishWasher;
        this.coffeeMaker = coffeeMaker;
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public void addWater() {
        coffeeMaker.work();
    }

    public void refrigerate() {
        refrigerator.work();
    }

    public void dishWash() {
        dishWasher.work();
    }
}
