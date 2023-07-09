import java.util.Scanner;

class ChocolateGame{
	void one() {

		
		   Scanner sc=new Scanner(System.in);
		 
		   int player=0;
		   int robot=0;
		   int Player1=0,Player2=0;
			System.out.println("enter how many choclate you want as multiple by 4 "
					+ "eg :if you enter 3 there are totally (4*3)+1= 13 choclate and one chilli"
					+"more than one");
			  
		  
		   int n=sc.nextInt();
		   int chilli=1;
		   int choclate=(4*n)+1;
		   System.out.println("there are totally "+choclate+" choclate and one chilli");
		   System.out.println();
		   choclate-=1;
		 System.out.println("your opponent starts the game and he took one choclate");
		   

		 while(choclate!=0) {
			   System.out.println("Player one turn");
			   player=sc.nextInt();
			   choclate-=player;
			   
			   
			   
			   if(player==1) {
				   choclate-=3;
				   robot=3;
				   
			   }else if(player==2) {
				   choclate-=2;
				   robot=2;
			   }
			   
			   
			   else if(player==3) {
				   choclate-=1;
				   robot=1;
			   }
			   System.out.println(" player one choose "+player+" choclate");
				  System.out.println("your opponent took "+robot+" choclate");
				  System.out.println("there are total "+choclate+" choclate");
				  System.out.println("total chilli = "+chilli);
			
			   
			   
			 
			  
		   }
		     System.out.println("you lose the game ");
		
	}
	void two() {

		boolean win=true;
		
		
		Scanner sc=new Scanner(System.in);
		int Player1=0,Player2=0;
		System.out.println("enter how many choclate you want as multiple by 4 "
				+ "eg :if you enter 3 there are totally (4*3)+1= 13 choclate and one chilli"
				+"more than one");
		int n=sc.nextInt();                                       //n multiple of 4 calculated to choclates
		
		int choclate=(4*n)+1;
		int chilli=1;
		System.out.println("there are totally "+choclate+" choclates and "+chilli+" chilli");
		//---------------------------------------------------------------------------------------------------------------------------------------
		System.out.println("Player one turn");                     //Player one turns
		Player1=sc.nextInt();
		choclate-=Player1;
		
		if(Player1==2) {                                      //if first choose 2
			
			
			Player2=3;
			choclate-=Player2;
		}else if(Player1==3) {                              //if first choose 3
           
			
			Player2=2;
			choclate-=Player2;
		//-----------------------------------------------------------------------------------------------------------------------------------------	
		}else if(Player1==1) {                                  //if first choose 1
			Player2=1;
			choclate-=Player2;
			
			 System.out.println(" player one choose "+Player1+" choclate");
			  System.out.println("your opponent took "+Player2+" choclate");
			  System.out.println("there are total "+choclate+" choclate");
			System.out.println("Player one turn");
			//===============================================================
			Player1=sc.nextInt();
			choclate-=Player1;                                               //if Player one choice is one, getting second output
			if(Player1==1) {                                                 //if second output is one
				Player2=2;
				choclate-=Player2;
			}
			else if(Player1==2) {                                             //if second output is two
				Player2=1;
				choclate-=Player2;
			}
			//============================================================
			else if(Player1==3) {                                             //if second output is three
				
				Player2=1;
				choclate-=Player2;
				
				 System.out.println(" player one choose "+Player1+" choclate");
				  System.out.println("your opponent took "+Player2+" choclate");
				  System.out.println("there are total "+choclate+" choclate");
				System.out.println("Player one turn");
				
				Player1=sc.nextInt();                                           //third output
				choclate-=Player1;                         
				
				if(Player1==2) {                                               //if third output is two
					Player2=1;
					choclate-=Player2;
				}
				else if(Player1==1) {                                         //if third output is one
					Player2=2;
					choclate-=Player2;
				}

				
				else if(Player1==3) {
					
					
					win=false;
				}
				
				
			}
		}
		
		 System.out.println(" player one choose "+Player1+" choclate");
		  System.out.println("your opponent took "+Player2+" choclate");
		  System.out.println("there are total "+choclate+" choclate");
		while(choclate!=0&&choclate>0) {
			
			System.out.println("Player one turn");
			Player1=sc.nextInt();
			choclate-=Player1;
			if(Player1==1) {
				  
				   Player2=3;
				   choclate-=Player2;
				   System.out.println(" player one choose "+Player1+" choclate");
					  System.out.println("your opponent took "+Player2+" choclate");
					  System.out.println("there are total "+choclate+" choclate");
			   }else if(Player1==2) {
				  
				   Player2=2;
				   choclate-=Player2;
				   System.out.println(" player one choose "+Player1+" choclate");      //888888888888888888888888888888888888
					  System.out.println("your opponent took "+Player2+" choclate");
					  System.out.println("there are total "+choclate+" choclate");
			   }
			   
			   
			   else if(Player1==3) {
				  
				   Player2=1;
				   choclate-=Player2;
				   System.out.println(" player one choose "+Player1+" choclate");      //888888888888888888888888888888888888
					  System.out.println("your opponent took "+Player2+" choclate");
					  System.out.println("there are total "+choclate+" choclate");
				   
			   }
		}
		
			   System.out.println("the chilli = "+chilli);
			  
			
			
			
		
		System.out.println();
		if(win) {
			System.out.println("you lose the game ");
		}
		else {
			System.out.println("Player one wins");
		}
		
	
	}
	
	public static void main(String[]ar) {
		System.out.println("Rules : each players will take above zero and below 4 choclates as their wish"
				+ "each player get one turn to take the choclate a last who has no choclate to take he want to eat chilli");  //rules
		
		ChocolateGame obj=new ChocolateGame();
		Scanner select=new Scanner(System.in);
		
		System.out.println("who wants to start the game first :you or robot");
		System.out.println("1=   robot");
		System.out.println("2=   you");
		int choose=select.nextInt();
		
		if(choose==1) {
			obj.one();
		}else if(choose==2) {
			obj.two();
		}
		
	}
	
}

















	  
		
