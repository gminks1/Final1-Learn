import java.text.DecimalFormat;

public class Game {
    Game(){
        System.out.println("A valiant battle has started");
    }

    public void fight(Player x, Player y){
        int roundCounter = 0;
        int rand = (int) (Math.random()*6) + 0;
        double speedMulti1 = x.getSpeed()/200;
        double speedMulti2 = y.getSpeed()/200;
        

        //speed multiplyer for dodging
        if(Math.random() < (0.05 + speedMulti1)){
            rand = 6;
        }

        if(Math.random() < (0.05 + speedMulti2)){
            rand = 7;
        }
        double attackMulti1 = (x.getAttack()/15);
        double attackMulti2 = (y.getAttack()/15);

        //random attack chances //between 100 and 120 (21 non inclusive)
        int randAttackH = ((int) Math.random() * 21) + 100;
        int randAttack = ((int) Math.random()*21) + 75;
        int randAttackL = ((int) Math.random()* 21) + 50;


        System.out.println("------------------------------");
        if (rand == 0){
            //light attack player x takes damage
            x.battle(randAttackL*attackMulti2);
            System.out.println(y.getName() + " lightly attacked " + x.getName());
            System.out.println( x.getName() + " Health: " + x.getHealth() );
            System.out.println( y.getName() + " Health: " + y.getHealth() );
        }
        if (rand == 1){
            //light attack player y takes damage
            y.battle(randAttackL*attackMulti1);
            System.out.println(x.getName() + " lightly attacked " + y.getName());
            System.out.println( x.getName() + " Health: " + x.getHealth() );
            System.out.println( y.getName() + " Health: " + y.getHealth() );
        }
        if (rand == 2){
            //normal attack player x takes damage 
            x.battle(randAttack*attackMulti2);
            System.out.println(y.getName() + " attacked " + x.getName());
            System.out.println( x.getName() + " Health: " + x.getHealth() );
            System.out.println( y.getName() + " Health: " + y.getHealth() );
        }
        if (rand == 3){
            //normal attack player y takes damage 
            y.battle(randAttack*attackMulti1);
            System.out.println(x.getName() + " attacked " + y.getName());
            System.out.println( x.getName() + " Health: " + x.getHealth() );
            System.out.println( y.getName() + " Health: " + y.getHealth() );
        }
        if (rand == 4){
            //heavy attack player x takes damage 
            x.battle(randAttackH* attackMulti2);
            System.out.println(y.getName() + " heavily attacked " + x.getName());
            System.out.println( x.getName() + " Health: " + x.getHealth() );
            System.out.println( y.getName() + " Health: " + y.getHealth() );
        }
        if (rand == 5){
            //heavy attack player y takes damage 
            y.battle(randAttackH* attackMulti1);
            System.out.println(x.getName() + " heavily attacked " + y.getName());
            System.out.println( x.getName() + " Health: " + x.getHealth() );
            System.out.println( y.getName() + " Health: " + y.getHealth() );
        }
        if (rand == 6){
            System.out.println(y.getName() + " missed!");
        }
        if (rand == 7){
            System.out.println(x.getName() + " missed!");
        }

    }
    public void chance(player x, player y){
        /* Create a method that will use the luck parameter
         * and if you are lucky then you will get a good mutator
         * and if you are unlucky then you have a higher chance of getting a bad mutator
         * 
         */
    }
    
}