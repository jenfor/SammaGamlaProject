package SammaGamlaProject;

public class Money {

	private int money;
	
	public Money(){
		money = 0;
	}
	
	public int getMoney(){
		return money;
	}
	
	public void changeMoney(int value){ //value kan f�rst�s vara b�de positivt och negativt
		money = money + value;
	}
}
