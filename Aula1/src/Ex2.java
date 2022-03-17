import java.util.Scanner;

public class Ex2 {
public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);
double nota1, nota2, media;

System.out.println("digite a primeira nota");
nota1 = entrada.nextDouble();

System.out.println("dijite a cegunda nota");
nota2 = entrada.nextDouble();
media = (nota1 + nota2 ) / 2;
System.out.println("média ="+ media);

entrada.close();



}
}
