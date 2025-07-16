package carros;

import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Punto: Digite quanto deseja abastecer: ");

        Carro punto = new Carro();
        punto.cavalos = 100;
        punto.cor = "Preta";
        punto.montadora = "Fiat";
        punto.transmissao = "Manual";
        punto.capacidadeTanque = 50;
        punto.combustivel = 0;
        punto.kmPorLitros = 10;
        punto.quantGasolina = scanner.nextFloat();

        System.out.println("Civic: Digite quanto deseja abastecer: ");

        Carro civic = new Carro();
        civic.cavalos = 150;
        civic.cor = "Prata";
        civic.montadora = "Honda";
        civic.transmissao = "Automatica";
        civic.capacidadeTanque = 48;
        civic.combustivel = 10;
        civic.kmPorLitros = 8;
        civic.quantGasolina = scanner.nextFloat();

        System.out.println("Punto: " + punto.combustivel);
        System.out.println("Civic: " + civic.combustivel);

        punto.abastecer(20);
        civic.abastecer(30);

        System.out.println("Punto (deois do abastecimento): " + punto.combustivel);
        System.out.println("Civic: (deois do abastecimento) " + civic.combustivel);

        System.out.println("Autonomia do punto: " + punto.autonomiaCombustivel());
        System.out.println("Autonomia do civic: " + civic.autonomiaCombustivel());

        System.out.println("Punto: Você abasteceu apenas: " + punto.quant() + " e soubrou :" + punto.sobrou());
        System.out.println("Civic: Você abasteceu apenas: " + civic.quant() + "e soubrou :" + civic.sobrou());



    }
}
