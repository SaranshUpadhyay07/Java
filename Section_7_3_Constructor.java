public class Section_7_3_Constructor {
    // Java makes a default constructor if no constructor is specified and i am taking the code from challenge 14
    private int account_number = 121320004;
    private int account_balance = 0;
    private String name;
    private String email;
    private long phone;

    public Section_7_3_Constructor(){
        this(574563, 250, "Default Name", "Deault@gmail.com", 9876545677L); //Constructor Chaining and this should be the first line in the constructor
          System.out.println("Empty Constructor called");
    }
    public Section_7_3_Constructor(int account_number, int account_balance, String name, String email, long phone){
        System.out.println("Constructor called");
        this.account_number = account_number;
        this.account_balance = account_balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Section_7_3_Constructor(String name, String email, long phone) {
        this(989898, 12323, name, email, phone);
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}
