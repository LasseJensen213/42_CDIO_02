package test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.Before;

import stringBanks.Fields_StringBank;

public class StringBankTest {

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
				Fields_StringBank.getStrWizardTower0(),
				Fields_StringBank.getStrWizardCrater0(),
				Fields_StringBank.getStrWizardPalaceGates0(),
				Fields_StringBank.getStrWizardColdDesert0(),
				Fields_StringBank.getStrWizardWalledCity0(),
				Fields_StringBank.getStrWizardMonastary0(),
				Fields_StringBank.getStrWizardBlackCave0(),
				Fields_StringBank.getStrWizardHuts0(),
				Fields_StringBank.getStrWizardWerewall0(),
				Fields_StringBank.getStrWizardPit0(),
				Fields_StringBank.getStrWizardGoldmine0(),

		};
		String Wizard1[] = {
				Fields_StringBank.getStrWizardTower1(),
				Fields_StringBank.getStrWizardCrater1(),
				Fields_StringBank.getStrWizardPalaceGates1(),
				Fields_StringBank.getStrWizardColdDesert1(),
				Fields_StringBank.getStrWizardWalledCity1(),
				Fields_StringBank.getStrWizardMonastary1(),
				Fields_StringBank.getStrWizardBlackCave1(),
				Fields_StringBank.getStrWizardHuts1(),
				Fields_StringBank.getStrWizardWerewall1(),
				Fields_StringBank.getStrWizardPit1(),
				Fields_StringBank.getStrWizardGoldmine1(),				
		};

		String Warrior0[] = {
				Fields_StringBank.getStrWarriorTower0(),
				Fields_StringBank.getStrWarriorCrater0(),
				Fields_StringBank.getStrWarriorPalaceGates0(),
				Fields_StringBank.getStrWarriorColdDesert0(),
				Fields_StringBank.getStrWarriorWalledCity0(),
				Fields_StringBank.getStrWarriorMonastary0(),
				Fields_StringBank.getStrWarriorBlackCave0(),
				Fields_StringBank.getStrWarriorHuts0(),
				Fields_StringBank.getStrWarriorWerewall0(),
				Fields_StringBank.getStrWarriorPit0(),
				Fields_StringBank.getStrWarriorGoldmine0(),

		};	
		String Warrior1[] = {
				Fields_StringBank.getStrWarriorTower1(),
				Fields_StringBank.getStrWarriorCrater1(),
				Fields_StringBank.getStrWarriorPalaceGates1(),
				Fields_StringBank.getStrWarriorColdDesert1(),
				Fields_StringBank.getStrWarriorWalledCity1(),
				Fields_StringBank.getStrWarriorMonastary1(),
				Fields_StringBank.getStrWarriorBlackCave1(),
				Fields_StringBank.getStrWarriorHuts1(),
				Fields_StringBank.getStrWarriorWerewall1(),
				Fields_StringBank.getStrWarriorPit1(),
				Fields_StringBank.getStrWarriorGoldmine1(),
		};
		String Dwarf0[] = {
				Fields_StringBank.getStrDwarfTower0(),
				Fields_StringBank.getStrDwarfCrater0(),
				Fields_StringBank.getStrDwarfPalaceGates0(),
				Fields_StringBank.getStrDwarfColdDesert0(),
				Fields_StringBank.getStrDwarfWalledCity0(),
				Fields_StringBank.getStrDwarfMonastary0(),
				Fields_StringBank.getStrDwarfBlackCave0(),
				Fields_StringBank.getStrDwarfHuts0(),
				Fields_StringBank.getStrDwarfWerewall0(),
				Fields_StringBank.getStrDwarfPit0(),
				Fields_StringBank.getStrDwarfGoldmine0(),
		};

		String Dwarf1[] = {
				Fields_StringBank.getStrDwarfTower1(),
				Fields_StringBank.getStrDwarfCrater1(),
				Fields_StringBank.getStrDwarfPalaceGates1(),
				Fields_StringBank.getStrDwarfColdDesert1(),
				Fields_StringBank.getStrDwarfWalledCity1(),
				Fields_StringBank.getStrDwarfMonastary1(),
				Fields_StringBank.getStrDwarfBlackCave1(),
				Fields_StringBank.getStrDwarfHuts1(),
				Fields_StringBank.getStrDwarfWerewall1(),
				Fields_StringBank.getStrDwarfPit1(),
				Fields_StringBank.getStrDwarfGoldmine1(),	
		};
		String Elf0[] = {
				Fields_StringBank.getStrElfTower0(),
				Fields_StringBank.getStrElfCrater0(),
				Fields_StringBank.getStrElfPalaceGates0(),
				Fields_StringBank.getStrElfColdDesert0(),
				Fields_StringBank.getStrElfWalledCity0(),
				Fields_StringBank.getStrElfMonastary0(),
				Fields_StringBank.getStrElfBlackCave0(),
				Fields_StringBank.getStrElfHuts0(),
				Fields_StringBank.getStrElfWerewall0(),
				Fields_StringBank.getStrElfPit0(),
				Fields_StringBank.getStrElfGoldmine0(),

		};		
		String Elf1[] = {
				Fields_StringBank.getStrElfTower1(),
				Fields_StringBank.getStrElfCrater1(),
				Fields_StringBank.getStrElfPalaceGates1(),
				Fields_StringBank.getStrElfColdDesert1(),
				Fields_StringBank.getStrElfWalledCity1(),
				Fields_StringBank.getStrElfMonastary1(),
				Fields_StringBank.getStrElfBlackCave1(),
				Fields_StringBank.getStrElfHuts1(),
				Fields_StringBank.getStrElfWerewall1(),
				Fields_StringBank.getStrElfPit1(),
				Fields_StringBank.getStrElfGoldmine1(),
		};		



		String Thief0[] = {
				Fields_StringBank.getStrThiefTower0(),
				Fields_StringBank.getStrThiefCrater0(),
				Fields_StringBank.getStrThiefPalaceGates0(),
				Fields_StringBank.getStrThiefColdDesert0(),
				Fields_StringBank.getStrThiefWalledCity0(),
				Fields_StringBank.getStrThiefMonastary0(),
				Fields_StringBank.getStrThiefBlackCave0(),
				Fields_StringBank.getStrThiefHuts0(),
				Fields_StringBank.getStrThiefWerewall0(),
				Fields_StringBank.getStrThiefPit0(),
				Fields_StringBank.getStrThiefGoldmine0()	
		};

		String Thief1[] = {
				Fields_StringBank.getStrThiefTower1(),	
				Fields_StringBank.getStrThiefCrater1(),
				Fields_StringBank.getStrThiefPalaceGates1(),
				Fields_StringBank.getStrThiefColdDesert1(),
				Fields_StringBank.getStrThiefWalledCity1(),
				Fields_StringBank.getStrThiefMonastary1(),
				Fields_StringBank.getStrThiefBlackCave1(),
				Fields_StringBank.getStrThiefHuts1(),
				Fields_StringBank.getStrThiefWerewall1(),
				Fields_StringBank.getStrThiefPit1(),
				Fields_StringBank.getStrThiefGoldmine1(),
		};



		String Expected = "";
		String Actual = "";
		// i is equal to the character number
		for (int i = 0;i<5;i++) {
			// r is equal to the field number		
			for (int r = 0; r<11;r++) {
				for (int u = 0;u<2;u++) {				
					Fields_StringBank.setrandomvalue(u);
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

					Actual = Fields_StringBank.getBoardMessage(r, i);
					if (Expected == Actual)  {
						equal++;
					}
				}
			}
			
		}
		assertEquals(110,equal);
	}
}



