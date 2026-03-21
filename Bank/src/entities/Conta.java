package entities;

public class Conta {
    public String nome;
    public double saldo;
    public boolean temSaldo;

    public Conta(String name, double saldo) {
        this.nome = name;
        this.saldo = saldo;
        this.temSaldo = true;
    }

    public Conta(String name) {
        this.nome = name;
        this.temSaldo = false;
    }

    public String toString() {
        if (temSaldo) {
            return "Nome: " + nome
                    + String.format("%nSaldo: %.2f", saldo);
        }
        else {
            return "Nome: " + nome;
        }
    }
}