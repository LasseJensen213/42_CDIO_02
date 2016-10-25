package game;

import java.util.Random;

public class StringBank {

	///Menu info
	private static String menuInfo = "\"start\": starts the game, \"end\": ends game";
	private static String invalidInput = "Invalid input";
	private static String startCommand = "start";

	///Character ( "role" ) Names
	private static String wizard = "wizard";
	private static String warrior = "warrior";
	private static String dwarf = "dwarf";
	private static String elf = "elf";
	private static String thief = "thief";

	//Randomizer value
	private static int randomvalue = 0;
	
	///Board Messages
	///for Wizard
	private static String strWizardTower0 ="You have arrived at a colleague’s home, "
			+ "as a present he gave you 250 coins.";
	
	private static String strWizardTower1 ="You arrived at an abandoned tower of "
			+ "a former friend. You found 250 coins in the treasure room.";
	
	private static String strWizardCrater0 ="Due to your clumsiness you fell into a crater. On your "
			+ "way down you ripped a hole in your money pouch. You lost 100 coins.";
	
	private static String strWizardCrater1 ="On your conquest for coins, you entered a cursed "
			+ "crater, in where a thief guild was. They robbed you of 100 coins.";
	
	private static String strWizardPalaceGates0 ="You arrived at the palace gates to a great city. As a tribute to "
			+ "your magnificent status as a magician, they gave you 100 coins.";
	
	private static String strWizardPalaceGates1 ="You reinforced the palace gates with your magic. For your "
			+ "troubles, the city major paid you 100 coins.";
	
	private static String strWizardColdDesert0 ="While traveling through a cold desert, a sneaky fox ate "
			+ "all of your food. Luckily you met a caravan, from which, "
			+ "you could by new supplies. The supplies were overpriced sadly. You paid 20 coins.";
	
	private static String strWizardColdDesert1 ="You performed a ritual in the middle of a cold desert. "
			+ "Sadly, it went wrong and ruined your remaining ingredients. New ones "
			+ "cost you 20 coins.";
	
	private static String strWizardWalledCity0 ="At a walled city you spotted a dwarf repairing the wall. "
			+ "You decided to help him by using your magic to gather supplies faster. "
			+ "As a reward the city constructer gave you both 180 coins.";
	
	private static String strWizardWalledCity1 ="At a walled city, you discovered that the inhabitants where "
			+ "conducting sacrifices using young virgins. You decided to annihilate "
			+ "the evildoers. As a token of their everlasting gratitude, "
			+ "the young virgins gave you 180 coins.";
	
	private static String strWizardMonastary0 ="You arrived at a monastery and decided to rest up "
			+ "and feel the ambient atmosphere.";
	
	private static String strWizardMonastary1 ="You arrived at a monastery inhabited by worshippers of "
			+ "the dwarf hero “Thorin Ravenbeard”. They let you rest up.";
	
	private static String strWizardBlackCave0 ="In a black cave, you used all of your materials "
			+ "to light up the cave. New ones cost you 70 coins.";
	
	private static String strWizardBlackCave1 ="You arrived at the entrance of a black cave and were "
			+ "ambushed by some monsters. You dropped 70 coins while fleeing.";
	
	private static String strWizardHuts0 ="You found some huts in the mountains. Since the inhabitants "
			+ "never interact with strangers, you were seen as a god. They gave you 60 coins.";
	
	private static String strWizardHuts1 ="You found some huts in the mountains. "
			+ "In a corner of one of them you found 60 coins.";
	
	private static String strWizardWerewall0 = "";
	private static String strWizardWerewall1 = "";
	
	private static String strWizardPit0 ="You fell into THE PIT and couldn’t get out. A random stranger "
			+ "charged you 50 coins, for helping you out.";
	
	private static String strWizardPit1 ="You were killing undead entities at the pit. Sadly, you didn’t "
			+ "discover, that some ghost had stolen some of your coins. You lost 50 coins.";
	
	private static String strWizardGoldmine0 ="You discovered a lead lode and used your alchemy skills to turn "
			+ "it into gold. You earned 650 coins.";
	
