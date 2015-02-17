package SammaGamlaProject;

public class Item {
	/*Vi får bestämma hur vi vill se på föremål. Ska det finnas ETT objekt av varje sort som håller reda på
	föremålens egenskaper, eller massor av objekt för varje man har?
	Det räcker med ett objekt för varje föremålstyp, eftersom vi ändå har integers i inventory som håller reda
	på hur många vi har. Så vi flyttar inte runt själva Item-objekten, utan lägger bara till och drar bort i
	integer-variablerna för hur många vi har. Item-objektet används bara för att titta på vad ett visst föremål
	kostar, dess bild, eventuellt level, osv. Man tittar på ett visst item via dess namn antagligen, som sätts
	upp när nytt Item skapas. (ex: Item NAMNNNN = new Item(100, 3, "redbrick.jpg");*/
	
	private int price;
	private int level;
	private String pictureFile;
	
	public Item(int price, int level, String pictureFile){
		this.price = price;
		this.level = level;
		this.pictureFile = pictureFile;
	}
	
	public String getImagePicture(){
		return pictureFile;
	}
	
	public int getItemPrice(){
		return price;
	}
	
	public int getItemLevel(){
		return level;
	}
	
	
}
