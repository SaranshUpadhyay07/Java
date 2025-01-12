public class Section_7_4_POJO {
    public static void main(String[] args) {
        for(int i =1; i<=5;i++){
            The_Record s = new The_Record("59200" +i,
                    switch(i){
                case 1-> "Mary";
                case 2-> "Carol";
                case 3-> "Jack";
                case 4-> "Tim";
                case 5-> "Lisa";
                default-> "Anonymous";
                },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }
        Section_7_4_POJO_2 s2 = new Section_7_4_POJO_2("54323456", "Ann", "05/11/2003", "CSE 24");
        The_Record s3 = new The_Record("54323456", "John", "01/12/2001", "CSE 21");
        System.out.println(s2);
        System.out.println(s3);
        // Java's implicit code doesn't include the prefix get and simply uses the same name as the component or field

        System.out.println(s2.getName()+" is in "+ s2.getClasslist());
        System.out.println(s3.name()+" is in "+ s3.classlist());
    }
}
