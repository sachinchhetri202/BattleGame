/** 
    * Class Assignment Computer Science 1400 
    * @author Sachin Chhetri <sachinchhetri202@gmail.com>
    * Object Oriented Programming, Constructers, Getters, Setters, Loops, Handling Exceptions, Conditions. 
    */

import java.util.*;

public class Main{
   public static void main(String[] args){
      
      try{
         Scanner in = new Scanner(System.in);
         char choice;
         
         Player user = new Player();
         Player cpu = new Player();
         
         while (true){
            System.out.println("Your HP: " + user.getlifePoint());
            System.out.println("Other HP: " + cpu.getlifePoint());
            System.out.print("Press h to hit, q to quit: ");
            
            choice = in.next().charAt(0);
            if (choice == 'h' || choice == 'H'){
               user.battle(cpu);
            }
            else if (choice == 'q' || choice == 'Q'){
               break;
            }
            else{
               System.out.println("\nInvalid Input. Please Try Again.\n");
            }
         
         }
      
      }
      catch(IllegalArgumentException e){
         System.out.println("Game has already ended. Thank you for playing.");
      }
   }
}
