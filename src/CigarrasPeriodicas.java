import java.util.Scanner;

public class CigarrasPeriodicas {

    public static int mdc(int a, int b) {

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }

    public static int calculaMmc(int[] listaNumeros, int novoCiclo) {

        listaNumeros[listaNumeros.length - 1] = novoCiclo;

        int mmcResultado = listaNumeros[0];

        for (int i = 1; i < listaNumeros.length; i++) {

            mmcResultado = mmcResultado * (listaNumeros[i] / mdc(mmcResultado, listaNumeros[i]));

        }

        return mmcResultado;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de espécies de cigarra: ");
        int qtdPopulacoes = sc.nextInt();

        System.out.print("\nInforme a quantidade máxima de iterações: ");
        int limiteIteracoes = sc.nextInt();

        int[] cicloCigarras = new int[qtdPopulacoes + 1];
        int mmc = 0;
        int novoCiclo = 0;
        int maiorMMC = 0;

        for (int i = 0; i < qtdPopulacoes; i++) {

            System.out.print("\nQual o cliclo de vida da " + (i + 1) + "a espécie? ");
            int cicloVida = sc.nextInt();
            cicloCigarras[i] = cicloVida;

        }

        for (int i = limiteIteracoes; i >= 1; i--) {

            mmc = calculaMmc(cicloCigarras, i);

            if (mmc < limiteIteracoes) {

                if (mmc >= maiorMMC) {
                    maiorMMC = mmc;
                    novoCiclo = i;

                }

            }

        }

        System.out.println("\nO ciclo da nova população de cigarras é de " + novoCiclo);

        sc.close();

    }

}
