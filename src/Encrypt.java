
public class Encrypt {

	
 
    public static void input(String input, int shift) {
        shift = shift % 26 + 26;
        StringBuilder inputoded = new StringBuilder();
        for (char i : input.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    inputoded.append((char) ('A' + (i - 'A' + shift) % 26 ));
                } else {
                    inputoded.append((char) ('a' + (i - 'a' + shift) % 26 ));
                }
            } else {
                inputoded.append(i);
            }
        }
        String output = inputoded.toString();
        Gui.textArea2.setText(output);
}
}
