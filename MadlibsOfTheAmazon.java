import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null,
				"If you find yourself having to cross a piranha-infested river, here's how to do it...");

		String adj = JOptionPane.showInputDialog("Enter adjective:");

		String liquid = JOptionPane.showInputDialog("Enter type of liquid:");

		String body = JOptionPane.showInputDialog("Enter body part:");

		String verb = JOptionPane.showInputDialog("Enter verb:");

		String place = JOptionPane.showInputDialog("Enter place:");

		String s = "Piranhas are more " + adj
				+ " during the day, so cross the river at night.\nPiranhas are attracted to fresh " + liquid
				+ " and will most likely take a bite out of your " + body + " if you " + verb
				+ ".\nWhatever you do, if you have an open wound, try to find another way to get back to the " 
			        + place + ". \n\nGood luck!";

		JOptionPane.showMessageDialog(null, s);
	}
}
