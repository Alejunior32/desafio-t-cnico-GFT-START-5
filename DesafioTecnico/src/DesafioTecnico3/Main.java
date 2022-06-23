package DesafioTecnico3;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Alexandre Freire","R.Ashdjai n°43 ","(11)95874-2154" );

        System.out.println(pessoa1);
        System.out.println();

        Pessoa pessoa2 = new Pessoa();

        pessoa2.setNome("Alexandre");
        pessoa2.setEndereço("R.shgdua n°312");
        pessoa2.setTelefone("(11)97427-3819");
        System.out.println("Nome: "+pessoa2.getNome());
        System.out.println("Endereço: "+pessoa2.getEndereço());
        System.out.println("Telefone: "+pessoa2.getTelefone());

    }

}
