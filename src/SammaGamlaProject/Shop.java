package SammaGamlaProject;

import java.awt.Image;
import java.util.HashMap;

public class Shop extends Room{
	//private HashMap<Integer, String[]> shopItems; //int = level, string[] = f�rem�lslista? diskutera lite hur detta ska funka
	private HashMap<String, Integer> shopItems; //tycker kanske det ska vara s�h�r ist�llet? fast vad �r String egentligen?
	private Image shopPicture; //ska inte sj�lva bildobjektet (Image) skapas i PanelSkelett?
	private Item shopItem; //vad �r det h�r?
	
	public Shop(){
		shopItems = new HashMap<String, Integer>();
		updateShop();
	}
	
	public HashMap<String, Integer> getShopItems(){
		return shopItems;
	}
	
	private void updateShop(){
		
		//for ( Item i : -inventorynamn-.getAllItems() ) //d�r getAllItems returnerar en array med Items (alla olika sorter) dvs. Item[]
		//shopItems.put(???namn???, i.getItemLevel);
	}
	
	public void buy(String boughtItem){ //ska argumentet vara en str�ng f�r namnet p� det man klickat p�? eller ett Item-objekt f�r det?
		//ska kolla om valt f�rem�l f�r k�pas vid aktuellt level
		//ska dra bort pengar fr�n spelarens pl�nbok
		//ska l�gga till valt f�rem�l i spelarens ryggs�ck
		
		//typ: if ( player1.getLevel() >= shopItems.get(boughtItem) ) //kollar om spelarens level >= f�rem�lets level
		//          -varnuMoneyligger-.setMoney( (-varnuMoneyligger-.getMoney()) - boughtItem.getItemPrice() );
		//			-spelarensinventory-.updateInventory(newItem, antal);
	}

}
