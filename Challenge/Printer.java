package Challenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        tonerLevel += tonerAmount;
        if(tonerLevel > 100 || tonerLevel < 0){
            return -1;
        }
        return tonerLevel;
    }

    public int PagesPrinted(int pages){
        if(duplex){
            pages = pages/2 +(pages%2);
            System.out.println("The printer is a duplex one");
        }
        pagesPrinted += pages;
        return pagesPrinted;
    }
}
