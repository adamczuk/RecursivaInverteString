package controller;

public class MetodosController {

	public MetodosController() {
		super();	
	}
	
	public String inverteString(String entrada, int tamanho) {
		
//Condi��o de parada: retorna uma string vazia ao chegar no in�cio da vari�vel. 
//� uma forma de evitar erro de posi��o fora do alcance em caso de inserirmos uma String vazia
		if (tamanho == 0) {
			return "";
		}
		else {
//Aqui retornamos a String de tr�s para frente
//Para isso, usamos o conceito de pilha: empilhamos cada char na ordem correta, mas na hora de desempilhar, 
//a String acaba voltando invertida pois o primeiro char a ser desempilhado (retornado) � o �ltimo da String original
			
//entrada.substring(tamanho - 1, tamanho) - retorna apenas o �ltimo char da String que est� sendo usada na fun��o
			
//inverteString(entrada, --tamanho) - chama a fun��o novamente, mas antes diminui em 1 o tamanho da String "vis�vel"
//Dessa forma, ignoramos o char que j� foi empilhado pelo comando anterior
			return entrada.substring(tamanho - 1, tamanho) + inverteString(entrada, --tamanho);
			
		}
	}

}