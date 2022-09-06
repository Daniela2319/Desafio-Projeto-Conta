package ProjetoConta;

import java.util.Scanner;

public class TerminalConta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome, agencia;
        int numeroConta;
        double saldo;

        System.out.println("---Dados Bancario---");

        System.out.println("Por Gentileza digite seu Nome Completo: ");
        nome = scan.nextLine();

        System.out.println("Digite a Agencia: ");
        agencia = scan.nextLine();

        System.out.println("Digite sua Conta: ");
        numeroConta = scan.nextInt();

        System.out.println("Por Gentileza digite um valor na sua nova conta: ");
        saldo = scan.nextDouble();

        System.out.println("---------------------------------------------------------");
        System.out.println("Ola! " + nome + " Obrigado cria uma conta em nosso banco!");
        System.out.println(" Agencia: " + agencia);
        System.out.println(" Conta: "   + numeroConta);
        System.out.println(" Saldo: "   + saldo + " disponivel para saque!");



        System.out.println("-----------------------------------------------------------");
        System.out.println("Tenha um Otimo Dia!");
    }
}
