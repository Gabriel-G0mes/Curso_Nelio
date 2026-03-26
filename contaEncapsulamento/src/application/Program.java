package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Escreva seu nome para começarmos as operações: ");
        String nome = input.nextLine();
        System.out.print("Qual valor inicial do depósito ? ");
        double saldo = input.nextDouble();
        Conta conta = new Conta(nome, saldo);

        System.out.printf("Seu saldo atual é: %.2f%n" ,conta.getSaldo());
        System.out.println("-------------------------------------------");

        System.out.println("Quanto você gostaria de depositar agora? ");
        double deposito = input.nextDouble();
        input.nextLine();
        conta.depositar(deposito);
        System.out.println(conta.mensagemSaldo());
        System.out.println("-------------------------------------------");

        System.out.println("Quanto você gostaria de sacar agora ? ");
        double saque = input.nextDouble();
        input.nextLine();
        conta.sacar(saque);
        System.out.println(conta.mensagemSaldo());

        input.close();
    }
}
