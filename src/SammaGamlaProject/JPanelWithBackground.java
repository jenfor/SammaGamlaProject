package SammaGamlaProject;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * SÃ¤tter skalad bakgrundsbild. Kan anvÃ¤nda setLayout(null) och add-funktion fÃ¶r att adda synliga/osynliga knappar pÃ¥ bilden.
 * Inparameter: sÃ¶kvÃ¤g fÃ¶r bild
 */
public class JPanelWithBackground extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image bgimage = null;

	public JPanelWithBackground(String fileName /*,UserInterface ui*/) {
		MediaTracker mt = new MediaTracker(this);
		bgimage = Toolkit.getDefaultToolkit().getImage(fileName);
		mt.addImage(bgimage, 0);
		try {
			mt.waitForAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//addBorderMenu();
	}

	protected void paintComponent(Graphics g) {
		g.drawImage(bgimage, 0, 0, getSize().width, getSize().height, null);
	}
	/*
	public void addBorderMenu()
	{
		JButton exitButton = new JButton("Exit");
        JButton button2 = new JButton("Centrum");
        JButton mapButton = new JButton("Karta");
        JButton button4 = new JButton("Föremål");
        JButton button5 = new JButton("Pengar");
        JButton button6 = new JButton("Föremål");
        JButton button7 = new JButton("Pengar"); 
		
		    JPanel p = new JPanel(new GridLayout(4,1));
	        JPanel p2 = new JPanel(new GridLayout(4,1));
	        JPanel b = new JPanel();
	        b.setLayout(new BoxLayout(b, BoxLayout.X_AXIS));

	        p.add(button2);
	        p.add(mapButton);
	        p.add(exitButton);
	        b.add(button4);
	        b.add(button5);
	        
	        /*panel.*///setLayout(new BorderLayout());
	        //panel.add(textBox, BorderLayout.AFTER_LAST_LINE);
	        /*panel.*///add(p, BorderLayout.WEST);
	        /*panel.*///add(p2, BorderLayout.EAST);
	        /*panel.*///add(b, BorderLayout.NORTH);
	        /*
	        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	        double width = screenSize.getWidth();
	        double height = screenSize.getHeight();
	        
	        double textHeight = height * 0.15;
	        double textWidth = height * 0.15;
	        double imgWidth = width * 0.9;
	        double imgHeight = height * 0.9;
	       
	        
	        /*panel.*///setPreferredSize(new Dimension((int)width, (int)height)); //bildstorlek, gör om till att skala
	        /*panel.*///setMinimumSize(new Dimension((int)width, (int)height)); //istället för att skära av
                
	        
	        /*button2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					ui.changeRoom("center");
					
				}
				
	
	}
	*/
	
}
