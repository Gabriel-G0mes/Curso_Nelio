package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class Program {
    public void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Escreva seu nome para começar-mos as operações: ");
        String nome = input.nextLine();
        System.out.print("Qual valor inicial do depósito ?");
        double saldo = input.nextDouble();
        Conta conta = new Conta(nome, saldo);

        System.out.printf("Seu saldo atual é: %.2f" ,conta.getSaldo());

        input.close();
    }
}
