package exerciciosEntrada;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class entradaSaida4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);

		float n1, n2, n3, n4, produto1, produto2, diferenca;

		System.out.println("Digite o primeiro produto: ");
		n1 = ler.nextFloat();

		System.out.println("Digite o segundo produto: ");
		n2 = ler.nextFloat();

		System.out.println("Digite o terceiro produto: ");
		n3 = ler.nextFloat();

		System.out.println("Digite o quarto produto: ");
		n4 = ler.nextFloat();

		produto1 = n1 * n2;
		produto2 = n3 * n4;

		diferenca = produto1 - produto2;

		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		symbols.setDecimalSeparator('.');
		DecimalFormat df = new DecimalFormat("0.0", symbols);

		System.out.println("Resultado: " + df.format(diferenca));

		ler.close();
	}

}
