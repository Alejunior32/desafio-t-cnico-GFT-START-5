package DesafioTecnico1e2;

public class ContaPoupanca extends Conta implements Imposto{

    public ContaPoupanca() {
    }

    public ContaPoupanca(String numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    public double rendimento() {
        return (getSaldo()*0.05)+getSaldo();
    }

    @Override
    public double calcularImposto(double saldo) {
        return rendimento()*0.10;
    }
}
