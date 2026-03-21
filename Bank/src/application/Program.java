package application;
import entities.Conta;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite seu saldo: ");
        double saldo = input.nextDouble();
        input.nextLine();
        Conta titularConta = new Conta(nome, saldo);
        System.out.println("----------------");
        System.out.println("Novo acesso");
        System.out.print("Digite seu nome: ");
        nome = input.nextLine();
        Conta conta = new Conta(nome);

        System.out.println(titularConta);
        System.out.println(conta);

        input.close();
    }
}
