package AdventureShop;

import java.io.*;
import java.util.*;

public class LoadingScreen extends PlayerInfo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start();

	}
	public static void start() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose a number:");
		System.out.println("\t0: New Game" + "\n\t1: Load Game");
		System.out.print("Choice: ");
		int choice = scan.nextInt();
		
		NewLoadGame(choice);
		
		scan.close();
	}
	
	public static void NewLoadGame(int num) {
		switch(num) {
		case 0:
			//
			System.out.println("New Game");
			break;
		case 1:
			//
			System.out.println("Loading Game");
			break;
		default:
			System.out.println("Not one of the choices.");
			start();
		}
	}
	
	//public static void newGame() {}
	//public static void loadGame() {}
	

}
