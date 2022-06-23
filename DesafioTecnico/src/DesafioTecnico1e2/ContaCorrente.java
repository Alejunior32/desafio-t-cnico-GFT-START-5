package DesafioTecnico1e2;

public class ContaCorrente extends Conta implements Imposto {

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    public double rendimento() {
        return (getSaldo()*0.03)+getSaldo();
    }


    public double calcularImposto(double saldo) {
        return rendimento()*0.25;
    }
}
