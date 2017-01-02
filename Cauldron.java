public class Cauldron{
  private int level;
  private boolean brewing;
  private Potion[] potions;
  
  
  public Cauldron(Potion[] potions){
    this.potions = potions;
  }
  
  
  public void brew(int ing1,int ing2){
    boolean test1 = false;
    boolean test2 = false;
    if(!brewing){
      for(int i = 0; i<potions.length;i++){
       if(potions[i].getReq().length ==2){
          if(potions[i].getReq()[0] ==ing1)
            test1 = true;
          if(potions[i].getReq()[1] ==ing2)
            test2 = true;
          
        }
        if(test1 && test2){
          System.out.println(potions[i].getName());
          break;
        }
        test1 = false;
        test2 = false;
      }
      
      
    }
    
  }
  public void brew(int ing1,int ing2,int ing3){
    
    boolean test1 = false;
    boolean test2 = false;
    boolean test3 = false;
    if(!brewing){
      for(int i = 0; i<potions.length;i++){
        
        if(potions[i].getReq().length ==3){
           System.out.println(potions[i].getReq()[0] +"==" +ing1);
          if(potions[i].getReq()[0] ==ing1)
            test1 = true;
          System.out.println(potions[i].getReq()[1] +"==" +ing2);
          if(potions[i].getReq()[1] ==ing2)
            test2 = true;
          System.out.println(potions[i].getReq()[2] +"==" +ing3);
          if(potions[i].getReq()[2] ==ing3)
            test3 = true;
        }
        if(test1 && test2 && test3){
          System.out.println(potions[i].getName());
          break;
        }
            System.out.println("dfaskojfksejdfskl");
        test1 = false;
        test2 = false;
        test3 = false;
      }
      
      
    }
    
  }
}