import java.util.Scanner;

import parte1.Conta;
import parte1.ContaCorrente;
import parte1.ContaEspecial;

public class AppMendesMp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        GerenciaConta contas = new GerenciaConta();
        int opcao = 0;
        int numeroConta;
        double saldo;
        int numeroConta, depositar, valor;
        String entradaDigitada;
        Conta p;

        while (opcao != 6) {
            System.out.println("1-Novo ContaEspecial");
            System.out.println("2-Novo ContaCorrente");
            System.out.println("3-Procurar");
            System.out.println("4-Alterar saldo");
            System.out.println("5-Sacar");
            System.out.println("6-Sair");
            System.out.print("Sua opcao: ");
            entradaDigitada = teclado.nextLine();
            opcao = Integer.parseInt(entradaDigitada);

            switch (opcao) {
                case 1:
                    System.out.println("Digite o numero da conta:");
                    entradaDigitada = teclado.nextLine();
                    numeroConta = Integer.parseInt(entradaDigitada);
                    System.out.println("Digite o saldo:");
                    saldo = teclado.nextLine();
                    System.out.println("Digite o valor:");
                    valor = teclado.nextLine();
                    p = new ContaEspecial(numeroConta, saldo, valor);
                    contas.adicionar(p);
                    break;
                case 2:
                    System.out.println("Digite o numeroConta:");
                    entradaDigitada = teclado.nextLine();
                    numeroConta = Integer.parseInt(entradaDigitada);
                    System.out.println("Digite o saldo:");
                    saldo = teclado.nextLine();
                    System.out.println("Digite o valor:");
                    valor = teclado.nextLine();
                    System.out.println("Digite o saldo:");
                    entradaDigitada = teclado.nextLine();
                    saldo = Double.parseDouble(entradaDigitada);
                    p = new ContaCorrente(numeroConta, saldo, valor, depositar);
                    contas.adicionar(p);
                    break;
                case 3:
                    System.out.println("Digite o numeroConta para procurar:");
                    entradaDigitada = teclado.nextLine();
                    numeroConta = Integer.parseInt(entradaDigitada);
                    System.out.println(contas.exibir(numeroConta));
                    break;
                case 4:
                    System.out.println("Digite o numeroConta:");
                    entradaDigitada = teclado.nextLine();
                    numeroConta = Integer.parseInt(entradaDigitada);
                    System.out.println("Digite o novo valor:");
                    valor = teclado.nextLine();
                    boolean alterou = contas.alterarValor(numeroConta, saldo);
                    if (alterou) {
                        System.out.println("Valor alterado");
                    } else {
                        System.out.println("Não foi possivel alterar o saldo");
                    }
                    break;
                case 5:
                    System.out.println("Digite o numeroConta a ser removido:");
                    entradaDigitada = teclado.nextLine();
                    numeroConta = Integer.parseInt(entradaDigitada);
                    boolean removeu = contas.remover(numeroConta);
                    if(removeu) {
                        System.out.println("Removido com sucesso");
                    } else {
                        System.out.println("NÃ£o foi possivel remover");
                    }
                    break;
                case 6:
                    System.out.println("Fim do programa.");
                    break;
                default:
                    System.out.println("Opçao invalida");
                    break;
            }
        }

        teclado.close();
    }
}

}
