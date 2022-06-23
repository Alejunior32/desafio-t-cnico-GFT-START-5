package DesafioTecnico4;

//(Vale 3 pontos) Implemente um programa que deverá informar quantos
//        carros são movidos a gasolina e quantos carros são movidos a diesel de
//        5 carros informados pelo usuário. O usuário deverá informar o modelo
//        (exemplos: Uno, Sandero, Renegade, etc), marca (exemplos: Fiat,
//        Renault, Jeep) e tipo de combustível (exemplos: gasolina, diesel) do
//        carro.
//        IMPORTANTE É obrigatório criar/utilizar uma classe que herde a classe
//        Carro para representar um carro em seu programa. Você deverá
//        implementar nessa classe todas as características/métodos que não
//        estiverem presentes na classe base Carro. A classe também deverá
//        possuir um método que exiba todos os dados do carro.
//        Implementação da classe base Carro


public class Carro
{

    private String Modelo;
    private String Marca;
    private String tipoCombustivel;


    public Carro()
    {
        this.Modelo = "";
        this.Marca = "";
        this.tipoCombustivel="";
    }
    public Carro(String modelo, String marca, String tipoCombustivel)
    {
        this.Modelo = modelo;
        this.Marca = marca;
        this.tipoCombustivel= tipoCombustivel;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
