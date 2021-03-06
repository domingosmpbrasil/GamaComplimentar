package parte1;

public abstract class Conta {

	private int numeroConta;
	private double saldo;

	public Conta() {
	}

	public Conta(int numeroConta, double saldo) {

		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public Conta(int numeroConta) {
		super();
		this.numeroConta = numeroConta;
	}

	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return this.numeroConta;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void emiteExtrato(double saldo) {

		this.saldo = saldo;

	}

	public double depositar(double valor) {
		return saldo += valor;
	}

	public boolean sacar(double valor) {

		if ((saldo - valor) >= 0) {
			saldo -= valor;
			return true;

		} else {
			return false;

		}
	}

	/*
	 * public Conta(double saldo2) { super(); Conta.total++; this.numeroConta =
	 * numeroConta; this.saldo = saldo; }
	 * 
	 * 
	 * public int getNumeroConta() { return this.numeroConta; }
	 * 
	 * 
	 * public double getSaldo() { return this.saldo; }
	 * 
	 * 
	 * public void deposita (double valor) { this.saldo += valor; }
	 * 
	 * 
	 * public boolean getSacar(double valor) { if (this.saldo >= valor) { this.saldo
	 * -= valor; return true; } else { return false; } }
	 * 
	 * @Override public String toString() { return "Conta: " +numeroConta
	 * +", saldo em conta: R$ " +String.format("%.2f", saldo); }
	 */

}
