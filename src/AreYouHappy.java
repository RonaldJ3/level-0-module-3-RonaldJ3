import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = JOptionPane.showInputDialog("are you happy.");
		if (a.equalsIgnoreCase("yes"))

		{
			JOptionPane.showMessageDialog(null, "Keep doing what your doing");
		}
		if (a.equalsIgnoreCase("no")) {
			String g = JOptionPane.showInputDialog("Do you want to be happy.");
			if (g.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing what your doing");

			}
			if (g.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null," Change something");
			}
		}
	}
}