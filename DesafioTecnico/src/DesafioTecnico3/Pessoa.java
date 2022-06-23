package DesafioTecnico3;

//3. (Vale 2 pontos) Crie uma Classe Pessoa, contendo os atributos (nome,
//        endereço e telefone) encapsulados, com seus respectivos seletores
//        (getters) e modificadores (setters), e ainda o construtor padrão.
//        Por fim, criar uma classe principal que instancie o objeto Pessoa, adicione
//        no mínimo um valor para cada atributo e imprima na tela.

public class Pessoa {

    private String nome;
    private String endereço;
    private String telefone;

    public Pessoa(String nome, String endereço, String telefone) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", endereço='" + endereço + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
