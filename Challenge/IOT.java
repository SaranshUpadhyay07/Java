//package Challenge;
//
//public class IOT {
//    private boolean hastodoWork;
//
//    public IOT(boolean hastodoWork) {
//        this.hastodoWork = hastodoWork;
//    }
//}
//
//class Refrigerator extends IOT{
//    public Refrigerator(boolean hastodoWork) {
//        super(hastodoWork);
//    }
//
//    public void work( boolean hastodoWork){
//       if(hastodoWork) {
//           System.out.println("Refrigerator is working.");
//           hastodoWork=false;
//       }
//    }
//}
//
//class DishWasher extends IOT{
//    public DishWasher(boolean hastodoWork) {
//        super(hastodoWork);
//    }
//
//    public void work(boolean hastodoWork){
//        if( hastodoWork) {
//            System.out.println("DishWasher is working.");
//        }
//    }
//}
//
//class CoffeeMaker  extends IOT{
//    public CoffeeMaker(boolean hastodoWork) {
//        super(hastodoWork);
//    }
//
//    public void work(boolean hastodoWork){
//        if(hastodoWork) {
//            System.out.println("CoffeeMaker is working.");
//        }
//    }
//}
package Challenge;

public class IOT {
    private boolean hastodoWork;

    public IOT(boolean hastodoWork) {
        this.hastodoWork = hastodoWork;
    }

    public boolean isHastodoWork() {
        return hastodoWork;
    }

    public void setHastodoWork(boolean hastodoWork) {
        this.hastodoWork = hastodoWork;
    }
}
class Refrigerator extends IOT {
    public Refrigerator(boolean hastodoWork) {
        super(hastodoWork);
    }

    public void work() {
        if (isHastodoWork()) {
            System.out.println("Refrigerator is working.");
            setHastodoWork(false);
        }
    }
}

class DishWasher extends IOT {
    public DishWasher(boolean hastodoWork) {
        super(hastodoWork);
    }

    public void work() {
        if (isHastodoWork()) {
            System.out.println("DishWasher is working.");
            setHastodoWork(false);
        }
    }
}

class CoffeeMaker extends IOT {
    public CoffeeMaker(boolean hastodoWork) {
        super(hastodoWork);
    }

    public void work() {
        if (isHastodoWork()) {
            System.out.println("CoffeeMaker is working.");
            setHastodoWork(false);
        }
    }
}
