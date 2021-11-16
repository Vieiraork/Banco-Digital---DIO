package br.com.banco;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- \t Extrato Conta Corrente \t ---");
        super.imprimiInformaçoes();
    }
}
