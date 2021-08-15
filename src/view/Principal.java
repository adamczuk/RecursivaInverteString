package view;

import javax.swing.JOptionPane;

import controller.MetodosController;

public class Principal {

	public static void main(String[] args) {

		String entrada = JOptionPane.showInputDialog("Digite uma frase para obter ela invertida:");

		MetodosController metodos = new MetodosController();
		String saida = metodos.inverteString(entrada, entrada.length());

		JOptionPane.showMessageDialog(null,"Você digitou:\n\n"+entrada+"\n\n\nFrase invertida:\n\n"+saida);
	}

}