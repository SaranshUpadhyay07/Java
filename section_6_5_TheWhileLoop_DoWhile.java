public class section_6_5_TheWhileLoop_DoWhile {
    public static void main(String[] args){
        int j =1;
        boolean isready = false;
        while(true)
        {
            if(j>5)
            {
                break;
            }
            System.out.println(j);
            j++;
        }

        do
        {
            System.out.println(j);
            j++;
        }while(isready);
    }
}
