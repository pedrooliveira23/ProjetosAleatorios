package decriptador;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Decriptador {

	public static void main(String[] args) {
		int chave = Integer.parseInt(JOptionPane.showInputDialog("Chave: "));
		
		String texto = JOptionPane.showInputDialog("Mensagem: ");
		
		char[] decodificado = new char[texto.length()];
		
		String mensagem = "";
		
		for(int i = 0; i < texto.length(); i++){
			decodificado[i] = (char)(texto.charAt(i) - chave);
			mensagem += decodificado[i];
		}
		
		JTextArea text2 = new JTextArea(mensagem);
		JOptionPane.showMessageDialog(null,text2);

	}

}
