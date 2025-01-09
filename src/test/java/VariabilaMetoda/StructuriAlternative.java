package VariabilaMetoda;

import org.testng.annotations.Test;


public class StructuriAlternative {

    // Structuri alternative =  if-then-else; switch-case

    @Test
    public void methodaTest() {
        metodaVerificareNumar(6);
        metodaVerificareNumar(2);
        metodaVerificareNumar(5);
        metodaVerificareNumarPar(0);


        metodaVerificareNumarPar(4);
        metodaVerificareNumarPar(3);
        metodaVerificareNumarPar(-1);
        metodaVerificareNumarPar(-8);

        zileSaptamana(3);

    }

    //verificam un numar mai mare decat 5
    public void metodaVerificareNumar(int valoare) {

        if (valoare > 5) {
            System.out.println("Numarul " + valoare + " este mai mare decat 5");
        } else if (valoare < 5) {
            System.out.println("Numarul " + valoare + " este mai mic decat 5");
        } else {
            System.out.println("Numarul " + valoare + " este egal 5");
        }

    }

    // verificam daca un numar este un par pozitiv sa un par negativ
    public void metodaVerificareNumarPar(int valoare) {


        if (valoare > 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul " + valoare + " este par pozitiv");
            } else {
                System.out.println("Numarul " + valoare + " este impar pozitiv");
            }
        } else if (valoare < 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul " + valoare + " este par negativ");
            } else {
                System.out.println("Numarul " + valoare + " este impar negativ");
            }
        } else if (valoare == 0) {
            System.out.println("Numarule este " + valoare);
        }
    }

    // exemplu switch case
    public void zileSaptamana(Integer zi) {
        switch (zi) {
            case 1:
                System.out.println("Azi este Luni");
                break;
            case 2:
                System.out.println("Azi este Marti");
                break;
            case 3:
                System.out.println("Azi este Miercuri");
                break;
            case 4:
                System.out.println("Azi este Joi");
                break;
            case 5:
                System.out.println("Azi este Vineri");
                break;
            default:
                System.out.println("Nu mai sunt zile");

        }
    }


}

