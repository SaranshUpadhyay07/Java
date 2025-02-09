public class Section_9_Reference_and_Value_Types {
    public static void main(String... args) {
        System.out.println("Hello World!");

        String[] splitString = "Hello World!".split(" ");
        printText(splitString);

        System.out.println("-".repeat(20));
        printText("Hello");

        System.out.println("-".repeat(20));
        printText("Hello", "World", "Again");

        System.out.println("-".repeat(20));
        printText();

        System.out.println("-".repeat(20));
        String [] sArray = {"Hello", "World", "Again"};
        System.out.println(String.join(",",sArray));
    }
    private static void printText(String... textList){
        for(String text : textList){
            System.out.println(text);
        }
    }
}
