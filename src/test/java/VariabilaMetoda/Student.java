package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    // Class = sablon care defineste proprietatile si comportamentul unei etitati specifice
    // Intr-un fisier de Java pute avea mai multe clase diferentiate pe baza numeleui(nu este un practice bun sa ave, mai multe clase cu acelasi nume)
    // Intr-o clasa putem defini proprietatile si actiunile entitatii
    // Variabila =  proprietatea unei clase
    // Variailele pot sa fie de doua felirui: globale si locale
    // Variabilele globale = sunt vizibile peste tot in proiect
    // Variabile locale = sunt vizibile doare locul unde a fost declarat
    // Ca sa definim o variabila globala: accesscontrol (public), tip variabila, nume variabila
    // In momentul cand definim o variabila nu este obligatoriu sa ii dam o valoare

    // Metoda = actiunea unei clase
    // Doua tipuri de metode: void si return
    //

    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String Adresa;
    public Double Inaltime;
    public Float Greutate;
    public Character Sex;
    public Boolean AreDiploma;

    @Test
    public void prezentareStudent()
    {
      Nume = "Feher";
      Prenume = "Renata";
      Varsta = 32;
      Adresa = "Andrei Muresan";
      Inaltime = 1.62;
      Greutate = 50.00f;
      Sex = 'F';
      AreDiploma = true;


 //System.out.print(Nume + '\n');
 //System.out.print(Prenume + '\n');
 //System.out.print(Varsta + '\n');
 //System.out.println(Nume+" "+ Prenume +" "+ Varsta +" "+ Adresa);
 //System.out.println(Inaltime);
        System.out.println("Numele studentului este: " + Nume);
        System.out.println("Prenumele studentului este: " + Prenume);
        System.out.println("Varsta studentului este: " +  Varsta);
        System.out.println("Adresa studentului este: " +  Adresa);
        System.out.println("Inaltimea studentului este: " +  Inaltime);
        System.out.println("Greutatea studentului este: " +  Greutate);
        System.out.println("Sexul studentului este: " +  Sex);
        System.out.println("Are studentul diploma?: " + AreDiploma);

        calculMedie();
    }


    public void calculMedie(){
        Integer nota1 = 8;
        Integer nota2 = 10;
        Integer nota3 = 9;
        Integer medie = (nota1+nota2+nota3)/3;
        System.out.println("Media studentului este: " + medie);

    }

    //metode cu return
    public Double getSalariu(){

        return;
    }

}
