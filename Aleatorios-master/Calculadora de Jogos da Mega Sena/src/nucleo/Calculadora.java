package nucleo;

import java.util.ArrayList;

import partes.Jogada;
import partes.Numero;

public class Calculadora {
	private ArrayList<Jogada> jogadas;
	private Jogada resultado = new Jogada();

	public Calculadora(int numeroJogadas) {
		jogadas = new ArrayList<Jogada>(numeroJogadas);
	}

	public void inserirJogada(Jogada j) {
		jogadas.add(j);
	}

	public void removerJogada(Jogada j) {
		jogadas.remove(j);
	}

	public Jogada calcular() {
		Jogada atual;
		Numero numeroAtual;
		int[][] repeticoesAlg1 = new int[jogadas.size()][2];
		int[][] repeticoesAlg2 = new int[jogadas.size()][2];

		for (int i = 0; i < jogadas.size(); i++) {

			for (int ist = 0; ist < jogadas.size(); ist++) {
				repeticoesAlg1[ist][1] = 0;
				repeticoesAlg2[ist][1] = 0;
			}

			atual = jogadas.get(i);

			for (int j = 0; j < atual.getConjuntoNumeros().size(); j++) {
				numeroAtual = atual.getConjuntoNumeros().get(j);

				for (int x = 0; x < jogadas.size(); x++) {
					if (repeticoesAlg1[x][0] == numeroAtual.getAlg1()) {
						repeticoesAlg1[x][1]++;
					}
				}

				for (int x = 0; x < jogadas.size(); x++) {
					if (repeticoesAlg2[x][0] == numeroAtual.getAlg2()) {
						repeticoesAlg2[x][1]++;
					}
				}

				int maiorAlg1 = repeticoesAlg1[0][0];
				Numero num = new Numero();

				for (int y = 0; y < jogadas.size(); y++) {
					for (int z = y + 1; z < jogadas.size(); z++) {
						if (repeticoesAlg1[z][1] > repeticoesAlg1[y][1]) {
							maiorAlg1 = repeticoesAlg1[z][0];
						}
					}
				}

				num.setAlg1(maiorAlg1);

				int maiorAlg2 = repeticoesAlg2[0][0];

				for (int y = 0; y < jogadas.size(); y++) {
					for (int z = y + 1; z < jogadas.size(); z++) {
						if (repeticoesAlg2[z][1] > repeticoesAlg2[y][1]) {
							maiorAlg2 = repeticoesAlg2[z][0];
						}
					}
				}

				num.setAlg2(maiorAlg2);

				resultado.inserirNumero(num);

			}

		}

		return resultado;
	}

}
