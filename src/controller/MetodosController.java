package controller;

public class MetodosController {

	public MetodosController() {
		super();	
	}
	
	public String inverteString(String entrada, int tamanho) {
		
//Condição de parada: retorna uma string vazia ao chegar no início da variável. 
//É uma forma de evitar erro de posição fora do alcance em caso de inserirmos uma String vazia
		if (tamanho == 0) {
			return "";
		}
		else {
//Aqui retornamos a String de trás para frente
//Para isso, usamos o conceito de pilha: empilhamos cada char na ordem correta, mas na hora de desempilhar, 
//a String acaba voltando invertida pois o primeiro char a ser desempilhado (retornado) é o último da String original
			
//entrada.substring(tamanho - 1, tamanho) - retorna apenas o último char da String que está sendo usada na função
			
//inverteString(entrada, --tamanho) - chama a função novamente, mas antes diminui em 1 o tamanho da String "visível"
//Dessa forma, ignoramos o char que já foi empilhado pelo comando anterior
			return entrada.substring(tamanho - 1, tamanho) + inverteString(entrada, --tamanho);
			
		}
	}

}