package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {

		//print na mesma linha
		System.out.print("Good");
		System.out.print(" day!\n");
		
		//em linhas diferentes
		System.out.println("Good");
		System.out.println("afternoon!");
		
		//formatado
		System.out.printf("Megasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
		System.out.printf("\nSalário: %.1f", 1423.658);
		System.out.printf("\nNome: %s", "Juan\n");
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = scan.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = scan.nextInt();
		
		System.out.printf("O seu nome é %s e você tem %d anos.", nome, idade);
		
		
		scan.close();

	}

}
