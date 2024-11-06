package exswitch;

import java.util.Scanner;

public class lacoCondicionalSwitch4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		float saque, deposito;
		float saldo = 1000.00f;
		
		System.out.println("Escolha uma das opções abaixo: ");
		System.out.println("1: Saldo");
		System.out.println("2: Saque");
		System.out.println("3: Depósito");
		opcao = scanner.nextInt();
		
		switch(opcao) {
		
		case 1:
			System.out.printf("%nOperação - Saldo%nSaldo: R$ %.2f", saldo);
			break;
			
		case 2:
			System.out.printf("%nValor para ser sacado: ");
			saque = scanner.nextFloat();
			
			if (saque <= saldo) {
				saldo -= saque;
				System.out.printf("%nOperação - Saque%nNovo Saldo: R$ %.2f", saldo);
			}else {
				System.out.printf("%nOperação - Saque%nSaldo insuficiente!");
			}
			
			break;
			
		case 3:
			System.out.printf("%nValor para ser depositado: ");
			deposito = scanner.nextFloat();
			
			saldo += deposito;
			System.out.printf("%nDepósito - Saldo:%nNovo Saldo: R$ %.2f", saldo);
			
			break;
			
			default:
				System.out.println("%nOpção inválida!");
				break;
		}
		
		
		scanner.close();

	}

}
