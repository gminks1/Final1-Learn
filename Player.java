import java.text.DecimalFormat;

public class Player {
    private double health;
    private int speed;
    private int attack;
    private String name;
    private int luck;
//TODO:
    /* Create 2 more players besides Robbie, by giving a name, health, Attack, and Speed stats
     * Take into consideration the information below
     */
     //speed is on a scale of 1 to 10 with 10 being the highest
     //attack is on a scale of 1 to 10 with 10 being the highest\
     //Luck is on a random scale, you do not need to change the values for luck
    Player(String c){
        if(c.equals("1")){
            name = "Robbie";
            health = 120;
            attack = 5;
            speed = 5;
            luck = (int)(Math.random()*3);

        }
        else if(c.equals("2")){
            luck = (int)(Math.random()*3);
        }
        else if(c.equals("3")){
            luck = (int)(Math.random()*3);
        }
        
    }
    //this health method pulls the double of the health and then rounds it to look better when printing
    public String getHealth(){
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        return numberFormat.format(health);
    }
    //TODO:
    /*create a accessor method for Health(HP) here
     * --> Hint: its a double
    */
    
    //TODO:
    /* Create accessor methods called getSpeed(double), getAttack(double), and getName(String)
     * The Luck method is already made for you to use as an example
     */
    public int getLuck(){
        return luck;
    }
    //modifiers
    public void glueGun(double d){
        speed -= d;
    }
    //make the person learning make their own modifiers
    public void Crack(double r){
        speed += r;
    }
    public void weakness(double w){
        attack -= w;
    }
    public void tren(double t){
        attack += t;
    }
    public void battle(double b){
        health -= b;
    }
    //TODO:
    /* Create a ToString method that prints out the statistics of the player
     * Including Health, Speed, and Attack
     */
    public String toString(){
        String statement = "\n\t\033[36;1m " + name + "\033[0m\n\n";
        statement += "\t\033[37;4mCurrent Stats\033[0m\n";
        /* Implement the rest of the Statistics here */
        return statement;
    }

}

