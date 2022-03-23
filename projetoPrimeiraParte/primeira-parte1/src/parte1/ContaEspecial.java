package parte1;

public class ContaEspecial extends Conta {
    private String titular;

    public ContaEspecial(int numeroConta, double saldo, String titular) {
        super(numeroConta, saldo);
        this.titular = titular;
    }

    @Override
    public String toString() {
        return super.toString() + " : " + titular;
    }

}

