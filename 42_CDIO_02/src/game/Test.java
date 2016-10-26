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
		String Wizard0[] = {
				StringBank.getStrWizardTower0(),
				StringBank.getStrWizardCrater0(),
				StringBank.getStrWizardPalaceGates0(),
				StringBank.getStrWizardColdDesert0(),
				StringBank.getStrWizardWalledCity0(),
				StringBank.getStrWizardMonastary0(),
				StringBank.getStrWizardBlackCave0(),
				StringBank.getStrWizardHuts0(),
				StringBank.getStrWizardWerewall0(),
				StringBank.getStrWizardPit0(),
				StringBank.getStrWizardGoldmine0(),

		};
		String Wizard1[] = {
				StringBank.getStrWizardTower1(),
				StringBank.getStrWizardCrater1(),
				StringBank.getStrWizardPalaceGates1(),
				StringBank.getStrWizardColdDesert1(),
				StringBank.getStrWizardWalledCity1(),
				StringBank.getStrWizardMonastary1(),
				StringBank.getStrWizardBlackCave1(),
				StringBank.getStrWizardHuts1(),
				StringBank.getStrWizardWerewall1(),
				StringBank.getStrWizardPit1(),
				StringBank.getStrWizardGoldmine1(),				
		};

		String Warrior0[] = {
				StringBank.getStrWarriorTower0(),
				StringBank.getStrWarriorCrater0(),
				StringBank.getStrWarriorPalaceGates0(),
				StringBank.getStrWarriorColdDesert0(),
				StringBank.getStrWarriorWalledCity0(),
				StringBank.getStrWarriorMonastary0(),
				StringBank.getStrWarriorBlackCave0(),
				StringBank.getStrWarriorHuts0(),
				StringBank.getStrWarriorWerewall0(),
				StringBank.getStrWarriorPit0(),
				StringBank.getStrWarriorGoldmine0(),

		};	
		String Warrior1[] = {
				StringBank.getStrWarriorTower1(),
				StringBank.getStrWarriorCrater1(),
				StringBank.getStrWarriorPalaceGates1(),
				StringBank.getStrWarriorColdDesert1(),
				StringBank.getStrWarriorWalledCity1(),
				StringBank.getStrWarriorMonastary1(),
				StringBank.getStrWarriorBlackCave1(),
				StringBank.getStrWarriorHuts1(),
				StringBank.getStrWarriorWerewall1(),
				StringBank.getStrWarriorPit1(),
				StringBank.getStrWarriorGoldmine1(),
		};
		String Dwarf0[] = {
				StringBank.getStrDwarfTower0(),
				StringBank.getStrDwarfCrater0(),
				StringBank.getStrDwarfPalaceGates0(),
				StringBank.getStrDwarfColdDesert0(),
				StringBank.getStrDwarfWalledCity0(),
				StringBank.getStrDwarfMonastary0(),
				StringBank.getStrDwarfBlackCave0(),
				StringBank.getStrDwarfHuts0(),
				StringBank.getStrDwarfWerewall0(),
				StringBank.getStrDwarfPit0(),
				StringBank.getStrDwarfGoldmine0(),
		};

		String Dwarf1[] = {
				StringBank.getStrDwarfTower1(),
				StringBank.getStrDwarfCrater1(),
				StringBank.getStrDwarfPalaceGates1(),
				StringBank.getStrDwarfColdDesert1(),
				StringBank.getStrDwarfWalledCity1(),
				StringBank.getStrDwarfMonastary1(),
				StringBank.getStrDwarfBlackCave1(),
				StringBank.getStrDwarfHuts1(),
				StringBank.getStrDwarfWerewall1(),
				StringBank.getStrDwarfPit1(),
				StringBank.getStrDwarfGoldmine1(),	
		};
		String Elf0[] = {
				StringBank.getStrElfTower0(),
				StringBank.getStrElfCrater0(),
				StringBank.getStrElfPalaceGates0(),
				StringBank.getStrElfColdDesert0(),
				StringBank.getStrElfWalledCity0(),
				StringBank.getStrElfMonastary0(),
				StringBank.getStrElfBlackCave0(),
				StringBank.getStrElfHuts0(),
				StringBank.getStrElfWerewall0(),
				StringBank.getStrElfPit0(),
				StringBank.getStrElfGoldmine0(),

		};		
		String Elf1[] = {
				StringBank.getStrElfTower1(),
				StringBank.getStrElfCrater1(),
				StringBank.getStrElfPalaceGates1(),
				StringBank.getStrElfColdDesert1(),
				StringBank.getStrElfWalledCity1(),
				StringBank.getStrElfMonastary1(),
				StringBank.getStrElfBlackCave1(),
				StringBank.getStrElfHuts1(),
				StringBank.getStrElfWerewall1(),
				StringBank.getStrElfPit1(),
				StringBank.getStrElfGoldmine1(),
		};		



		String Thief0[] = {
				StringBank.getStrThiefTower0(),
				StringBank.getStrThiefCrater0(),
				StringBank.getStrThiefPalaceGates0(),
				StringBank.getStrThiefColdDesert0(),
				StringBank.getStrThiefWalledCity0(),
				StringBank.getStrThiefMonastary0(),
				StringBank.getStrThiefBlackCave0(),
				StringBank.getStrThiefHuts0(),
				StringBank.getStrThiefWerewall0(),
				StringBank.getStrThiefPit0(),
				StringBank.getStrThiefGoldmine0()	
		};

		String Thief1[] = {
				StringBank.getStrThiefTower1(),	
				StringBank.getStrThiefCrater1(),
				StringBank.getStrThiefPalaceGates1(),
				StringBank.getStrThiefColdDesert1(),
				StringBank.getStrThiefWalledCity1(),
				StringBank.getStrThiefMonastary1(),
				StringBank.getStrThiefBlackCave1(),
				StringBank.getStrThiefHuts1(),
				StringBank.getStrThiefWerewall1(),
				StringBank.getStrThiefPit1(),
				StringBank.getStrThiefGoldmine1(),
		};



		String Expected = "";
		String Actual = "";
		// i is equal to the character number
		for (int i = 0;i<5;i++) {
			// r is equal to the field number		
			for (int r = 0; r<11;r++) {
				for (int u = 0;u<2;u++) {				
					StringBank.setrandomvalue(u);
					if(u==0) {
						switch (i) {
						case 0 : {
							Expected = Wizard0[r];
							break;
						}
						case 1 : {
							Expected = Warrior0[r];
							break;
						}
						case 2 : {
							Expected = Dwarf0[r];
							break;
						}
						case 3 : {
							Expected = Elf0[r];
							break;
						}
						case 4 : {
							Expected = Thief0[r];
							break;
						}
						}
					}
					else if (u==1) {
						switch (i) {
						case 0 : {
							Expected = Wizard1[r];
							break;
						}
						case 1 : {
							Expected = Warrior1[r];
							break;
						}
						case 2 : {
							Expected = Dwarf1[r];
							break;
						}
						case 3 : {
							Expected = Elf1[r];
							break;
						}
						case 4 : {
							Expected = Thief1[r];
							break;
						}
						}
					}

					Actual = StringBank.getBoardMessage(r, i);
					if (Expected == Actual)  {
						equal++;
					}
				}
			}
			
		}
		assertEquals(110,equal);
	}
}



