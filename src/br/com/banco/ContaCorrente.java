package br.com.banco;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("--- \t Extrato Conta Corrente \t ---");
        super.imprimiInformaçoes();
    }
}
