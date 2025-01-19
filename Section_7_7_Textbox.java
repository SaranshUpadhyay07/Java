public class Section_7_7_Textbox {
    public static void main(String[] args) {
        String bulleted = " This is a bulleted section\n"
                + "\t\u2022 First point\n"
                    + "\t\t\u2022 Second point";
        System.out.println(bulleted);

        String textbox = """
                This is a bulleted section
                    \u2022 First point
                        \u2022 Second point""";
        System.out.println(textbox);

        int age = 20;
        System.out.printf("Your Age is %d%n", age);

        for(int i =1; i<=100000;i *=10){
            System.out.printf("%6d %n", i);
        }

        String Format = String.format("Your age is %d", age);
        System.out.println(Format);
        String Saransh = "Your name is Saransh and age is "+age;
        System.out.println(Saransh);
    }
}
