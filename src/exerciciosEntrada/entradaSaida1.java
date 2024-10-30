package exerciciosEntrada;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class entradaSaida1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);
		
		float salario, abono, novoSalario;
		
		System.out.println("Digite o salário: ");	
		salario = ler.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = ler.nextFloat();
		
		novoSalario = salario + abono;
		
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        symbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("0.00", symbols);
		
		System.out.println("Novo salário: "+ df.format(novoSalario));
		
		ler.close();
	}

}
