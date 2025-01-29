public class Player {
    private String name;
    private int health;
    private String weapon;

    public Player(String name) {
        this(name, 100, "Sword");

    }

    public Player(String name, int health, String weapon) {
        this.name = name;
        if(health<=0){
            this.health = 1;
        }
        else if(health>100){
            this.health = 100;
        }
        else{
        this.health = health;
        }
        this.weapon = weapon;
    }

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
