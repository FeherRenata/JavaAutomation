package VariabilaMetoda;

import org.testng.annotations.Test;

public class Masina {

    public String marcaMasinii;
    public Integer putereaMasinii;
    public Integer anulFabricarii;
    public String culoarea;
    //Obtiounile pentru dotarea masinii: Luxury = L, Full = F; Basic = B;
    public Character dotarea;
    public String tipCombustibil;


    @Test
    public void descriereaMasinii() {
        marcaMasinii = "BMW";
        putereaMasinii = 190;
        anulFabricarii = 2020;
        culoarea = "roz bombon";
        //Obtiounile pentru dotarea masinii: Luxury = L, Full = F; Basic = B;
        dotarea = 'L';
        tipCombustibil = "benzina";


        System.out.println("Marca masinii este: " + marcaMasinii);
        System.out.println("Puterea masinii este (in cai): " + putereaMasinii);
        System.out.println("Anul farbricarii a masinii este: " + anulFabricarii);
        System.out.println("Culoarea masinii este: " + culoarea);
        System.out.println("Dotarea masinii este: " + dotarea);
        System.out.println("Tipul de combustibil a masinii este: " + tipCombustibil);

        vitezaMedie();
    }

    public void vitezaMedie(){
        System.out.println("Sa se calculeze viteza medie a unei masini stiind ca aceasta parcurge distanta de 30 km în 30 min. ");
        //Distanta este exprimat in km
        int distanta = 30;
        //Timpul este exprimat in minute
        int timp = 30;
        //Timpul calculat este exprimat in ora(h)
        double timpCalculat = (double) timp /60;
        double vitezamMedie = distanta/timpCalculat;
        System.out.println("Raspunsul este: " + vitezamMedie+"km/h");
    }
}