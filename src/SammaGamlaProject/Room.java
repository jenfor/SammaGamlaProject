package SammaGamlaProject;

import javax.swing.JPanel;

public class Room {
	//Tillfällig kod för att det ska kompilera
	private PanelSklett jp;
	private GameEngine e;
	int i;
	
	public Room()
	{
	}
	
	public Room(PanelSklett jp, GameEngine e)
	{
		this.jp = jp;
		this.e = e;
		i = 0;
	}
	
	public String getPicture()
	{
		if(i==0)
		{
			i = 1;
			return "pictures/stig.jpg";
			
		}
		
		else 
		{
			i = 0;
			return "pictures/slott.jpg";
		}
		
	}

	
	public JPanel getRoomPanel(String current)
	{
		if (jp != null)
		return jp.getPanel(e.getCurrent());
		
		else 
			return new JPanel();
	}

}


