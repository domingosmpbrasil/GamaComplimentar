import java.util.Scanner;

import gerenciar.GerenciarConta;
import parte1.Conta;
import parte1.ContaCorrente;
import parte1.ContaEspecial;

public class AppMendesMp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        GerenciarConta contas = new GerenciarConta();
        int opcao = 0;
        int numeroConta;
        double saldo, valor;
        int NumeroConta, depositar;
        String entradaDigitada;
        Conta p;

        while (opcao != 6) {
            System.out.println("1-Novo ContaEspecial");
            System.out.println("2-Novo ContaCorrente");
            System.out.println("3-Procurar");
            System.out.println("4-Depositar");
            System.out.println("5-Sacar");
            System.out.println("6-Sair");
            System.out.print("Sua opcao: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o numero da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Digite o saldo:");
                    saldo = teclado.nextDouble();
                    System.out.println("Digite o valor:");
                    valor = teclado.nextDouble();
                    p = new ContaEspecial(numeroConta, saldo, valor);
                    contas.adicionar(p);
                    break;
                case 2:
                    System.out.println("Digite o numeroConta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Digite o saldo:");
                    saldo = teclado.nextDouble();
                    p = new ContaCorrente(numeroConta, saldo);
                    contas.adicionar(p);
                    break;
                case 3:
                    System.out.println("Digite o numeroConta para procurar:");
                     numeroConta = teclado.nextInt();
                    System.out.println(contas.exibir(numeroConta));
                    break;
                case 4:
                    System.out.println("Digite o numeroConta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Digite o novo valor:");
                    valor = teclado.nextDouble();
                    boolean alterou = contas.depositar(numeroConta, valor);
                    if (alterou) {
                        System.out.println("Valor alterado");
                    } else {
                        System.out.println("não foi possivel alterar o saldo");
                    }
                    break;
                case 5:
                    System.out.println("Digite o numeroConta a ser removido:");
                    numeroConta = teclado.nextInt();
                    boolean removeu = contas.remover(numeroConta);
                    if(removeu) {
                        System.out.println("Removido com sucesso");
                    } else {
                        System.out.println("não foi possivel remover");
                    }
                    break;
                case 6:
                    System.out.println("Fim do programa.");
                    break;
                default:
                    System.out.println("Opï¿½ao invalida");
                    break;
            }
        }

        teclado.close();
    }
}


	