	private static String strWizardGoldmine1 ="You finally have enough materials to generate gold from thin air. "
			+ "You sold your gold for 650 coins";

	///For Warrior

	private static String strWarriorTower0 ="You arrived at the evil wizards tower and "
			+ "defeated the wizard who was wreaking havoc. You looted his treasure room for 250 coins.";
	
	private static String strWarriorTower1 ="You arrived at the ruins of a tower. "
			+ "Out of good luck, you found a treasure chest which contained 250 coins.";
	
	private static String strWarriorCrater0 ="On your mission to kill undead entities, you "
			+ "arrived at a crater inhabited by the undead. You managed "
			+ "to kill 50 undead entities. But sadly the repair of the your "
			+ "armor was much more expensive that you thought. You lost 100 coins.";
	
	private static String strWarriorCrater1 ="On your way through a crater your loyal pet inhaled "
			+ "poisonous gas. The elves healed your pet for 100 coins.";
	
	private static String strWarriorPalaceGates0 ="You defended the palace gates from an invasion "
			+ "of undead entities. As a reward from the gate master you earned 100 coins.";
	
	private static String strWarriorPalaceGates1 ="You arrived at the palace gates to a great city. "
			+ "When the crowd entering the palace gates saw your exotic pet, "
			+ "they paid you coins to be able to touch it. You earned 100 coins.";
	
	private static String strWarriorColdDesert0 ="While walking through a desert, your equipment was ruined by "
			+ "the sand. Luckily you met a dwarf. which repaired it for you. You paid 20 coins.";
	
	private static String strWarriorColdDesert1 ="While walking through a cold desert, your pet Smaug "
			+ "got sand in his scales and you destroyed 117 brushes trying to clean him. "
			+ "Buying new ones cost you 20 coins";
	
	private static String strWarriorWalledCity0 ="You arrived at a walled city, while on your country’s conquest "
			+ "for power. After seizing the walled city, the army paid you 180 coins.";
	
	private static String strWarriorWalledCity1 ="At a walled city, you helped guarding the walls. You gained 180 coins.";
	
	private static String strWarriorMonastary0 ="You arrived at a monastery and decided to beg the bishop for his blessings.";
	
	private static String strWarriorMonastary1 ="You arrived at a monastery and decided to do some "
			+ "free work for the monks and nuns.";
	
	private static String strWarriorBlackCave0 ="At the entrance to a black cave, you met some old colleges. "
			+ "You lose a bet to them and have to pay 70 coins.";
	
	private static String strWarriorBlackCave1 ="While slaying monsters in a black cave, you destroy your sword. "
			+ "A new one cost you 70 coins.";
	
	private static String strWarriorHuts0 ="While traveling the mountains, you came across some huts. "
			+ "While searching these huts for inhabitants, you found 60 coins.";
	
	private static String strWarriorHuts1 ="While traveling the mountains you came across a some huts. "
			+ "You discovered that they once belonged to an elven clan. "
			+ "You sold some of their old equipment for 60 coins.";
	
	private static String strWarriorWerewall0;
	private static String strWarriorWerewall1;
	
	private static String strWarriorPit0 ="You ware fighting undead entities at THE PIT. The undead entities "
			+ "destroyed some of your armor. It costed you 50 coins to repair it.";
	
	private static String strWarriorPit1 ="You fell into a cursed pit and was cursed with eternal pain in your "
			+ "toe. It costed you 50 coins to remove the curse.";
	
	private static String strWarriorGoldmine0 ="You discovered an abandoned mine. You found a lot of raw ores in "
			+ "there and sold it for 650 coins.";
	
	private static String strWarriorGoldmine1 ="You discovered that protecting a young woman, was a literal ‘goldmine’. "
			+ "You earned 650 coins.";

	///for Dwarf

	private static String strDwarfTower0 ="You arrived at a tower inhabited by worshipers "
			+ "of  your race’s former hero, the great “Thorin Ravenbeard”. As a tribute to your race, you received 250 coins.";
	private static String strDwarfTower1 ="You arrived at a tower touched by the stream of "
			+ "time, and decided to repair it. In a wall you found treasure and sold it for 250 coins.";
	
