import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);

	double salarioBruto, prestacao, limite;
	System.out.println("dijite o valor do salário bruto");
	salarioBruto = teclado.nextDouble();
	System.out.println("dijite o valor da prestação");
	prestacao = teclado.nextDouble();
	limite = salarioBruto * 30.0;
	if(prestacao  <= limite) {
		System.out.println("emprestimo pode ser feito.");
			}
	else {
		System.out.println("emprestimo não pode ser feito.");
		
	}
	teclado.close();
}
}
