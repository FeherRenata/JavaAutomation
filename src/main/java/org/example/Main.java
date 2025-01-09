package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }*/
       // citireNote();
        printareValoriWhile();
        //printareValoariDoWhile();
        //printareValoariFor();
    }

    public static void citireNote() {
        System.out.println("Introduceti nota: ");
        Scanner scenner = new Scanner(System.in);
        int nota = scenner.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Nota " + nota + " trebuie sa fie intre 1 si 10. Te rog introdu o valoare valida");
            nota = scenner.nextInt();
        }
        System.out.println("Nota " + nota + " este intre 1 si 10");

    }

    public static void printareValoriWhile(){
        int valoare = 1;
        while(valoare<=5){
            System.out.println("Valoarea este: " + valoare);
            valoare ++;
            System.out.println("Valoarea dupa incrementare este: " + valoare);
        }
        System.out.println("Valoarea dupa parcurgerea de while este: " + valoare);

    }

    public static void printareValoariDoWhile(){
        int valoare = 6;
        do{
            System.out.println("Valoarea este: " + valoare);
            valoare++;
        }while (valoare<=5);
        System.out.println("Valoarea dupa parcurgerea de do-while este: " + valoare);
    }

    public static void printareValoariFor(){
        //int valoare;
                for(int valoare = 1;valoare<=5; valoare++){
                    System.out.println("Valoarea este " + valoare);
                    //valoare++;
                }
    }
}