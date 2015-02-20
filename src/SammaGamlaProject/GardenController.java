package SammaGamlaProject;

import java.util.HashMap;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.ImageIcon;


public class GardenController {
	
	Room garden;
	ImageIcon itemIcon;
	int nrOfItem;
	ImageIcon takenItem;
	HashMap<ImageIcon, Integer> inventory = fuskaFramHashMap();// Tillfällig  map när jag jobbar utan inventory Icon ska egentligen var Item
	
	
	public GardenController(Room g,Inventory in)
	{
		//inventory = in.getInventory();
		garden = g;
			
	}
	
	private HashMap<ImageIcon, Integer> fuskaFramHashMap()
	{
		HashMap<ImageIcon, Integer> inventoryFusk = new HashMap<ImageIcon, Integer>();
		
		ImageIcon i = new ImageIcon("pictures/skylt.png");
		inventoryFusk.put(i, 15);
		ImageIcon j = new ImageIcon("pictures/exitskylt.png");
		inventoryFusk.put(j, 20);
		
		return inventoryFusk;
	}
	
		
	public HashMap<ImageIcon, Integer> getInventory()
	{
		return inventory;
	
	}
	

	
	public ImageIcon getIcon(int lopnr)
	{
		//System.out.println("Nu är vi i getIcon"+ lopnr);
		return garden.getGardenIcon(lopnr);
	}
	
	
	
	
	public void remove(int lopnr)
	{
		ImageIcon icon = garden.getGardenIcon(lopnr);
		garden.removeItem(lopnr);
		System.out.println("Nu är vi i remove"+ lopnr);
		if(inventory.containsKey(icon))
		{
			int nr = inventory.get(icon);
			nr++;
			inventory.put(icon, nr);
		}
	}
	
	public void take(ImageIcon imageOfItem)
	{
		takenItem = imageOfItem;
	}
	
	
	public ImageIcon getTakenImage()
	{
		return (ImageIcon)takenItem;

	}
	
	public void build(int lopnr, ImageIcon icon)
	{
		//if(takenItem != null)
		//{
		garden.addItem(lopnr, icon);
		System.out.println("Nu är vi i build"+ lopnr);
		//Minska värdet på key:n ImageIcon med 1
		
		int nr = 0;
		if(inventory.containsKey(takenItem)){
			nr =inventory.get(takenItem);
		nr--;
		inventory.put(takenItem, nr);
		}
		//}
		//takenItem = null;
				
	}
	
	
}
