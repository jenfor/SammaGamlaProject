package SammaGamlaProject;

public class Player {
	private String userName;
	private int level;
	
	public Player(){
		
		
	}
	
	public String getUserName(){
		return userName;
	}
	
	public void setUserName(String name){
		userName = name;
	}
	
	public int getLevel(){
		return level;
	}
	
	public void setLevel(int newLevel){
		level = newLevel;
	}
	
	//eventuell metod f�r att levla upp beroende p� hur levlandet ska fungera
	public void levelUp(){
		level = level++;
	}
}
