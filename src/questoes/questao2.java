package questoes;

import java.util.Scanner;

public class questao2 {
	
	public static void main(String []args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua senha:");
		String senha = entrada.nextLine();
		entrada.close();
		
		if(senha.length() < 6) {
			int qtdSenha = 6 - senha.length();
			System.out.println("Falta "+qtdSenha+" caractere(s) para sua senha estar correta.");
		}
	}
}
