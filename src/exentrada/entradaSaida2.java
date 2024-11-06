package exentrada;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class entradaSaida2 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);

		float nota1, nota2, nota3, nota4, media;

		System.out.println("Nota 1: ");
		nota1 = ler.nextFloat();

		System.out.println("Nota 2: ");
		nota2 = ler.nextFloat();

		System.out.println("Nota 3: ");
		nota3 = ler.nextFloat();

		System.out.println("Nota 4: ");
		nota4 = ler.nextFloat();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		symbols.setDecimalSeparator('.');
		DecimalFormat df = new DecimalFormat("0.0", symbols);

		System.out.println("Média final: " + df.format(media));

		ler.close();

	}

}
