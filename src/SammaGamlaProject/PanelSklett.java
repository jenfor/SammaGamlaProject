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
		
		if(current.equals("Center")) panelClickable = createCenterPanel();
		else if(current.equals("Shop")) panelClickable = createShopPanel();
		else if(current.equals("Garden")) panelClickable = createGardenPanel();
		else panelClickable = createMiniGamePanel();
		
		return panelClickable;
	}
	
	private JPanel createCenterPanel()
	{
    
	   	JPanel panel = new JPanel();    
	    panel.setOpaque(false);
	    //panel.setLayout(new GridLayout(4,4));
	    panel.setLayout(null);
	    JButton clickButton = new JButton ("Skylt");
	    clickButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				ui.changeRoom("Shop");
				
			}
		});
	    clickButton.setBounds(4,6,200,400);
	    clickButton.setContentAreaFilled(false);
	    //clickButton.setBorderPainted(false); //med eller utan kant
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
	    JButton clickButton = new JButton ("Centrum");
	    clickButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				ui.changeRoom("Center");
				
			}
		});
	    clickButton.setBounds(4,6,200,400);
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
			
		panelClickable.setOpaque(false);
	    panelClickable.setLayout(null);
		
		return panelClickable;
		
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


