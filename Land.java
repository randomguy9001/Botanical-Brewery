public class Land{
 private boolean planted;
 private Seed seed;
 private static int level;
 private static int numOfLands;
 private int time = 0;
 private boolean grown = false;
 private StartBrewery main;
 public Land(StartBrewery main){
 this.main = main;
 
 }
 
 
 public void plant(Seed seed){
   
   if(!planted){
     grown = false;
     this.seed = seed;
   time = this.seed.getTime();
   }
 }
 
 
 public void grow(){
 if(time > 0)
   time--;
  
 if(planted && time == 0)
   grown = true;

 
 }
 
 public void harvest(){
 main.getPlayer().addSeed(5);
 
 
 
 }
}