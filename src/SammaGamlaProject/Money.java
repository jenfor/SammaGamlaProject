package SammaGamlaProject;

public class Money {

	private int money;
	
	public Money(){
		money = 0;
	}
	
	public int getMoney(){
		return money;
	}
	
	public void changeMoney(int value){ //value kan förstås vara både positivt och negativt
		money = money + value;
	}
}