	private static String strDwarfCrater0 ="1.	You arrived at a crater and found a iron lode. "
			+ "Sadly the lode was tougher than you thought and you broke your "
			+ "equipment. You lost 100 coins.";
	
	private static String strDwarfCrater1 ="You feel down a crater and lost some of your equipment. "
			+ "New equpment cost you 100 coins.";
	
	private static String strDwarfPalaceGates0 ="You arrived at the palace gates to the great dwarf "
			+ "city, you sold your gemstones. You earned 100 coins.";
	
	private static String strDwarfPalaceGates1 ="You were spotted at the palace gate by some worshippers of "
			+ "Thorin Ravenbeard. You repaired their weapons and armor. "
			+ "As a token of gratitude they gave you 100 coins.";
	
	private static String strDwarfColdDesert0 ="While traveling through a cold desert you got stuck in quicksand. "
			+ "A caravan helped you up and charged you 20 coins.";
	
	private static String strDwarfColdDesert1 ="While traveling through a cold desert you met a warrior with "
			+ "broken equipment. You repaired it and received some coins. When looking away, "
			+ "his pet ate your money bag. You lost 20 coins.";
	
	private static String strDwarfWalledCity0 ="While you were repairing the wall at a walled city, a wizard "
			+ "decided to help you by bringing you supplies faster. As payment for a "
			+ "job well done, the city constructer gave you both 180 coins.";
	
	private static String strDwarfWalledCity1 ="While staying in a walled city, you worked in a smithy. "
			+ "You earned 180 coins.";
	
	private static String strDwarfMonastary0 ="You arrived at a monastery inhabited by worshipers of "
			+ "the dwarf hero “Thorin Ravenbeard”. As a thanks for a roof "
			+ "over your head, you helped them out.";
	
	private static String strDwarfMonastary1 ="You arrived at a monastery and decided ask the bishop "
			+ "for a roof over your head.";
	private static String strDwarfBlackCave0 ="In a black cave you find a skeleton on top of a well. "
			+ "Accidently you push it down the well and hear drums beats from "
			+ "the deep depths of the black cave. While fleeing from the cave you drop 70 coins.";
	private static String strDwarfBlackCave1 ="While excavating in a black cave, monsters destroyed some "
			+ "of your equipment. You paid 70 coins in repair fees.";
	
	private static String strDwarfHuts0 ="While traveling in some mountains, you came across some"
			+ " worn huts. You discovered that they once belonged to an elven clan. "
			+ "You decided to loot the huts and sold the goods for 60 coins.";
	
	private static String strDwarfHuts1 ="While traveling in some mountains, you came across some worn huts. "
			+ "While searching them, you found a special longbow. You sold it for 60 coins.";
	
	private static String strDwarfWerewall0;
	private static String strDwarfWerewall1;
	
	private static String strDwarfPit0 ="1.	You were mining in a pit. Sadly, a monster ate your pickaxe. "
			+ "It costed you 50 coins to buy a new one. ";
	
	private static String strDwarfPit1 ="2.	While exploring a cave, you fell into a pit. Luckily a stranger came "
			+ "by and helped you up for the fee of 50 coins.";
	
	private static String strDwarfGoldmine0 ="1.	A week’s hard work, finally payed off. You found a gold lode and mined "
			+ "for 650 coins of gold.";
	
	private static String strDwarfGoldmine1 ="2.	You discovered that carving gems for the princess was a ‘goldmine’. "
			+ "The king payed you 650 coins for your jewelry.";

	///for Elf

	private static String strElfTower0 ="At the proximity of a tower you spot a "
			+ "caravan handling goods of your hated enemies, the dwarfs. "
			+ "They accidently dropped a piece of jewelry. You sold it for 250 coins.";
	
	private static String strElfTower1 ="You arrived at a wizard tower. Due to "
			+ "your exceptional sight, you spotted a treasure hidden "
			+ "near the tower and sold it for 250 coins.";
	
	private static String strElfCrater0 ="Due to walking through a cursed crater you fell ill, "
			+ "and had to pay a medical bill of  100 coins.";
	
