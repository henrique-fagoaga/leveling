import javax.swing.JOptionPane;

public class Calculator {
	public static void main(String[] args) {
		int n1 = Integer.parseInt(
			JOptionPane.showInputDialog("Insert n1:")
		);

		int n2 = Integer.parseInt(
			JOptionPane.showInputDialog("Insert n2:")
		);

		int result = n1 + n2;
		String message = String.format("%d + %d = %d", n1, n2, result);
		JOptionPane.showMessageDialog(null, message);
	}
}

