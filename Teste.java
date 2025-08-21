package entrada_dados_AULA04;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		
		
		
		Scanner entrada = new Scanner(System.in);
		Pessoa pessoa= new Pessoa();
		
		System.out.println("Diite o seu nome:");
		pessoa.nome = entrada.next();
		System.out.println("digite sua idade");
		pessoa.idade = entrada.nextInt();
		System.out.println("Diite sua altura:");
		pessoa.altura = entrada.nextFloat();
		System.out.println("digite seu peso:");
		pessoa.peso = entrada.nextFloat();
				
		pessoa.imprimir();
		
		entrada.close();
		
	}

}
