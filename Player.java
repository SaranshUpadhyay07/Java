public class Player {
    public String fullname;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        health -= damage;
        if(health >0) {
            System.out.println("The health is now " + health);
        }
        else{
            health = 0;
        System.out.println("You died! ");
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void gainHealth(int medkit){
        health += medkit;
        if(health >=100) {
            health= 100;
            System.out.println("You gained full health");
        }
        else{
            System.out.println("Your health is now " + health);
        }
    }
}
