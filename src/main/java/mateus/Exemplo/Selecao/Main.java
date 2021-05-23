package mateus.Exemplo.Selecao;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;  

public class Main {

	public static void main(String[] args) {	
		boolean meuBoolean = false;
		int numero = 0;
		String nome = "Mateus";
		ArrayList<String> nomes = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		numero = sc.nextInt();
		
		if(nome == "Leonardo") {
			System.out.println("False: nome diferente de Mateus");
			System.out.println("O numero digitado foi " + numero);
			System.out.println(35.5);
		} else {
			System.out.println("True: nome igual a Mateus");
		}
		
		if(numero > 0) {
			
		} else if (numero < 0) {
			
		} else {
			
		}
		
		nome = sc.nextLine();
		meuBoolean = nome.isEmpty();
		
		if(meuBoolean) { // se a variavel "nome" estiver vazia
			
		} else { // se a variavel "nome" estiver com algo dentro
			
		}
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		nomes.add("Roberto");
		nomes.add("Romeu");
		nomes.add("Mateus");
		nomes.add("Leonardo");
		nomes.add("Noc");
		nomes.add("Julia");
		nomes.add("Jacque");
		nomes.add("Fumaça");
		nomes.add("Jurema");
		nomes.add("Davi");
		
		Collections.sort(nomes);
		
		for(String nomeNaLista : nomes) {
			System.out.println(nomeNaLista);
		}
		
		sc.close();
	}
}
