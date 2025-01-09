package Challenge;

public class Challenge14 {
    private int account_number = 121320004;
    private int account_balance = 0;
    private String name;
    private String email;
    private long phone;

    public int getAccount_number() {
        return account_number;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public int getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(int account_balance) {
        this.account_balance = account_balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }
    public void deposit(int amount){
        account_balance += amount;
        System.out.println("The amount "+ amount +" has been deposited and the total balance is: $"+account_balance);
    }
    public void withdrawal(int amount){
        if(amount > account_balance)
        {
            System.out.println("Could not carry this transaction as insufficient balance are available");
        }
        else
        {
            account_balance -= amount;
            System.out.println("Transaction successful and the balance is: $"+account_balance);

        }
    }
    public void describeInfo(){
        System.out.println("Account number: "+account_number);
        System.out.println("Name: "+name);
        System.out.println("Account balance: "+account_balance);
        System.out.println("Email: "+email);
        System.out.println("Phone: "+phone);
    }
}