	private static String strElfCrater1 ="While exterminating undead entities you lost all your "
			+ "arrows. To buy new ones you paid 100 coins.";
	
	private static String strElfPalaceGates0 ="At the palace gates, you were greeted by the city’s major. "
			+ "You helped him cure his daughter, who was suffering from a deadly disease. "
			+ "As a token of his gratitude, he gave you 100 coins.";
	
	private static String strElfPalaceGates1 ="At the palace gates, you shot down a group of thieves, "
			+ "sadly one escaped. The bounty on the rest of them were a total of 100 coins.";
	
	private static String strElfColdDesert0 ="In preparation for traveling through a cold desert you bought a "
			+ "bunch of blankets. Sadly, they were ruined at the end of the trip. "
			+ "You lost 20 coins.";
	
	private static String strElfColdDesert1 ="While traveling through a cold desert you exterminated scorpions. "
			+ "Sadly, most of your arrows were broken. To fix them, it cost you 20 coins.";
	
	private static String strElfWalledCity0 ="You arrived at a walled city and heard the screams of young "
			+ "damsels in distress. You decided to help them by putting an arrow in "
			+ "their captors. As a token of their gratitude, they gave you 180 coins";
	
	private static String strElfWalledCity1 ="You arrived at a walled city and sold the goods you picked up "
			+ "while traveling. You earned 180 coins.";
	
	private static String strElfMonastary0 ="You decided arrived at a monastery and decided to help the "
			+ "monks and nuns with your healing skills. In return they "
			+ "gave you a roof over your head.";
	
	private static String strElfMonastary1 ="You arrived at a monastery inhabited by worshipers of the "
			+ "dwarf hero “Thorin RavenBeard";
	
	private static String strElfBlackCave0 ="While exploring a black cave, you come across Black Santa’s workshop. "
			+ "You decided to help him, but accidently destroyed his equipment "
			+ "for stealing presents. He charged you 70 coins.";
	
	private static String strElfBlackCave1 ="You were ambushed in a black cave and lost 70 coins.";
	
	private static String strElfHuts0 ="While traveling in some mountains, you came across some worn huts. "
			+ "To your surprise, you discovered that they once belonged to your ancestors. "
			+ "After offering your prayers, you discovered that some coins magically appeared "
			+ "in your pocket. You got 60 coins.";
	
	private static String strElfHuts1 ="You came across some huts in the mountains. As a tribute to your "
			+ "race the inhabitants gave you 60 coins.";
	
	private static String strElfWerewall0;
	private static String strElfWerewall1;
	
	private static String strElfPit0 ="You fell into a pit, while exploring a cave. You have to leave 50 coins "
			+ "behind, so you could you up.";
	
	private static String strElfPit1 ="You arrived at THE PIT. You payed 50 coins to get a tour of THE PIT.";
	
	private static String strElfGoldmine0 ="You opened at healing shop and sold out on the first day. "
			+ "You earned 650 coins.";
	
	private static String strElfGoldmine1 ="You taught the local lord’s son to shoot a bow. The lord payed you "
			+ "650 coins for your excellent lessons.";
	

	///For Thief

	private static String strThiefTower0 ="You arrived at a tower and decided to sneak in "
			+ "and steal whatever valuables they may have. You sold the goods for 250 coins.";
	
	private static String strThiefTower1 ="You arrived at a tower inhabited by "
			+ "worshippers of the ancient dwarf hero “Thorin Ravenbeard” "
			+ "and decided to sell the goods that you stole from a nearby village. You earned 250 coins.";
	
	private static String strThiefCrater0 ="While wandering through a crater you were captured "
			+ "by an enemy thief guild. Sadly, you had to leave some of your money "
			+ "behind when you escaped. You lost 100 coins.";
	
	private static String strThiefCrater1 ="You arrived at a crater and attacked a group of warriors. "
			+ "Sadly, they were stronger than you thought. Thankfully they were greedy "
			+ "and let you live at the cost of 100 coins.";
	
	private static String strThiefPalaceGates0 ="You arrived at the palace gates. While waiting in line to get in, "
			+ "you stole coins from the people in line. You stole 100 coins.";
	
