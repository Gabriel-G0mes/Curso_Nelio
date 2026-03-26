package entities;

public class Conta {
    private String nome;
    private double saldo;

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNome() { return this.nome; }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
        else {
            System.out.println("Depósito inválido");
        }
    }

    public void sacar(double valor) {
        if (valor <= this.saldo && valor > 0) {
            this.saldo -= valor;
        }
        else {
            System.out.println("Saque inválido");
        }
    }

    public String mensagemSaldo(){
        return String.format("%s seu saldo atual é de: %.2f", getNome(), getSaldo());
    }

}
