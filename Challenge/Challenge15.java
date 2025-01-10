package Challenge;

public class Challenge15 {
    private String name;
    private double creditLimit;
    private String email;

    public String getName(){
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
    public Challenge15(String name, double creditLimit, String email){
        this.name =name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public Challenge15(){
        this("Default name", 23456.99, "default@gmail.com");
    }
    public Challenge15(String name, String email){
        this( name,12313.88, email );
    }
}

