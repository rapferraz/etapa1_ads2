import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double idr = 0, entrada, ae;

    System.out.println("Digite seus rendimentos mensais: ");
    entrada = sc.nextDouble(); // capta a entrada do usuário

    if (entrada <= 1903.98) {
      idr = 0;
      System.out.println("Isento");
    } // se o valor for menor ou igual a 1903.98, o imposto devido é 0

    else if (entrada <= 2826.65) {
      idr = (entrada - 1903.98) * 0.075;
      System.out.printf("Imposto devido: R$%.2f", idr);
    } // se o valor for menor ou igual a 2826.65, o imposto devido é 7.5%

    else if (entrada <= 3751.05) {
      idr = (2826.65 - 1903.98) * 0.075;
      idr += (entrada - 2826.65) * 0.15;
      System.out.printf("Imposto devido: R$%.2f", idr);
    } // se o valor for menor ou igual a 3751.05, o imposto devido é 15%

    else if (entrada <= 4664.68) {
      idr = (2826.65 - 1903.98) * 0.075;
      idr += (3751.05 - 2826.65) * 0.15;
      idr += (entrada - 3751.05) * 0.225;
      System.out.printf("Imposto devido: R$%.2f", idr);
    } // se o valor for menor ou igual a 4664.68, o imposto devido é 22.5%  

    else {
      idr = (2826.65 - 1903.98) * 0.075;
      idr += (3751.05 - 2826.65) * 0.15;
      idr += (4664.68 - 3751.05) * 0.225;
      idr += (entrada - 4664.68) * 0.275;
      System.out.printf("Imposto devido: R$ %.2f", idr);
    } // se o valor for maior que 4664.68, o imposto devido é 27.5%

    if (entrada > 0) {
      ae = idr / entrada * 100;
      System.out.printf("\nAlíquota Efetiva: %.2f%%", ae);
    } // se o valor for maior que 0, calcula a alíquota efetiva
  }
}
