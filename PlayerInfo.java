package AdventureShop;

import java.util.*;

public class PlayerInfo {
	//default information
	//Name, Race, Job
	List<String> playerInfo = Arrays.asList("Bob", "Human", "");
	
	int level = 1;
	int coin = 1000;
	
	//Armor/Weapon/Jewelry equipment
		//type, rarity, name, level, attack/armor, extra stats
	List<String> list = Arrays.asList("", "", "", "", "", "");
	HashMap<String, List<String>> AEquipment = (HashMap<String, List<String>>) Map.of("Helment", list, "Armor", list, 
			"Arm", list, "Pant", list, "Belt", list, "Boot", list, "Glove", list);
	
	//jewelry equipment
	HashMap<String, List<String>> JEquipment = (HashMap<String, List<String>>) Map.of("RRing", list, 
			"LRing", list, "Necklace", list);
	
	//weapon equipment
	HashMap<String, List<String>> WEquipment = (HashMap<String, List<String>>) Map.of("mainHand", list, 
			"secondHand", list, "ammo", list);

}
