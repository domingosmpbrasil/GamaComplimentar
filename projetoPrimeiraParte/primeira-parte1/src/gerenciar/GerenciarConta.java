package gerenciar;

import java.util.ArrayList;

import parte1.Conta;

public class GerenciarConta {
	private ArrayList<Conta> Contas;

	public GerenciarConta() {
		Contas = new ArrayList<>();
	}

	public void adicionar(Conta p) {
		Contas.add(p);
	}

	public String exibir(int numeroConta) {
		for (int i = 0; i < Contas.size(); i++) {
			if (Contas.get(i).getNumeroConta() == numeroConta) {
				return Contas.get(i).toString();
			}
		}
		return "N?o encontrado";
	}

	public boolean depositar(int numeroConta, double valor) {
		for (int i = 0; i < Contas.size(); i++) {
			if (Contas.get(i).getNumeroConta() == numeroConta) {
				Contas.get(i).depositar(valor);
				return true;
			}
		}
		return false;
	}


	private int posicao(int numeroConta) {
		for (int i = 0; i < Contas.size(); i++) {
			if (Contas.get(i).getNumeroConta() == numeroConta) {
				return i;
			}
		}
		return -1; // retorna -1 se nao achou
	}

	public boolean remover(int numeroConta) {
		int posicao = posicao(numeroConta);
		if (posicao >= 0) { // se achou
			if (Contas.remove(posicao) != null) {
				return true;
			}
		}
		return false;
	}
}
