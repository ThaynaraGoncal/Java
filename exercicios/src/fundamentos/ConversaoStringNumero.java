package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog(
				"Digite o primeiro número:");
		String num2 = JOptionPane.showInputDialog(
				"Digite o segundo número:");
		
		System.out.println(num1 + num2);
	}

}
