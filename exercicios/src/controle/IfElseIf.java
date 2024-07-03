package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a 1° nota (0-10): ");
		double n1 = scan.nextDouble();

		System.out.println("Digite a 2° nota (0-10): ");
		double n2 = scan.nextDouble();

		double media = (n1 + n2) / 2;

		if (media > 10 && media < 0) {
			System.out.println("Média inválida.");
		} else if (media >= 9 && media <= 10) {
			System.out.println("Nota conceito A.");
		} else if (media >= 8 && media <= 9) {
			System.out.println("Nota conceito B.");
		} else if (media >= 7 && media <= 8) {
			System.out.println("Nota conceito C.");
		} else if (media >= 6 && media <= 7) {
			System.out.println("Nota conceito D.");
		} else {
			System.out.println("Nota conceito E.");
		}

		scan.close();

	}

}