	private static String strThiefPalaceGates1 ="After looting the major’s manor and kidnapping his daughter "
			+ "you escaped through the palace gates. Sadly, your group "
			+ "were shot down by an elven archer. From the theft and ransom, "
			+ "you earned a total of 100 coins.";
	
	private static String strThiefColdDesert0 ="While traveling through a cold desert, a caravan caught you trying "
			+ "to steal their horses. While escaping you dropped some of your coins. "
			+ "You lost 20 coins.";
	
	private static String strThiefColdDesert1 ="While traveling through a cold desert a sneaky fox bit through your "
			+ "money pouch. You lost 20 coins.";
	
	private static String strThiefWalledCity0 ="After arriving at a walled city, you discovered that an enemy "
			+ "thief guild was residing there. After snitching on them the guards "
			+ "gave you 180 coins.";
	
	private static String strThiefWalledCity1 ="In a walled city, you stole some materials for a ceremony "
			+ "and sold it. You earned 180 coins.";
	
	private static String strThiefMonastary0 ="You arrive at a monastery and decides to confess your sins "
			+ "to a priest. He forgave you and gave you a roof over your head";
	
	private static String strThiefMonastary1 ="You arrive at a monastery and decides to lay your way "
			+ "of living on the shelves..  for now..";
	
	private static String strThiefBlackCave0 ="You found a treasure in a black cave. Sadly, while trying to "
			+ "sell it, it was discovered that it was a counterfeit. You were charged 70 coins.";
	
	private static String strThiefBlackCave1 ="At the entrance to a black cave you met college. "
			+ "You betted him, that he couldn’t retrieve a treasure guarded by a dragon. "
			+ "Sadly, he was able to. You payed him 70 coins";
	
	private static String strThiefHuts0 ="While traveling the mountains, you came across some huts. "
			+ "You decided you loot them. You got 60 coins.";
	
	private static String strThiefHuts1 ="You found some huts in the mountains inhabited by savages. You "
			+ "killed them all and looted their huts. You earned 60 coins.";
	
	private static String strThiefWerewall0;
	private static String strThiefWerewall1;
	
	private static String strThiefPit0 ="You were arrested and thrown into a pit. You had to bribe the guard "
			+ "with 50 coins to escape.";
	
	private static String strThiefPit1 ="You were thrown into a pit. Down there your found a gnome, "
			+ "who offered to use his magic to let you escape. He charged you 50 coins.";
	
	private static String strThiefGoldmine0 ="You broke into the kingdoms treasure room. Sadly, you couldn’t "
			+ "carry that many treasures and could only loot it for items worth 650 coins";
	
	private static String strThiefGoldmine1 ="You ambushed a merchant’s caravan. Due to heavens luck, "
			+ "you found a precious gemstone and sold it for 650 coins.";
	
