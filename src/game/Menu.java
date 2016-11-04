package game;



import desktop_resources.GUI;
import stringBanks.Fields_StringBank;
import stringBanks.Menu_StringBank;

public class Menu {

	public static void main(String[] args) throws InterruptedException {


		
		Game game = new Game();
		FieldGenerator fieldgenerator = new FieldGenerator();
		fieldgenerator.makeFields();
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
				GUI.showMessage(Menu_StringBank.getHelp());
			}
			else
			{
				if(game.confirmInput())
				{	
					GUI.close();
					break;
				}
				
			}
		}



	}

}