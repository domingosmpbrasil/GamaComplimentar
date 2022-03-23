package parte1;

public class ContaCorrente extends Conta {
	private double saldo;
	
	public ContaCorrente(int numeroConta, double saldo) {
		super(numeroConta, saldo);
		this.saldo = saldo;
		
	}
	
	@Override
	public String toString() {
		return super.toString() + " R$ " + saldo;
		
	}
}