	///String array for all the board messages it's indexes are as such: BoardMessages[Number of fields][Number of Character][Message Number]
	private static String[][][] BoardMessages = 
		{{{strWizardTower0,strWizardTower1},{strWarriorTower0,strWarriorTower1},{strDwarfTower0,strDwarfTower1},{strElfTower0,strElfTower1},{strThiefTower0,strThiefTower1}
		},{{strWizardCrater0,strWizardCrater1},{strWarriorCrater0,strWarriorCrater1},{strDwarfCrater0,strDwarfCrater1},{strElfCrater0,strElfCrater1},{strThiefCrater0,strThiefCrater1}
		},{{strWizardPalaceGates0,strWizardPalaceGates1},{strWarriorPalaceGates0,strWarriorPalaceGates1},{strDwarfPalaceGates0,strDwarfPalaceGates1},{strElfPalaceGates0,strElfPalaceGates1},{strThiefPalaceGates0,strThiefPalaceGates1}
		},{{strWizardColdDesert0,strWizardColdDesert1},{strWarriorColdDesert0,strWarriorColdDesert1},{strDwarfColdDesert0,strDwarfColdDesert0,strDwarfColdDesert1},{strElfColdDesert0,strElfColdDesert1},{strThiefColdDesert0,strThiefColdDesert1}
		},{{strWizardWalledCity0,strWizardWalledCity1},{strWarriorWalledCity0,strWarriorWalledCity1},{strDwarfWalledCity0,strDwarfWalledCity1},{strElfWalledCity0,strElfWalledCity1},{strThiefWalledCity0,strThiefWalledCity1}
		},{{strWizardMonastary0,strWizardMonastary1},{strWarriorMonastary0,strWarriorMonastary1},{strDwarfMonastary0,strDwarfMonastary1},{strElfMonastary0,strElfMonastary1},{strThiefMonastary0,strThiefMonastary1}
		},{{strWizardBlackCave0,strWizardBlackCave1},{strWarriorBlackCave0,strWarriorBlackCave1},{strDwarfBlackCave0,strDwarfBlackCave1},{strElfBlackCave0,strElfBlackCave1},{strThiefBlackCave0,strThiefBlackCave1}
		},{{strWizardHuts0,strWizardHuts1},{strWarriorHuts0,strWarriorHuts1},{strDwarfHuts0,strDwarfHuts1},{strElfHuts0,strElfHuts1},{strThiefHuts0,strThiefHuts1}
		},{{strWizardWerewall0,strWizardWerewall1},{strWarriorWerewall0,strWarriorWerewall1},{strDwarfWerewall0,strDwarfWerewall1},{strElfWerewall0,strElfWerewall1},{strThiefWerewall0,strThiefWerewall1}
		},{{strWizardPit0,strWizardPit1},{strWarriorPit0,strWarriorPit1},{strDwarfPit0,strDwarfPit1},{strElfPit0,strElfPit1},{strThiefPit0,strThiefPit1}	
		},{{strWizardGoldmine0,strWizardGoldmine1},{strWarriorGoldmine0,strWarriorGoldmine1},{strDwarfGoldmine0,strDwarfGoldmine1},{strElfGoldmine0,strElfGoldmine1},{strThiefGoldmine0,strThiefGoldmine1}}};
		
	
	///String array for character names
	private static String[] characterNames = {wizard,warrior,dwarf,elf,thief};
	
	///String array for menu commands
	private static String[] menu = {menuInfo,invalidInput,startCommand};


	/***
	 * 
	 * @return
	 *  String array with elements - 0 : menuinfo , 1: invalidInput
	 */
	public static String menuString(int menuCommand)
	{
		return menu[menuCommand];

	}
	//Randomizer
	public static void randomizer() {
		Random rand = new Random();
		randomvalue = rand.nextInt(2);
	}
	
	public static String getBoardMessage(int fieldNumber, int characterNumber)
	{
		
		return BoardMessages[fieldNumber][characterNumber][randomvalue];
	}
	
	public static void setrandomvalue(int value) {
		randomvalue = value;
	}
	//Getters for Strings.
	public static String getCharacterName(int characterNumber)
	{
		return characterNames[characterNumber];
	}


	public static String getStrWizardTower0() {
		return strWizardTower0;
	}


	public static String getStrWizardTower1() {
		return strWizardTower1;
	}


	public static String getStrWizardCrater0() {
		return strWizardCrater0;
	}


	public static String getStrWizardCrater1() {
		return strWizardCrater1;
	}


	public static String getStrWizardPalaceGates0() {
		return strWizardPalaceGates0;
	}


	public static String getStrWizardPalaceGates1() {
		return strWizardPalaceGates1;
	}


	public static String getStrWizardColdDesert0() {
		return strWizardColdDesert0;
	}


	public static String getStrWizardColdDesert1() {
		return strWizardColdDesert1;
	}


	public static String getStrWizardWalledCity0() {
		return strWizardWalledCity0;
	}


	public static String getStrWizardWalledCity1() {
		return strWizardWalledCity1;
	}


	public static String getStrWizardMonastary0() {
		return strWizardMonastary0;
	}


	public static String getStrWizardMonastary1() {
		return strWizardMonastary1;
	}


	public static String getStrWizardBlackCave0() {
		return strWizardBlackCave0;
	}


	public static String getStrWizardBlackCave1() {
		return strWizardBlackCave1;
	}


	public static String getStrWizardHuts0() {
		return strWizardHuts0;
	}


