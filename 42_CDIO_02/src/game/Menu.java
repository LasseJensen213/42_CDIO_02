package game;

import java.util.ArrayList;
import java.util.Scanner;

import desktop_resources.GUI;
import stringBanks.Fields_StringBank;

public class Menu {

	public static void main(String[] args) {


		
		Game game = new Game();
		game.makeFields();
		String[] menu = Fields_StringBank.menu();
		while(true)
		{
			String input = GUI.getUserSelection("Menu", menu);
			if (input.equals(menu[0]))
			{
				game.play();
			}
			else if(input.equals(menu[1]))
			{
				GUI.showMessage("INFO_STRING");
			}
			else
			{
				GUI.close();
				break;
			}
		}



	}

}
