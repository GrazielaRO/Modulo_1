import java.util.Scanner;

public class NotaEsquecida {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a nota da prova? ");
        int notaProva1 = sc.nextInt();

        System.out.print("\nQual o valor da média? ");
        int media = sc.nextInt();

        int notaProva2 = (media * 2) - notaProva1;

        System.out.println("\nA nota da outra prova é: " + notaProva2);

        sc.close();

    }

}
