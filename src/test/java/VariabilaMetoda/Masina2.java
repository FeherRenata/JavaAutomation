package VariabilaMetoda;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Masina2 {

    public String marca;
    public String model;
    public Integer anFabricatie;


    @Test
    public void metodaTest() {
        dateMasina("Audi", "A6", 2024);
        dateMasina("BMW", "X5", 2021);

        calculMedie(5.6, 8.9);
        calculMedie(6.99, 9.78);


        citireNote();
    }


    public void dateMasina(String param1, String param2, Integer param3) {

        marca = param1;
        model = param2;
        anFabricatie = param3;

        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Anul de fabricatie este: " + anFabricatie);
    }

    // calcula media la doua numere

    public void calculMedie(Double nota1, Double nota2) {

        Double media;
        Double rezultat = (nota1 + nota2) / 2;
        System.out.println("Media este: " + rezultat);
    }

    public void citireNote() {
        System.out.println("Introduceti o nota: ");
        Scanner scenner = new Scanner(System.in);
        int nota = scenner.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Nota " + nota + " trebuie sa fie intre 1 si 10. Te rog introdu o valoare valida");
            nota = scenner.nextInt();
        }
        System.out.println("Nota " + nota + " este intre 1 si 10");

    }

}
