package exerciciosEntrada;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class entradaSaida3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);

		float salarioBruto, addNoturno, hrExtra, desconto, salarioLiquido;

		System.out.println("Digite o salário bruto: ");
		salarioBruto = ler.nextFloat();

		System.out.println("Digite o adicional noturno: ");
		addNoturno = ler.nextFloat();

		System.out.println("Digite a hora extra: ");
		hrExtra = ler.nextFloat();

		System.out.println("Digite o desconto: ");
		desconto = ler.nextFloat();

		salarioLiquido = salarioBruto + addNoturno + (hrExtra * 5) - desconto;

		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		symbols.setDecimalSeparator('.');
		DecimalFormat df = new DecimalFormat("0.00", symbols);

		System.out.println("Salário líquido: " + df.format(salarioLiquido));

		ler.close();
	}

}
