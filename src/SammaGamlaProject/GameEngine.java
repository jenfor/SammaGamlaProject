package SammaGamlaProject;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Den här klassen skapar rum, frame och starta spelet.
 * Return: myFrame och currentRoom med hjälp av två public metoder.
 */
public class GameEngine {
	public Money money;
	private String current;
	private Player user;
	private UserInterface gui;
	
	public GameEngine() {
		//Namnet på vårt spel heter för tillfället spel ^ ^
		money = new Money();
		user = new Player();
		gui = new UserInterface(this);
	}
	
	public String getCurrent() {
		return current;
	}
	
	
	// Jag la till denna /Jenny
	public void setCurrent(String c)
	{
		current = c;
	}
	
	public void printWelcome() {
		String name;
		JOptionPane.showMessageDialog(gui.myFrame(), "Välkommen till vårt spel!!", "", JOptionPane.INFORMATION_MESSAGE);
		name = JOptionPane.showInputDialog(gui.myFrame(), "Vad är ditt namn?", "", JOptionPane.QUESTION_MESSAGE);
		//player.setName(name);
	}
	
	private void createRooms() {
        Room center, shop, garden, minigame1;
      
        center = new Room();
        shop = new Room();
        garden = new Room();
        minigame1 = new Room();

        //startar spelet i centrum
        current = "center";
        
        
       //kommentar
    }
}
