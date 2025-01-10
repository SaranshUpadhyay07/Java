public class Section_7_4_POJO {
    public static void main(String[] args) {
        for(int i =1; i<=5;i++){
            Section_7_4_POJO_2 s = new Section_7_4_POJO_2("59200" +i,
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
    }
}
