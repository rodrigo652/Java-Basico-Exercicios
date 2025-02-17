package curso_algoritmos;

import java.util.Scanner;
import java.util.Locale;

public class Alturas {

	public static void main(String[] args) {
	
		int n;
		double media, soma=0, alt=0;
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas: ");
		n = sc.nextInt();
		
		int[] idade = new int[n];
		double[] altura = new double[n];
		String[] nome = new String[n];

		
		for(int i=0;i<n;i++) {
			System.out.println("Dados da "+i+1+"ª pessoa ");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		for(int i=0;i<n;i++) {
			alt = alt + altura[i];
			
			if(idade[i] < 16) {
				soma++;
			}
		}
		
		media = (double)alt/n;
		soma = (soma*100)/n;
		
		System.out.println("Altura media: " + String.format("%.2f", media));
		System.out.println("Pessoas com menos de 16 anos: " + soma + "%");
		
		for(int i=0;i<n;i++) {
			if(idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}

}
