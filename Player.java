import java.util.*;

public class Player{
   
   // Variables 
   private int lifePoint;
   private int strength;
   
   // generator for a random number
   public static Random r = new Random();
   
   // Constructor 
   public Player(){
      lifePoint = 100;
      strength = r.nextInt(20) + 1;
   }
   
   // getter for strength 
   public int getStrength(){
      return strength;
   }
   
   // setter for strength 
   public void setStrength(int lp){
      strength = r.nextInt(lp + 1);
   }
   
   // getter for life points
   public int getlifePoint(){
      return lifePoint;
   }
   
   // receive damage
   public void receiveDamage(int damage){
      lifePoint -= damage;
   }
   
   // increase life point 
   public void increaseLifePoint(){
      if (lifePoint < 100){
         lifePoint = lifePoint + 1;
      }
   }   
   
   
   // Battle operation
   public void battle(Player p){
     // storing lifepoints in variable lp1 and lp2
      int lp1 = this.getlifePoint();
      int lp2 = p.getlifePoint();
      
      // loop
      while(this.getStrength() == p.getStrength()){
         p.setStrength(lp1);
         this.setStrength(lp2);
      }
      
      // if player has less strength
      if (this.getStrength() < p.getStrength()){
         System.out.println("You attack for " + this.getStrength() + ", they defend for "+ p.getStrength() + ". You have " + (p.getStrength() - this.getStrength()) + " damage.");
         
         // calling receive damage method 
         this.receiveDamage(p.getStrength() - this.getStrength());
         
         // calling increase lifepoint method
         p.increaseLifePoint();   
      }
      else{
         System.out.println("Your strength: " + this.getStrength() + ", their strength: " + p.getStrength() + ". They have " + (this.getStrength() - p.getStrength()) + " damage.");
         
         // calling receive damage method
         p.receiveDamage(this.getStrength() - p.getStrength());
         
         // calling increase lifepoint method to increase for other player
         this.increaseLifePoint();
      }
      
      if (this.getlifePoint() == 0){
         System.out.println("Sorry, You lose!\n\n");
      }
      else if (p.getlifePoint() == 0){
         System.out.println("Congratulations. You Win!\n\n");
      }
      else {
         lp1 = this.getlifePoint();
         lp2 = p.getlifePoint();
         p.setStrength(lp1);
         this.setStrength(lp2);
      }
      
   }
   
}