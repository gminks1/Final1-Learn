/* Welcome to the arena game, where you are gpoing to make two people face off against each other
 * The thing is you get to create the characters that go into the game and 
 * you also get to create a series of unfortunate or maybe fortunate events
 */



import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        String answers = ("123");
        Boolean isValidInput = false;
        Boolean player2Input = false;
        Boolean gameOn = true;
        Scanner sc = new Scanner(System.in);
        Player p1 = new Player ("Default");
        int Lucky = 0;
        int Ok = 1;
        int Unlucky = 2;

        String[] luckyText = {" you are feeling extremely lucky today", " you found a 4 leaf clover on the ground... today must be your lucky day!"};
        String[] okText = {" today is a normal day", " you Not very lucky and not very unlucky"};
        String[] unluckyText = {" You are feeling super unlucky today", " you found a penny on the ground with the tails side up"};
        

        while (!isValidInput) {
            //dont forget to replace the names in the print statement below with the names of your new characters!
            System.out.println("Player 1: What character do you want to be?: (1) Robbie (2) [put in second character here], (3) [third here]");
            String characterSelect1 = sc.nextLine();

            if (answers.contains(characterSelect1)) {
                p1 = new Player(characterSelect1);
                System.out.println(p1);
                isValidInput = true;

            } else {
                System.out.println("\n\033[31;4mThat is not a valid character please give a valid character\033[0m\n");

            }
        }
        //dont forget to replace the names in the print statement below with the names of your new characters!
        Player p2 = new Player("Default");
        while (!player2Input) {
            System.out.println("Player 2: What character do you want to be?: (1) Robbie, (2) [2nd character], (3) [3rd character]");
            String characterSelect2 = sc.nextLine();

            if (answers.contains(characterSelect2)) {
                 p2 = new Player(characterSelect2);
                System.out.println(p2);
                player2Input = true;

            } else {
                System.out.println("\n\033[31;4mThat is not a valid character please give a valid character\033[0m\n");

            }
        }
        
        //this returns the luck messages at the beginning of each battle to see if you are lucky or not
        //Nothing needs to be changed in this code unless you change the name of the accessor below (getName)
        int index = (int)(Math.random()*2);
        System.out.println(p1.getLuck());
        if(Lucky == p1.getLuck()){
            System.out.println("--------------" + p1.getName() + luckyText[index] + "------------");
        }
        else if(Ok == p1.getLuck()){
            System.out.println("--------------" + p1.getName() + okText[index] + "------------");
        }
        else if(Unlucky == p1.getLuck()){
            System.out.println("--------------" + p1.getName() + unluckyText[index] + "------------");
        }
        
        
        if(Lucky == p2.getLuck()){
            System.out.println("--------------" + p2.getName() + luckyText[index] + "------------");
        }
        else if(Ok == p2.getLuck()){
            System.out.println("--------------" + p2.getName() + okText[index] + "------------");
        }
        else if(Unlucky == p2.getLuck()){
            System.out.println("--------------" + p2.getName() + unluckyText[index] + "------------");
        }
        
        Game battle = new Game();
        while(gameOn){
        battle.fight(p1, p2);
        /* create an accessor that will find the health of the player after each fight
         * if the health is less than or equal to zero, the if statement should return true
        */
        if(/* Implement code here */){
            System.out.println(p2.getName() + " Has won this battle!");
            gameOn = false;
        }
        if(/* implement code here */){
            System.out.println(p1.getName() + " Has won this battle!");
            gameOn = false;
        }
        }

    }
}