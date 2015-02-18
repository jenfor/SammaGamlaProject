package SammaGamlaProject;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class PanelSklett {
	private GameEngine engine;
	public Room center;
	public Room shop;
	public Room garden;
	public Room miniGame1;
	public Room miniGame2;
	JPanel panelClickable;
	private UserInterface ui;
	
	public PanelSklett(GameEngine e, UserInterface ui)
	{
		engine = e;
		this.ui = ui;
		center = new Center();
		shop = new Shop();
		garden = new Garden();
		miniGame1 = new MiniGame();
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
	    int rad = 0;
	    int column =0;
	    int i =0;
	    int j = 0;
	    
	    for( j=0;j<43;j++){    	
	    		    
		    for( i=0;i<23;i++)
		    {
		    		   
			    final JButton clickButton = new JButton ();
			    clickButton.setContentAreaFilled(false);
			    clickButton.setBounds(column,rad,30,30);
			     
			    clickButton.setBorderPainted(false);//Osynlig
			    clickButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						int option =1;
						if(option ==1){
							option=0;
							clickButton.setContentAreaFilled(true);
						}
	
						else
					    {
						option =1;
						clickButton.setContentAreaFilled(false);
						}
						
					}
					
			    });	
					
			    panel.add(clickButton);
			    
			    rad = rad + 30;
			    			   	    		    
		    }
		    /*rad = 0;
		    i=0;
		    for( i=0;i<23;i++)
		    {
		    		   
			    JButton clickButton = new JButton ();
			    clickButton.setContentAreaFilled(false);
			    clickButton.setBounds(30,rad,30,30);
			    //clickButton.setContentAreaFilled(false); Synlig för tillfället så jag ser vad jag gör
			    panel.add(clickButton);
			    
			    rad = rad + 30;
			    			   	    		    
		    }*/
		    column = column + 30;
		    i=0;
		    rad =0;
			 
			   	    		    
		}
	   
		    
		return panel;
			
	}
	
	private JPanel createMiniGamePanel()
	{
		JPanel panelClickable = new JPanel();
		
		panelClickable.setOpaque(false);
	    panelClickable.setLayout(null);
		
		return panelClickable;
		
	}
	
	private JPanel createInventoryPanel()
	{
			
		panelClickable.setOpaque(false);
	    panelClickable.setLayout(null);
		
		return panelClickable;
		
	}
	
	
}


