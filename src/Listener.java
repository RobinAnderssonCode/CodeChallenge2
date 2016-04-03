import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

public class Listener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		
		JComboBox<?> combo = (JComboBox<?>) e.getSource();
		String currentList = (String) combo.getSelectedItem();
		int shift = Integer.parseInt(currentList);

		String input;
		input = Gui.textArea1.getText();

		Encrypt.input(input, shift);

	}

}
