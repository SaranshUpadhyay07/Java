public class Section_7_10_String_Builder {
    public static void main(String[] args) {
        String helloworld = "Hello" +" World";
        helloworld.concat(" and Goodbye");
        print(helloworld);
        StringBuilder builder = new StringBuilder("Hello" +" World");
        builder.append(" and Goodbye");
        print(builder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(57));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        StringBuilder builder1 = new StringBuilder("Hello" +" World");
        builder1.append(" and Goodbye");
        builder1.deleteCharAt(16).insert(16, 'g');
        print(builder1);

        builder.reverse().setLength(7);
        print(builder);

        print(emptyStart);
        print(emptyStart32);
    }
    public static void print(String string) {
        System.out.println("String is: "+string);
        System.out.println("length = "+string.length());
    }
    public static void print(StringBuilder builder) {
        System.out.println("StringBuilder is: "+builder);
        System.out.println("length = "+builder.length());
        System.out.println("Capacity = "+builder.capacity());
    }
}
