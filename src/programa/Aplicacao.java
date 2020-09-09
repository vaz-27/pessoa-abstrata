package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoa;
import entidades.Pfisica;
import entidades.Pjuridica;

public class Aplicacao {


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> lista = new ArrayList<>();
		
		System.out.print("Entre com o número de Pagantes: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Taxa de Pagante #" + i + ":");
			System.out.print("Física ou Jurídica (f/j): ");
			char c = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Renda Anual: ");
			Double rendaAnual = sc.nextDouble();

			if (c == 'f') {
				System.out.print("Gasto com Saúde: ");
				Double gastoSaude = sc.nextDouble();
				lista.add(new Pfisica(nome, rendaAnual, gastoSaude));
			}
			else {
				System.out.print("Número de funcioários: ");
				Integer nFuncionarios = sc.nextInt();
				lista.add(new Pjuridica(nome, rendaAnual, nFuncionarios));
			}	
		}
		
		System.out.println();
		System.out.println("Taxas de Pagadores:");
		
		Double sum=0.0;
		for(Pessoa i : lista) {
			Double taxa = i.imposto();
			System.out.println(i.getNome() 
					+ ": $ " 
					+ String.format("%.2f",taxa));
			sum += taxa;
		}
		
		System.out.println();
		System.out.printf("Taxa Total: %.2f", sum);
		sc.close();

	}

}
