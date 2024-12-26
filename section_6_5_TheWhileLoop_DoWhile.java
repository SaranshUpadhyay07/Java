public class section_6_5_TheWhileLoop_DoWhile {
    public static void main(String[] args){
//        int j =1;
//        boolean isready = false;
//        while(true)
//        {
//            if(j>5)
//            {
//                break;
//            }
//            System.out.println(j);
//            j++;
//        }
//
//        do
//        {
//            System.out.println(j);
//            j++;
//        }while(isready);
        int number = 0;
        while(number < 50){
            number+=5;
            if(number% 25 == 0)
            {
                continue;
            }
            System.out.print(number+"_");
        }
    }
}
