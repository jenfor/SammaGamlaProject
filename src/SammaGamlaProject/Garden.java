package SammaGamlaProject;

import java.awt.Image;
import java.util.HashMap;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Garden extends Room{
	
	public HashMap<Integer, ImageIcon> gardenItems; //där Integer är löpnummer och Icon Items bild 
	private Item gardenItem;
	private Image gardenPicture;
	
	public Garden(){
		gardenItems = new HashMap<Integer, ImageIcon>();
		}
	
	public HashMap<Integer, ImageIcon> getGardenItems(){
		return gardenItems;
	}
	
	public void addItem(int lopnr, ImageIcon icon){
		gardenItems.put(lopnr, icon); //lägger till iconbilden på given x-position
		System.out.println("Nu är vi i Gardens addItem med löpnr: "+ lopnr);
		System.out.println("Detta är vad som finns sparat i trädgården "+ gardenItems);
	}
	
	public void removeItem(int lopnr){
		gardenItems.remove(lopnr); //Tar bort bild från plats
		System.out.println("Nu är vi i Gardens remove"+ lopnr);
	}
	
	public ImageIcon getGardenIcon(int lopnr){
		 //Hämtar bilden till en speciell plats i Garden
		System.out.println("Nu är vi i Gardens getGardenIcon med löpnr: "+ lopnr);
		return  gardenItems.get(lopnr);
		
	}
	
	public String getPicture(String current)
	{
		return "pictures/strand.jpg";
	}
}
