package gambler;

public class GamblerUc2 {
	
	//Constant
    public final int STAKE=100;
    public final int BET_FOREACHGAME=1;
    
    //variables
    static int bet=1;
    
    static void WinOrLoose() {
     	 double check=(int)(Math.random() *10)%2; 
     	if(check == 1 )
        {
       	 bet++;
           System.out.println("Gamler is winning "+bet); 	
        }
        else
        {
          bet--;
        	System.out.println("Gambler is loosing  "+bet);
         }
      }
   
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WinOrLoose();
	}

}
