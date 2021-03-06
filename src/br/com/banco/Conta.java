package br.com.banco;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        if (saldo < valor){
            System.out.println("Saldo insuficiente.");
            saldo = saldo;
        } else{
            saldo -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente para realizar operação.");
        } else {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimiInformaçoes() {
        System.out.printf("Agência: %d, Número %d, Saldo %.2f \n",
                this.agencia, this.numero, this.saldo);
    }
}
