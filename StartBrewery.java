

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartBrewery extends JPanel{
  
  private Seed[] seeds = new Seed[6];
  private Ingredient[] ingredients = new Ingredient[6];
  private Potion[] potions = new Potion[10];
  private  Cauldron cauldron = new Cauldron(potions);
  private Player player = new Player();
  private Land[] lands = new Land[16];
  public StartBrewery(){
    // 0 stabilis, 1 curare, 2 malum, 3 veloces, 4 pellucidum, 5 supra
      seeds[0] = new Seed(8, 30, 0, 0);
    seeds[1] = new Seed(22, 90, 16, 0);
    seeds[2] = new Seed(22, 90, 32, 0);
    seeds[3] = new Seed(30, 120, 48, 0);
    seeds[4] = new Seed(42, 150, 64, 0);
    seeds[5] = new Seed(1000, 240, 80, 0);
    
    ingredients[0] = new Ingredient(0, 16);
    ingredients[1] = new Ingredient(16, 16);
    ingredients[2] = new Ingredient(32, 16);
    ingredients[3] = new Ingredient(48, 16);
    ingredients[4] = new Ingredient(64, 16);
    ingredients[5] = new Ingredient(80, 16);
    
//paint in the ass way to set required ingredients
       int[] tempIng0 = {0,1};      int[] tempIng1 = {0,2};         int[] tempIng2 = {0,3}; 
    int[] tempIng3 = {0,4};       int[] tempIng4 = {0,1,2};         int[] tempIng5 =  {0,2,4};  
    int[] tempIng6 =   {0,1,4};   int[] tempIng7 = {2,3,4};         int[] tempIng8 =  {1,2,4};
     int[] tempIng9 =  {1,3,5};
    
    potions[0] = new Potion("Healing", 30,tempIng0);
        potions[1] = new Potion("Harm", 30,tempIng1);
    potions[2] = new Potion("Swiftness", 38,tempIng2);
    potions[3] = new Potion("Illusion", 50,tempIng3);   
    potions[4] = new Potion("Strength", 52,tempIng4);
    potions[5] = new Potion("Confusion", 72,tempIng5);
    potions[6] = new Potion("Awareness", 72,tempIng6);
    potions[7] = new Potion("Chaos", 94,tempIng7);
    potions[8] = new Potion("Luck", 86,tempIng8);   
    potions[9] = new Potion("Transcedence", 1044,tempIng9);
    cauldron.brew(1,3,5);

  }
  public Player getPlayer(){
  return player;
  }
  
  public static void main(String[]args) throws InterruptedException{
    JFrame f = new JFrame("Botanical Brewery"); 
    StartBrewery bb = new StartBrewery(); 
    f.add(bb); 
    f.setSize(1200, 900); 
    f.setLocationRelativeTo(null);
    f.setResizable(false);
    f.setVisible(true); 
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  public void paint(Graphics g){
    
  }
  
  public void move(){
    
  }
}
