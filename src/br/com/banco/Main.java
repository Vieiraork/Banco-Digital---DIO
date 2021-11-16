package br.com.banco;


public class Main {
    public static void main(String[] args) {
        Cliente william = new Cliente();
        william.setNome("William");

        ContaCorrente cc = new ContaCorrente(william);
        ContaPoupanca cp = new ContaPoupanca(william);

        cc.depositar(100d);
        cc.transferir(150d, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}