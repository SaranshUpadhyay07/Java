package Challenge;

public class Challenge14_2 {
    public static void main(String[] args){
        Challenge14 account = new Challenge14();
        account.setAccount_balance(34000);
        account.setEmail("abcd@gmail.com");
        account.setName("Abcd");
        account.setPhone(9876543211L);
        account.deposit(45000);
        account.withdrawal(6500);
        account.describeInfo();
    }
}
