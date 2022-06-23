package DesafioTecnico1e2;

//2. (Vale 2 pontos) Aproveitando o seu código já escrito na questão 1, crie uma
//interface chamada Imposto que contenha o método alcularImposto() e
//        implemente ela em ContaCorrente e ContaPoupanca com a seguinte regra:
//        ⦁ Para ContaCorrente, o método calcularImposto() deve retornar o rendimento *
//        25%;
//        ⦁ Para ContaPoupanca, o método calcularImposto() deve retornar o rendimento
//        10%;

public interface Imposto {

    public double calcularImposto(double saldo);

}
