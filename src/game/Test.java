package game;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.Before;

public class Test {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	@org.junit.Test
	public void Stringstest() {
		int equal = 0;
		//String
		String Wizard[] = {
				StringBank.getStrWizardTower0(),
				StringBank.getStrWizardTower1(),
				StringBank.getStrWizardPit0(),
				StringBank.getStrWizardPit1(),
				StringBank.getStrWizardPalaceGates0(),
				StringBank.getStrWizardPalaceGates1(),
				StringBank.getStrWizardColdDesert0(),
				StringBank.getStrWizardColdDesert1(),
				StringBank.getStrWizardWalledCity0(),
				StringBank.getStrWizardWalledCity1(),
				StringBank.getStrWizardMonastary0(),
				StringBank.getStrWizardMonastary1(),
				StringBank.getStrWizardBlackCave0(),
				StringBank.getStrWizardBlackCave1(),
				StringBank.getStrWizardHuts0(),
				StringBank.getStrWizardHuts1(),
				StringBank.getStrWizardWerewall0(),
				StringBank.getStrWizardWerewall1(),
				StringBank.getStrWizardPit0(),
				StringBank.getStrWizardPit1(),
				StringBank.getStrWizardGoldmine0(),
				StringBank.getStrWizardGoldmine1(),	
		};
		String Warrior[] = {
				StringBank.getStrWarriorTower0(),
				StringBank.getStrWarriorTower1(),
				StringBank.getStrWarriorPit0(),
				StringBank.getStrWarriorPit1(),
				StringBank.getStrWarriorPalaceGates0(),
				StringBank.getStrWarriorPalaceGates1(),
				StringBank.getStrWarriorColdDesert0(),
				StringBank.getStrWarriorColdDesert1(),
				StringBank.getStrWarriorWalledCity0(),
				StringBank.getStrWarriorWalledCity1(),
				StringBank.getStrWarriorMonastary0(),
				StringBank.getStrWarriorMonastary1(),
				StringBank.getStrWarriorBlackCave0(),
				StringBank.getStrWarriorBlackCave1(),
				StringBank.getStrWarriorHuts0(),
				StringBank.getStrWarriorHuts1(),
				StringBank.getStrWarriorWerewall0(),
				StringBank.getStrWarriorWerewall1(),
				StringBank.getStrWarriorPit0(),
				StringBank.getStrWarriorPit1(),
				StringBank.getStrWarriorGoldmine0(),
				StringBank.getStrWarriorGoldmine1(),	
		};	


		String Dwarf[] = {
				StringBank.getStrDwarfTower0(),
				StringBank.getStrDwarfTower1(),
				StringBank.getStrDwarfPit0(),
				StringBank.getStrDwarfPit1(),
				StringBank.getStrDwarfPalaceGates0(),
				StringBank.getStrDwarfPalaceGates1(),
				StringBank.getStrDwarfColdDesert0(),
				StringBank.getStrDwarfColdDesert1(),
				StringBank.getStrDwarfWalledCity0(),
				StringBank.getStrDwarfWalledCity1(),
				StringBank.getStrDwarfMonastary0(),
				StringBank.getStrDwarfMonastary1(),
				StringBank.getStrDwarfBlackCave0(),
				StringBank.getStrDwarfBlackCave1(),
				StringBank.getStrDwarfHuts0(),
				StringBank.getStrDwarfHuts1(),
				StringBank.getStrDwarfWerewall0(),
				StringBank.getStrDwarfWerewall1(),
				StringBank.getStrDwarfPit0(),
				StringBank.getStrDwarfPit1(),
				StringBank.getStrDwarfGoldmine0(),
				StringBank.getStrDwarfGoldmine1(),	
		};
		String Elf[] = {
				StringBank.getStrElfTower0(),
				StringBank.getStrElfTower1(),
				StringBank.getStrElfPit0(),
				StringBank.getStrElfPit1(),
				StringBank.getStrElfPalaceGates0(),
				StringBank.getStrElfPalaceGates1(),
				StringBank.getStrElfColdDesert0(),
				StringBank.getStrElfColdDesert1(),
				StringBank.getStrElfWalledCity0(),
				StringBank.getStrElfWalledCity1(),
				StringBank.getStrElfMonastary0(),
				StringBank.getStrElfMonastary1(),
				StringBank.getStrElfBlackCave0(),
				StringBank.getStrElfBlackCave1(),
				StringBank.getStrElfHuts0(),
				StringBank.getStrElfHuts1(),
				StringBank.getStrElfWerewall0(),
				StringBank.getStrElfWerewall1(),
				StringBank.getStrElfPit0(),
				StringBank.getStrElfPit1(),
				StringBank.getStrElfGoldmine0(),
				StringBank.getStrElfGoldmine1(),	
		};
		String Theif[] = {
				StringBank.getStrThiefTower0(),
				StringBank.getStrThiefTower1(),
				StringBank.getStrThiefPit0(),
				StringBank.getStrThiefPit1(),
				StringBank.getStrThiefPalaceGates0(),
				StringBank.getStrThiefPalaceGates1(),
				StringBank.getStrThiefColdDesert0(),
				StringBank.getStrThiefColdDesert1(),
				StringBank.getStrThiefWalledCity0(),
				StringBank.getStrThiefWalledCity1(),
				StringBank.getStrThiefMonastary0(),
				StringBank.getStrThiefMonastary1(),
				StringBank.getStrThiefBlackCave0(),
				StringBank.getStrThiefBlackCave1(),
				StringBank.getStrThiefHuts0(),
				StringBank.getStrThiefHuts1(),
				StringBank.getStrThiefWerewall0(),
				StringBank.getStrThiefWerewall1(),
				StringBank.getStrThiefPit0(),
				StringBank.getStrThiefPit1(),
				StringBank.getStrThiefGoldmine0(),
				StringBank.getStrThiefGoldmine1(),	
			
		};
		
		String Expected = "";
		String Actual = "";
		for (int u = 0;u<1;u++)
			StringBank.setrandomvalue(u);
		
		// i is equal to the character number
			for (int i = 0;i<5;i++) {
		// r is equal to the field number		
				for (int r = 0; r<11;r++) {
					switch (i) {
					case 0 : {
						Expected = Wizard[r];
						break;
					}
					case 1 : {
						Expected = Warrior[r];
						break;
					}
					case 2 : {
						Expected = Dwarf[r];
						break;
					}
					case 3 : {
						Expected = Elf[r];
					}
					case 4 : {
						Expected = Theif[r];
						break;
					}
					}
				Actual = StringBank.getBoardMessage(r, i);

					if (Expected == Actual)  {
						equal++;

					}

					}

			}
			assertEquals(110,equal);
	}


	//	public static String getBoardMessage(int fieldNumber, int characterNumber)
	//	{
	//		Random rand = new Random();
	//		return BoardMessages[fieldNumber][characterNumber][rand.nextInt(2)];
	//	}
}
