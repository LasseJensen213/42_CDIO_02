package game;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		
		Scanner keyb = new Scanner(System.in);
		boolean endGame = false;
		String input;

		
		while(!endGame)
		{
			System.out.println(StringBank.menuString(0));
			input = keyb.nextLine();
			input = input.toLowerCase();
			switch(input)
			{
			case "start":
				Game game = new Game();
				game.play();
				break;
			case "end":
				endGame = true;
				break;
			case "help":
				break;
			default: System.out.println(StringBank.menuString(1));
			}
		}
		

	}

}
