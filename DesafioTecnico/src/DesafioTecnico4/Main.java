package DesafioTecnico4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

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

    public static void main(String[] args) {

        Carrão carro1 = new Carrão();
        Carrão carro2 = new Carrão();
        Carrão carro3 = new Carrão();
        Carrão carro4 = new Carrão();
        Carrão carro5 = new Carrão();
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Informe o modelo, marca e tipo de combustivel para os 5 carros");

        System.out.println("Carro 1");
        carro1.setModelo(teclado.nextLine());
        carro1.setMarca(teclado.nextLine());
        carro1.setTipoCombustivel(teclado.nextLine());

        System.out.println("Carro 2");
        carro2.setModelo(teclado.nextLine());
        carro2.setMarca(teclado.nextLine());
        carro2.setTipoCombustivel(teclado.nextLine());

        System.out.println("Carro 3");
        carro3.setModelo(teclado.nextLine());
        carro3.setMarca(teclado.nextLine());
        carro3.setTipoCombustivel(teclado.nextLine());

        System.out.println("Carro 4");
        carro4.setModelo(teclado.nextLine());
        carro4.setMarca(teclado.nextLine());
        carro4.setTipoCombustivel(teclado.nextLine());

        System.out.println("Carro 5");
        carro5.setModelo(teclado.nextLine());
        carro5.setMarca(teclado.nextLine());
        carro5.setTipoCombustivel(teclado.nextLine());

        List<Carrão> carros = new ArrayList<>();
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(carro4);
        carros.add(carro5);

        Carrão.exibir(carros);
        Carrão.tipoCombustivel(carros);



    }
}
