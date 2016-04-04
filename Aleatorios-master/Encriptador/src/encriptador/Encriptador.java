package encriptador;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Encriptador {

	public static void main(String[] args) {
		int chave = (int)(Math.random() * 256) % 256;
		JTextArea text = new JTextArea("Chave: " + chave);
		JOptionPane.showMessageDialog(null,text);
		
		String texto = JOptionPane.showInputDialog("Mensagem: ");
		
		char[] codificado = new char[texto.length()];
		
		String mensagem = "";
		
		for(int i = 0; i < texto.length(); i++){
			codificado[i] = (char)(texto.charAt(i) + chave);
			mensagem += codificado[i];
		}
		
		JTextArea text2 = new JTextArea(mensagem);
		JOptionPane.showMessageDialog(null,text2);
	}

}
