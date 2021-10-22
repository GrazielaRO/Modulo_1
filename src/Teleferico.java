import java.util.Scanner;

public class Teleferico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a capacidade do teleférico: ");
        int capacidade = sc.nextInt();

        System.out.print("\nAgora informe a quantidade de alunos a serem transportados: ");
        int qtdAlunos = sc.nextInt();

        if (qtdAlunos % (capacidade - 1) == 0) {

            System.out.println("\nSerão necessárias " + (qtdAlunos / (capacidade - 1)) + " viagens para transportar todos os alunos.");

        } else {

            System.out.println("\nSerá preciso " + (qtdAlunos / (capacidade - 1) + 1) + " viagem(s) para transportar os alunos.");

        }

        sc.close();
    }
}
