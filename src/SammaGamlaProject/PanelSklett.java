package SammaGamlaProject;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.io.File;


public class PanelSklett{
	private GameEngine engine;
	public Room center;
	public Room shop;
	public Room garden;
	public Room miniGame1;
	public Room miniGame2;
	JPanel panelClickable;
	private UserInterface ui;
	public GardenController gardenController;
	public Inventory in = new Inventory();
	
	public PanelSklett(GameEngine e, UserInterface ui)
	{
		engine = e;
		this.ui = ui;
		
		center = new Center();
		shop = new Shop();
		garden = new Garden();
		miniGame1 = new MiniGame();
		
		gardenController = new GardenController(garden, in);
	}
	
	private JPanel getInventoryPanel()
	{
		panelClickable = createInventoryPanel();
		return panelClickable;
		
	}
	
	 private void reSize(int windowchanges)
	 {
		 
	 }
	
	public JPanel getPanel(String current)
	{
		
		if(current.equals("center")) panelClickable = createCenterPanel();
		else if(current.equals("shop")) panelClickable = createShopPanel();
		else if(current.equals("garden")) panelClickable = createGardenPanel();
		else panelClickable = createMiniGamePanel();
		
		return panelClickable;
	}
	
	private JPanel createCenterPanel()
	{
    
	   	JPanel panel = new JPanel();    
	    panel.setOpaque(false);
	    //panel.setLayout(new GridLayout(4,4));
	    panel.setLayout(null);
	    JButton clickButton = new JButton ("Affär");
	    clickButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				ui.changeRoom("shop");
				
			}
		});
	    clickButton.setBounds(4,6,200,400);
	    clickButton.setContentAreaFilled(false);
	    clickButton.setBorderPainted(false); //med eller utan kant
	    panel.add(clickButton);
	    
	    JButton clickButton2 = new JButton ("Skylt2");
	    clickButton2.setBounds(300,400,200,200);
	    clickButton2.setContentAreaFilled(false);
	    //clickButton.setBorderPainted(false); //med eller utan kant
	    panel.add(clickButton2);
	    
	   	    
	    return panel;
    
    
	}
	
	private JPanel createShopPanel()
	{
		
		HashMap<Integer, String> shopItems; // =shop.getShopItems();
		
		
		
		JPanel panel = new JPanel();    
	    panel.setOpaque(false);
	    //panel.setLayout(new GridLayout(4,4));
	    panel.setLayout(null);
	    JButton clickButton = new JButton ("Trädgård");
	    clickButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				ui.changeRoom("garden");
				
			}
		});
	    clickButton.setBounds(4,6,300,200);
	    clickButton.setContentAreaFilled(false);
	    //clickButton.setBorderPainted(false); //med eller utan kant
	    panel.add(clickButton);
	    
	    JButton clickButton2 = new JButton ("Skylt2");
	    clickButton2.setBounds(300,400,200,200);
	    clickButton2.setContentAreaFilled(false);
	    //clickButton.setBorderPainted(false); //med eller utan kant
	    panel.add(clickButton2);
	    
	   	    
	    return panel;
    
	    
	    //************************************************************************************
		
		
	}
	
	private JPanel createGardenPanel()
	{
		JPanel panel = new JPanel(); 
		panel.setOpaque(false);
	    panel.setLayout(null);
	    JPanel showInventory;
	    JButton itemsLeft;
	    int rad = 0;
	    int column =0;
	    int lopnr=0;
	    
	    
	    HashMap<ImageIcon, Integer> inventory = gardenController.getInventory();
        Set<Entry<ImageIcon, Integer>> pairs = inventory.entrySet();
	    
	    // Det osynlliga rutnätet med knappar
	    
	    for( int j=0;j<37;j++){    	
	    		    
		    for( int i=0;i<23;i++)
		    {
		    	lopnr++;// Varje knapp får ett eget nummer			    		    
			    final int nr = lopnr;
			    
			    /*String s = "buildable"; // Kom ihåg om det finns en tegelsten här eller inte...
			    if(gardenController.getIcon(nr)!= null)  s= "unbuildable";
			    final String startState = s;
			    */
			    			     
		    	final ImageIcon icon3= gardenController.getIcon(nr);
		    	
		    	
			    
			    final JButton clickButton = new JButton(icon3);
			    //setResizable(false);// Testa senare
			    clickButton.setBounds(column,rad,30,30);
			    clickButton.setContentAreaFilled(false);//Osynlighet
			    clickButton.setBorderPainted(false);//Osynlighet
			    clickButton.addActionListener(new ActionListener() {
			    	
			    	//String state = startState;
			    	ImageIcon takenImage = new ImageIcon("pictures/skylt.png"); //gardenController.getTakenImage();
			    	String state ="buildable";
			    	@Override
					public void actionPerformed(ActionEvent arg0) {
												
						if(state.equals("buildable"))
						{
							state="unbuildable";
							System.out.println("takenImage i rutnätet  "+ takenImage);
							clickButton.setIcon(takenImage);
							gardenController.build(nr, takenImage);
							
						}
	
						else if(state.equals("unbuildable"))
					    {
							state="buildable";
							clickButton.setIcon(null);
							clickButton.setContentAreaFilled(false);
							gardenController.remove(nr);
						}
					}
					
			    });	
					
			    panel.add(clickButton);
			    
			    rad = rad + 30;
			    			   	    		    
		    }
		   
		    column = column + 30;
		    rad =0;
						   	    		    
		}
	  //**************************************************************************************************** 	
	    //Panelen vid sidan av
	    showInventory = new JPanel();
	    showInventory.setLayout(null);
	    showInventory.setBounds(1110,0, 81, 1000);
	    
	    // Nollställer för ny loop
	     rad = 30;
	     column = 30;
	   
	 
	        
	   
	        //Fixar fram det som ska visas på sidopanelen
	        for(Entry<ImageIcon, Integer> entry: pairs){
	    	
	    	// Visa bild på tillgänliga Item
	    	final ImageIcon imageOfItem = entry.getKey();
	    	System.out.println("imageOfItem i sidopanelen" +imageOfItem );
	    	final JButton showItem;showItem = new JButton(imageOfItem);
		    showItem.setBounds(column, rad,30,30);
		    
		    //Vad bildknappen ska göra
		    
		    showItem.addActionListener(new ActionListener() {
		    	    	
		    	@Override
				public void actionPerformed(ActionEvent arg0) {
											
						gardenController.take(imageOfItem);
					
				}
				
		    });	
		    
		    // Visa antal  tillgänliga Items
		    int x =entry.getValue();
		    itemsLeft = new JButton();
		    itemsLeft.setText("" + x);
		    itemsLeft.setBounds(column-15, rad+30,60,30);
		    itemsLeft.setContentAreaFilled(false);//Osynlighet
		    itemsLeft.setBorderPainted(false);//Osynlighet
		    
		    //Lägg till bild och antal 
		    showInventory.add(showItem);
		    showInventory.add(itemsLeft);
		    
		    // Byt till ny position
		    rad= rad +60;
	    }
	    
	     panel.add(showInventory);
	     return panel;
	     
	}
	
	
	
	private JPanel createMiniGamePanel()
	{
		JPanel panel = new JPanel();
		
		panel.setOpaque(false);
	    panel.setLayout(null);
		
		return panel;
		
	}
	
	private JPanel createInventoryPanel()
	{
		JPanel panel = new JPanel();	
		panel.setOpaque(false);
	    panel.setLayout(null);
		
		return panel;
		
	}
	
	
}


