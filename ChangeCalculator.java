package mihajlovic.jelena;

import javax.swing.JOptionPane;

public class ChangeCalculator {

	public static void main(String[] args) {

		String n = JOptionPane.showInputDialog("How many nickles you have?");		
		int nickles = Integer.parseInt(n);
		
		String d = JOptionPane.showInputDialog("How many dimes you have?");
		int dimes = Integer.parseInt(d);

		String q = JOptionPane.showInputDialog("How many quarters you have?");
		int quarters = Integer.parseInt(q);

		double change = nickles*5 + dimes*10 + quarters*25;

		JOptionPane.showMessageDialog(null, "You have " + change + " cents.");
	}
}
