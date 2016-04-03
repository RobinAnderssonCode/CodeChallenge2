import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Gui extends JFrame {

	private static final long serialVersionUID = 1L;

	static JTextArea textArea1, textArea2;
	private String[] dropMenuList = { "-25", "-24", "-23", "-22", "-21", "-20", "-19", "-18", "-17", "-16", "-15",
			"-14", "-13", "-12", "-11", "-10", "-9", "-8", "-7", "-6", "-5", "-4", "-3", "-2", "-1", "0", "1", "2", "3",
			"4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
			"23", "24", "25" };

	public Gui() {
		setLayout(new FlowLayout());

		JComboBox<Object> dropMenu = new JComboBox<Object>(dropMenuList);
		dropMenu.setSelectedIndex(25);
		dropMenu.addActionListener(new Listener());
		add(dropMenu);

		textArea1 = new JTextArea("Text to encrypt", 10, 40);
		add(textArea1);

		textArea2 = new JTextArea("Output", 10, 40);
		add(textArea2);

	}

}


