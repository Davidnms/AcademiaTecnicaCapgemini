package questoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class questao1 {
	
	public static void main(String []args) {
		
		Scanner escrever = new Scanner(System.in);
		List<String> escada = new ArrayList<>();

		System.out.print("Digite a quantidade de vezes: ");
		int qtdDegraus = escrever.nextInt();
		escrever.close();
		
		for (int i = 0; i < qtdDegraus; i++) {
			escada.add(" ".repeat(qtdDegraus - (i + 1)) + "*".repeat(i + 1));
		}

		for (String e : escada ) {
			System.out.println(e);
		}
		
	}
}

