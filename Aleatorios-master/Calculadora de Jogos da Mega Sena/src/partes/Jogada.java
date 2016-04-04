package partes;

import java.util.ArrayList;

public class Jogada {
	private ArrayList<Numero> conjuntoNumeros = new ArrayList<Numero>(6);

	public void inserirNumero(Numero n) {
		getConjuntoNumeros().add(n);
	}

	public void removerNumero(Numero n) {
		getConjuntoNumeros().remove(n);
	}

	public ArrayList<Numero> getConjuntoNumeros() {
		return conjuntoNumeros;
	}

	public void setConjuntoNumeros(ArrayList<Numero> conjuntoNumeros) {
		this.conjuntoNumeros = conjuntoNumeros;
	}

}
