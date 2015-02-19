package SammaGamlaProject;
import javax.swing.*;

/**
 * Den h�r klassen skapar rum.
 * Return: myFrame och currentRoom med hj�lp av tv� public metoder.
 */
public class GameEngine {
	private Player user;
	private UserInterface gui;
	private String current;
	
	public GameEngine() {
		user = new Player();
		gui = new UserInterface(this);
		createRooms();
		gui.gameStart();
	}
	
	public String getCurrent() {
		return current;
	}
	
	//Jag la till denna /Jenny
	public void setCurrent(String room) {
		current = room;
	}
	
	public void printWelcome() {
		String name;
		JOptionPane.showMessageDialog(gui.myFrame(), "V�lkommen till v�rt spel!!", "", JOptionPane.INFORMATION_MESSAGE);
		name = JOptionPane.showInputDialog(gui.myFrame(), "Vad �r ditt namn?", "", JOptionPane.QUESTION_MESSAGE);
		user.setUserName(name);
	}
	
	private void createRooms() {
        Room center, shop, garden, minigame1;
      
        center = new Room();
        shop = new Room();
        garden = new Room();
        minigame1 = new Room();

        //startar spelet i centrum
        current = "center";
    }
}
