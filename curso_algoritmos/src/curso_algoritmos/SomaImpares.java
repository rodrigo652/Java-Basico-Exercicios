package curso_algoritmos;

import java.util.Scanner;

public class SomaImpares {
	
	public static void main(String[] args) {
		
		int n1, n2, soma=0, aux, i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		n1 = sc.nextInt();
		System.out.print("Digite outro numero: ");
		n2 = sc.nextInt();
		
		sc.close();
		
		if(n1 > n2) {
			aux = n1;
			n1 = n2;
			n2 = aux;
		}
		
		for(i=n1+1;i<n2-1;i++)
		{
			if(i % 2 != 0)
			{
				soma = soma + i;
			}
		}
		
		System.out.println("SOMA DOS IMPARES = "+ soma);

			
	}


}