	public static String getStrWizardHuts1() {
		return strWizardHuts1;
	}


	public static String getStrWizardWerewall0() {
		return strWizardWerewall0;
	}


	public static String getStrWizardWerewall1() {
		return strWizardWerewall1;
	}


	public static String getStrWizardPit0() {
		return strWizardPit0;
	}


	public static String getStrWizardPit1() {
		return strWizardPit1;
	}


	public static String getStrWizardGoldmine0() {
		return strWizardGoldmine0;
	}


	public static String getStrWizardGoldmine1() {
		return strWizardGoldmine1;
	}


	public static String getStrWarriorTower0() {
		return strWarriorTower0;
	}


	public static String getStrWarriorTower1() {
		return strWarriorTower1;
	}


	public static String getStrWarriorCrater0() {
		return strWarriorCrater0;
	}


	public static String getStrWarriorCrater1() {
		return strWarriorCrater1;
	}


	public static String getStrWarriorPalaceGates0() {
		return strWarriorPalaceGates0;
	}


	public static String getStrWarriorPalaceGates1() {
		return strWarriorPalaceGates1;
	}


	public static String getStrWarriorColdDesert0() {
		return strWarriorColdDesert0;
	}


	public static String getStrWarriorColdDesert1() {
		return strWarriorColdDesert1;
	}


	public static String getStrWarriorWalledCity0() {
		return strWarriorWalledCity0;
	}


	public static String getStrWarriorWalledCity1() {
		return strWarriorWalledCity1;
	}


	public static String getStrWarriorMonastary0() {
		return strWarriorMonastary0;
	}


	public static String getStrWarriorMonastary1() {
		return strWarriorMonastary1;
	}


	public static String getStrWarriorBlackCave0() {
		return strWarriorBlackCave0;
	}


	public static String getStrWarriorBlackCave1() {
		return strWarriorBlackCave1;
	}


	public static String getStrWarriorHuts0() {
		return strWarriorHuts0;
	}


	public static String getStrWarriorHuts1() {
		return strWarriorHuts1;
	}


	public static String getStrWarriorWerewall0() {
		return strWarriorWerewall0;
	}


	public static String getStrWarriorWerewall1() {
		return strWarriorWerewall1;
	}


	public static String getStrWarriorPit0() {
		return strWarriorPit0;
	}


	public static String getStrWarriorPit1() {
		return strWarriorPit1;
	}


	public static String getStrWarriorGoldmine0() {
		return strWarriorGoldmine0;
	}


	public static String getStrWarriorGoldmine1() {
		return strWarriorGoldmine1;
	}


	public static String getStrDwarfTower0() {
		return strDwarfTower0;
	}


	public static String getStrDwarfTower1() {
		return strDwarfTower1;
	}


	public static String getStrDwarfCrater0() {
		return strDwarfCrater0;
	}


	public static String getStrDwarfCrater1() {
		return strDwarfCrater1;
	}


	public static String getStrDwarfPalaceGates0() {
		return strDwarfPalaceGates0;
	}


	public static String getStrDwarfPalaceGates1() {
		return strDwarfPalaceGates1;
	}


	public static String getStrDwarfColdDesert0() {
		return strDwarfColdDesert0;
	}


	public static String getStrDwarfColdDesert1() {
		return strDwarfColdDesert1;
	}


	public static String getStrDwarfWalledCity0() {
		return strDwarfWalledCity0;
	}


	public static String getStrDwarfWalledCity1() {
		return strDwarfWalledCity1;
	}


	public static String getStrDwarfMonastary0() {
		return strDwarfMonastary0;
	}


	public static String getStrDwarfMonastary1() {
		return strDwarfMonastary1;
	}


	public static String getStrDwarfBlackCave0() {
		return strDwarfBlackCave0;
	}


	public static String getStrDwarfBlackCave1() {
		return strDwarfBlackCave1;
	}


	public static String getStrDwarfHuts0() {
		return strDwarfHuts0;
	}


	public static String getStrDwarfHuts1() {
		return strDwarfHuts1;
	}


	public static String getStrDwarfWerewall0() {
		return strDwarfWerewall0;
	}


