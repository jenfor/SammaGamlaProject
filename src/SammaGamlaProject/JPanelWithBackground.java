package SammaGamlaProject;
import javax.swing.*;
import java.awt.*;

/**
 * Sätter skalad bakgrundsbild. Kan använda setLayout(null) och add-funktion för att adda synliga/osynliga knappar på bilden.
 * Inparameter: sökväg för bild
 */
public class JPanelWithBackground extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image bgimage = null;

	public JPanelWithBackground(String fileName) {
		MediaTracker mt = new MediaTracker(this);
		bgimage = Toolkit.getDefaultToolkit().getImage(fileName);
		mt.addImage(bgimage, 0);
		try {
			mt.waitForAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	protected void paintComponent(Graphics g) {
		g.drawImage(bgimage, 0, 0, getSize().width, getSize().height, null);
	}
}