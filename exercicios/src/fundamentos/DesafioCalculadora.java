package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("-------Calculadora---------");
		System.out.println("Digite o primeiro número: ");
		String valor1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o segundo número: ");
		String valor2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Escolha qual dessas operações deseja realizar: ");
		System.out.println("+ - * / ");
		String operador = entrada.next();
		
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		
		double adicao = num1 + num2;
		double subtracao = num1 - num2;
		double multiplicacao = num1 * num2;
		double divisao = num1 / num2;
				
		double resultado = operador.equals("+") ? adicao : operador.equals("-") ? subtracao : operador.equals("*") ? multiplicacao : divisao; 
		
		System.out.println("O resultado de " + valor1 + operador + valor2 + " = " + resultado);
		
		entrada.close();
	}
}
