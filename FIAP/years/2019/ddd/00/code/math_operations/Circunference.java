import javax.swing.JOptionPane;

public class Circunference {
	public static void main(String[] args) {
		double radius = Double.parseDouble(
			JOptionPane.showInputDialog("Insert radius:")
		);

		double area = calculate(radius);
		String message = String.format("Circle area: %.99f", area);
		System.out.println("debug");
		JOptionPane.showMessageDialog(null, message);
	}
	
	public static double calculate(double radius) {
		return  Math.PI * Math.pow(radius, 2);
	}
}

