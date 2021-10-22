import java.util.Scanner;

public class Fatorial {

    public static double calculaFatorial(int numero) {

        double fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número aleatório não negativo: ");
        int numInformado = sc.nextInt();

        int contador = 0;
        double soma = 0;

        for (int i = numInformado; i >= 1; i--) {

            double resultadoFat = calculaFatorial(i);

            if (resultadoFat <= numInformado) {

                while (soma < numInformado) {

                    soma += resultadoFat;
                    contador++;
                    break;

                }

            }

        }

        System.out.println("\nA menor quantidade de números fatoriais cuja soma é igual ao valor de " + numInformado
                + " é: " + contador);

        sc.close();

    }

}
