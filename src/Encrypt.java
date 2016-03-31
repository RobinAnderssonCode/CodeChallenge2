public class Encrypt {

	static void encrypt(String input, int shift) {

		char[] ch = input.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			char letter = ch[i];
			letter = (char) (letter + shift);

			if (Character.isLetter(letter)) {
				if (Character.isUpperCase(letter)) {
					if (letter > 'Z') {
						letter = (char) (letter - 26);
					} else if (letter < 'A') {
						letter = (char) (letter + 26);
					}
				} else {
					if (letter > 'z') {
						letter = (char) (letter - 26);
					} else if (letter < 'a') {
						letter = (char) (letter + 26);
					}

				}

				ch[i] = letter;
			}

			String output = new String(ch);
			Gui.textArea2.setText(output);
		}

	}
}
