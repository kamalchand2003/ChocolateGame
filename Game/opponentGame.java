package Atm;

import java.util.Scanner;

public class opponentGame {
	
	public static void main(String[]ar) {
		void one(){
			Scanner sc=new Scanner(System.in);
		System.out.println("enter how many choclate you want");
		int n=sc.nextInt();
		int chocolate=(4*n)+1;
		int robot=1;
		int player=0;
		System.out.println("THERE ARE TOTTALY "+chocolate+" AND ONE CHILLI");
		
		chocolate-=robot;
		System.out.println("your opponent took "+robot+" chocolate");
		while(chocolate!=0) {
		System.out.println("enter the user choice");
		
		player=sc.nextInt();
		chocolate-=player;
		
		switch(player) {
		case 1:
			robot=3; 
			chocolate-=robot;
			break;
		case 2:
			robot=2; 
			chocolate-=robot;
			break;
		case 3:
			robot=1; 
			chocolate-=robot;
			break;
		
		}
		System.out.println("your opponent took "+robot+" choclate");
		System.out.println("there are totally "+chocolate+" chocolate");
		}
		System.out.println("you lose the game");
	
	}
	
	}
