package br.com.banco;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- \t Extrato Conta Poupanca \t ---");
        super.imprimiInformaçoes();
    }
}
