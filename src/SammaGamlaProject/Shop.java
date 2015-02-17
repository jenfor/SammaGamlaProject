package SammaGamlaProject;

import java.awt.Image;
import java.util.HashMap;

public class Shop extends Room{
	//private HashMap<Integer, String[]> shopItems; //int = level, string[] = föremålslista? diskutera lite hur detta ska funka
	private HashMap<String, Integer> shopItems; //tycker kanske det ska vara såhär istället? fast vad är String egentligen?
	private Image shopPicture; //ska inte själva bildobjektet (Image) skapas i PanelSkelett?
	private Item shopItem; //vad är det här?
	
	public Shop(){
		shopItems = new HashMap<String, Integer>();
		updateShop();
	}
	
	public HashMap<String, Integer> getShopItems(){
		return shopItems;
	}
	
	private void updateShop(){
		
		//for ( Item i : -inventorynamn-.getAllItems() ) //där getAllItems returnerar en array med Items (alla olika sorter) dvs. Item[]
		//shopItems.put(???namn???, i.getItemLevel);
	}
	
	public void buy(String boughtItem){ //ska argumentet vara en sträng för namnet på det man klickat på? eller ett Item-objekt för det?
		//ska kolla om valt föremål får köpas vid aktuellt level
		//ska dra bort pengar från spelarens plånbok
		//ska lägga till valt föremål i spelarens ryggsäck
		
		//typ: if ( player1.getLevel() >= shopItems.get(boughtItem) ) //kollar om spelarens level >= föremålets level
		//          -varnuMoneyligger-.setMoney( (-varnuMoneyligger-.getMoney()) - boughtItem.getItemPrice() );
		//			-spelarensinventory-.updateInventory(newItem, antal);
	}

}
