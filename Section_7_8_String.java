public class Section_7_8_String {
    public static void main(String[] args) {
        printInformation("Hello World");

        String str = "Hello World";
        System.out.println("index of r is "+ str.indexOf('r'));
        System.out.println("index of l is "+ str.lastIndexOf('l'));

    }
    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d %n",length);

        if(string.isEmpty()){
            System.out.println("Empty String");
        }
        if(string.isBlank()){
            System.out.println("Blank String");
        }
        System.out.println("First letter is "+string.charAt(0));
        System.out.println("last letter is "+string.charAt(length-1));
    }
}


