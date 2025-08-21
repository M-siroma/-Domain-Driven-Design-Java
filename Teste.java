package aula02;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa matheus = new Pessoa();
		matheus.nome = "Matheus";
		matheus.altura = 1.80f;
		matheus.comer();
		matheus.andar();
		matheus.espirrar();
		
		Pessoa luiz = new Pessoa();
		luiz.nome = "Luiz";
		luiz.altura = 1.70f;
		luiz.comer();
		luiz.andar();
		luiz.espirrar();
	}

}
