package DesafioTecnico1;

public class ContaPoupanca extends Conta{

    public ContaPoupanca() {
    }

    public ContaPoupanca(String numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    public double rendimento() {
        return (getSaldo()*0.05)+getSaldo();
    }
}
