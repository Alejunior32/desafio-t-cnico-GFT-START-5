package DesafioTecnico1;

public class ContaCorrente extends Conta{

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    public double rendimento() {
        return (getSaldo()*0.03)+getSaldo();
    }
}
