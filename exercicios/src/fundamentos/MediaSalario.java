package fundamentos;

import javax.swing.JOptionPane;

public class MediaSalario {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Informe o salario 1");
		String valor2 = JOptionPane.showInputDialog(
				"Informe o salario 2");
		String valor3 = JOptionPane.showInputDialog(
				"Informe o salario 3");
		
		double resultado = (Double.parseDouble(valor1) + Double.parseDouble(valor2) +
				Double.parseDouble(valor3)) / 3;
		
		JOptionPane.showMessageDialog(null, resultado);
		
	}
}
