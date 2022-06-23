package DesafioTecnico1e2;

//1. (Vale 3 Pontos) Considerando os conceitos de Orientação a Objetos, crie
//        uma classe abstrata Pai de nome Conta com os seguintes atributos
//        (número, titular e saldo) e mais duas classes Filhas (ContaCorrente e
//        ContaPoupanca). Na classe Conta deve existir um método de nome
//        rendimento que retorna o rendimento mensal da conta, nas classes filhas
//        deve existir o mesmo método rendimento, porém com as seguintes regras:
//        ⦁ Para ContaCorrente, o método rendimento deve retornar o saldo * 0.03;
//        ⦁ Para ContaPoupanca, o método rendimento deve retornar o saldo * 0.05;
//        Por fim, criar uma classe principal que instancie objetos de ContaCorrente e
//        ContaPoupanca, adicione no mínimo um valor para cada atributo e imprima cada
//        conta (ContaCorrente e ContaPoupanca) com seus devidos rendimentos.
//        Obs: Encapsular atributos das classes.


//2. (Vale 2 pontos) Aproveitando o seu código já escrito na questão 1, crie uma
//interface chamada Imposto que contenha o método alcularImposto() e
//        implemente ela em ContaCorrente e ContaPoupanca com a seguinte regra:
//        ⦁ Para ContaCorrente, o método calcularImposto() deve retornar o rendimento *
//        25%;
//        ⦁ Para ContaPoupanca, o método calcularImposto() deve retornar o rendimento
//        10%;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        DecimalFormat format =new DecimalFormat("#.##");

        ContaPoupanca poupanca1 = new ContaPoupanca("45655458512","Alexandre",700.89);
        ContaPoupanca poupanca2 = new ContaPoupanca();
        poupanca2.setNumero("65465165415");
        poupanca2.setTitular("Alexandre");
        poupanca2.setSaldo(2000);

        ContaCorrente corrente1 = new ContaCorrente("5465654164","Alexandre",10785.98);
        ContaCorrente corrente2 = new ContaCorrente();
        corrente2.setNumero("65468464");
        corrente2.setTitular("Alexandre");
        corrente2.setSaldo(5076.32);

        System.out.println("O rendimento da conta corrente foi: R$ "+format.format(corrente1.rendimento()));
        System.out.println("Imposto sobreo rendimento:"+format.format(corrente1.calcularImposto(corrente1.getSaldo())));
        System.out.println();
        System.out.println("O rendimento da conta corrente foi: R$ "+format.format(corrente2.rendimento()));
        System.out.println("Imposto sobreo rendimento:"+format.format(corrente2.calcularImposto(corrente2.getSaldo())));
        System.out.println();
        System.out.println("O rendimento da conta poupança foi: R$ "+format.format(poupanca1.rendimento()));
        System.out.println("Imposto sobreo rendimento:"+format.format(poupanca1.calcularImposto(poupanca1.getSaldo())));
        System.out.println();
        System.out.println("O rendimento da conta poupança foi: R$ "+format.format(poupanca2.rendimento()));
        System.out.println("Imposto sobreo rendimento:"+format.format(poupanca2.calcularImposto(poupanca2.getSaldo())));

    }
}
