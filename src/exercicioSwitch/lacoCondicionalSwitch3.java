package exercicioSwitch;

import java.util.Scanner;

public class lacoCondicionalSwitch3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		float numero1, numero2, resultado;
		int operacao;
		
		System.out.println("Digite o número 1: ");
		numero1 = scanner.nextFloat();
		
		System.out.println("Digite o número 2: ");
		numero2 = scanner.nextFloat();
		
		System.out.println("\nEscolha a operação\n1: Soma\n2: Subtração\n3: Multiplicação\n4: Divisão");
		operacao = scanner.nextInt();
		
		switch (operacao) {
		case 1:
			resultado = numero1 + numero2;
			System.out.printf("Resultado é: %.1f + %.1f = %.1f%n", numero1, numero2, resultado);
			break;
			
		case 2:
			resultado = numero1 - numero2;
			System.out.printf("Resultado é: %.1f - %.1f = %.1f%n", numero1, numero2, resultado);
			break;
			
		case 3:
			resultado = numero1 * numero2;
			System.out.printf("Resultado é: %.1f * %.1f = %.1f%n", numero1, numero2, resultado);
			break;
			
		case 4:
			resultado = numero1 / numero2;
			System.out.printf("Resultado é: %.1f != %.1f = %.1f%n", numero1, numero2, resultado);
			break;
		}
		
		scanner.close();
		

	}

}
