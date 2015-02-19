package SammaGamlaProject;
import java.util.HashMap;

/**
 * 
 * Just nu innehåller inventory en hashmap med bluebrick o redbrick bara
 * För att testa detta kan man köra den bortkommenterade raden
 *
 */

public class Inventory {
	private HashMap<Item, Integer> items;
	
	public Inventory() {
		items = new HashMap();
		createInventory();
	}
	
	private HashMap<Item, Integer> getInventory() {
		return items;
	}
	
	private void updateInventory(Item item, Integer amount) {
		
	}
	
	private void createInventory(){
		Item blueBrick = new Item(100, 1, "picture/skylt.png");
		Item redBrick = new Item(100, 1, "picture/exitskylt.png");
		items.put(blueBrick, 0);
		items.put(redBrick, 0);
		//JOptionPane.showMessageDialog(gui.myFrame(), items.get(blueBrick), "", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
