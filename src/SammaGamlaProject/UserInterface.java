package SammaGamlaProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

/**
 * Hej! Jag har flyttat ut createMenu som en egen metod. Tycker att det blir finare och kortare på createGUI då ^ ^
 */
public class UserInterface {
	private GameEngine engine;
    private JFrame myFrame;
	
	//Den metoden som skapas i game
	public UserInterface(GameEngine gameEngine) {
		engine = gameEngine;
		myFrame = engine.frame();
	}
	
	public void createMenu() {
    	//Where the GUI is created:
        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;
        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Build the first menu.
        menu = new JMenu("Meny");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);

        //Nytt spel
        menuItem = new JMenuItem("Nytt spel", new ImageIcon("images/middle.gif"));
        menuItem.setMnemonic(KeyEvent.VK_B);
		menuItem.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent event) {
    			createGUI();
    			engine.printWelcome();
    		}
		});
		menu.add(menuItem);

        //Öppna en sparad fil
        menuItem = new JMenuItem("Öppna",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menu.add(menuItem);
        
        //Spara en fil
        menuItem = new JMenuItem("Spara", new ImageIcon("image.gif"));
        menuItem.setMnemonic(KeyEvent.VK_D);
        menu.add(menuItem);
        
        //Avsluta
        menuItem = new JMenuItem("Avsluta",
                                 new ImageIcon("images/middle.gif"));
        menuItem.setMnemonic(KeyEvent.VK_B);
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
            	int svar = JOptionPane.showConfirmDialog(null, "Vill du lämna spelet utan att spara?", "Avsluta", JOptionPane. YES_NO_OPTION);
            	if(svar == JOptionPane.YES_OPTION)
            		System.exit(0);
            }
        });
        
        menu.add(menuItem);


        //a group of radio button menu items
        menu.addSeparator();
        ButtonGroup group = new ButtonGroup();
        rbMenuItem = new JRadioButtonMenuItem("A radio button menu item");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_R);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem("Another one");
        rbMenuItem.setMnemonic(KeyEvent.VK_O);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        //a group of check box menu items
        menu.addSeparator();
        cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
        cbMenuItem.setMnemonic(KeyEvent.VK_C);
        menu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("Another one");
        cbMenuItem.setMnemonic(KeyEvent.VK_H);
        menu.add(cbMenuItem);

        //a submenu
        menu.addSeparator();
        submenu = new JMenu("A submenu");
        submenu.setMnemonic(KeyEvent.VK_S);

        menuItem = new JMenuItem("An item in the submenu");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_2, ActionEvent.ALT_MASK));
        submenu.add(menuItem);

        menuItem = new JMenuItem("Another item");
        submenu.add(menuItem);
        menu.add(submenu);

        //Build second menu in the menu bar.
        menu = new JMenu("Inställningar");
        menu.setMnemonic(KeyEvent.VK_N);
        menu.getAccessibleContext().setAccessibleDescription(
                "This menu does nothing");
        menuBar.add(menu);

        myFrame.setJMenuBar(menuBar);
        
      //Build second menu in the menu bar.
        menu = new JMenu("Hjälp");
        menu.setMnemonic(KeyEvent.VK_N);
        menu.getAccessibleContext().setAccessibleDescription(
                "This menu does nothing");
        
        menuBar.add(menu);
        
        menuItem = new JMenuItem("Hjälp",
                new ImageIcon("images/middle.gif"));
        menuItem.setMnemonic(KeyEvent.VK_B);
        menuItem.addActionListener(new ActionListener() {
        		@Override
        		public void actionPerformed(ActionEvent event) {
        			JOptionPane.showMessageDialog( null, "[hjälp kommer senare]","Hjäälp",JOptionPane.OK_CANCEL_OPTION); 
        		}
        });
        
        menu.add(menuItem);
        myFrame.setJMenuBar(menuBar);
        
        myFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });
		
        myFrame.pack();
	}
	
	public void createGUI() {
		
	}
}
