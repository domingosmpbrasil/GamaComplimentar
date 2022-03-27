package parte1;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numeroConta, double saldo, double limite) {
        super(numeroConta, saldo);
        this.limite = limite;
    }

    @Override
    public String toString() {
        return super.toString() + " : " + limite;
    }

}

