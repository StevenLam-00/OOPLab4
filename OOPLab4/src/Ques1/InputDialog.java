package Ques1;
import javax.swing.JOptionPane;
public class InputDialog {
	public void InputName() {
			int question;
			String enterName =JOptionPane.showInputDialog("What is your name?");
			if(enterName != null && enterName.equals("")==false) {
				String Name="Welcome, "+enterName+", to Java Programming! ";
				JOptionPane.showMessageDialog(null, Name, "Output", JOptionPane.INFORMATION_MESSAGE);
			}
	}
}
