package DesafioTecnico4;
import java.util.List;
public class Carrão extends Carro{



    public static void exibir(List<Carrão> carros){

        System.out.println(carros);

    }

    public static void tipoCombustivel(List<Carrão> carros){

        int quantGasolina=0;
        int quantDiesel=0;

        for (int i =0;i<5;i++){



            if( carros.get(i).getTipoCombustivel() == "Gasolina" || carros.get(i).getTipoCombustivel() == "gasolina"){
                quantGasolina++;
            }else if(carros.get(i).getTipoCombustivel() == "Diesel" || carros.get(i).getTipoCombustivel() == "diesel"){
                quantDiesel++;
            }
        }
        System.out.println(+quantGasolina+" carros sao movidos a gasolina");
        System.out.println(+quantDiesel+" carros são movidos a diesel");

    }




}