	public static String getStrDwarfWerewall1() {
		return strDwarfWerewall1;
	}


	public static String getStrDwarfPit0() {
		return strDwarfPit0;
	}


	public static String getStrDwarfPit1() {
		return strDwarfPit1;
	}


	public static String getStrDwarfGoldmine0() {
		return strDwarfGoldmine0;
	}


	public static String getStrDwarfGoldmine1() {
		return strDwarfGoldmine1;
	}


	public static String getStrElfTower0() {
		return strElfTower0;
	}


	public static String getStrElfTower1() {
		return strElfTower1;
	}


	public static String getStrElfCrater0() {
		return strElfCrater0;
	}


	public static String getStrElfCrater1() {
		return strElfCrater1;
	}


	public static String getStrElfPalaceGates0() {
		return strElfPalaceGates0;
	}


	public static String getStrElfPalaceGates1() {
		return strElfPalaceGates1;
	}


	public static String getStrElfColdDesert0() {
		return strElfColdDesert0;
	}


	public static String getStrElfColdDesert1() {
		return strElfColdDesert1;
	}


	public static String getStrElfWalledCity0() {
		return strElfWalledCity0;
	}


	public static String getStrElfWalledCity1() {
		return strElfWalledCity1;
	}


	public static String getStrElfMonastary0() {
		return strElfMonastary0;
	}


	public static String getStrElfMonastary1() {
		return strElfMonastary1;
	}


	public static String getStrElfBlackCave0() {
		return strElfBlackCave0;
	}


	public static String getStrElfBlackCave1() {
		return strElfBlackCave1;
	}


	public static String getStrElfHuts0() {
		return strElfHuts0;
	}


	public static String getStrElfHuts1() {
		return strElfHuts1;
	}


	public static String getStrElfWerewall0() {
		return strElfWerewall0;
	}


	public static String getStrElfWerewall1() {
		return strElfWerewall1;
	}


	public static String getStrElfPit0() {
		return strElfPit0;
	}


	public static String getStrElfPit1() {
		return strElfPit1;
	}


	public static String getStrElfGoldmine0() {
		return strElfGoldmine0;
	}


	public static String getStrElfGoldmine1() {
		return strElfGoldmine1;
	}


	public static String getStrThiefTower0() {
		return strThiefTower0;
	}


	public static String getStrThiefTower1() {
		return strThiefTower1;
	}


	public static String getStrThiefCrater0() {
		return strThiefCrater0;
	}


	public static String getStrThiefCrater1() {
		return strThiefCrater1;
	}


	public static String getStrThiefPalaceGates0() {
		return strThiefPalaceGates0;
	}


	public static String getStrThiefPalaceGates1() {
		return strThiefPalaceGates1;
	}


	public static String getStrThiefColdDesert0() {
		return strThiefColdDesert0;
	}


	public static String getStrThiefColdDesert1() {
		return strThiefColdDesert1;
	}


	public static String getStrThiefWalledCity0() {
		return strThiefWalledCity0;
	}


	public static String getStrThiefWalledCity1() {
		return strThiefWalledCity1;
	}


	public static String getStrThiefMonastary0() {
		return strThiefMonastary0;
	}


	public static String getStrThiefMonastary1() {
		return strThiefMonastary1;
	}


	public static String getStrThiefBlackCave0() {
		return strThiefBlackCave0;
	}


	public static String getStrThiefBlackCave1() {
		return strThiefBlackCave1;
	}


	public static String getStrThiefHuts0() {
		return strThiefHuts0;
	}


	public static String getStrThiefHuts1() {
		return strThiefHuts1;
	}


	public static String getStrThiefWerewall0() {
		return strThiefWerewall0;
	}


	public static String getStrThiefWerewall1() {
		return strThiefWerewall1;
	}


	public static String getStrThiefPit0() {
		return strThiefPit0;
	}


	public static String getStrThiefPit1() {
		return strThiefPit1;
	}


	public static String getStrThiefGoldmine0() {
		return strThiefGoldmine0;
	}


	public static String getStrThiefGoldmine1() {
		return strThiefGoldmine1;
	}
	
	
}
