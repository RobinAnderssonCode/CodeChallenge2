import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		Gui gui = new Gui();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		gui.setVisible(true);
		gui.setSize(500, 410);
		gui.setLocation(dim.width / 2 - gui.getWidth()
				/ 2, dim.height / 2 - gui.getHeight() / 2);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setTitle("Ceasar Cipher");
	}

}
