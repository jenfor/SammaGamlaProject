package SammaGamlaProject;

import java.util.HashMap;

public class Inventory {
	private HashMap<Item, Integer> items;
	
	public Inventory() {
		
		//items = new HashMap(itemName, antal);
	}
	
	private HashMap<Item, Integer> getInventory() {
		return items;
	}
	
	private void updateInventory(Item item, int antal) {
		
	}
	
	private void createInventory(){
		Item blueBrick = new Item(100, 1, "picture/skylt.png");
		Item redBrick = new Item(100, 1, "picture/exitskylt.png");
		items = new HashMap<Item, Integer>();
		items.put(blueBrick, 0);
		items.put(redBrick, 0);
		items.put(blueBrick, 2);
		System.out.println(items.get(blueBrick));
	}
	
}
