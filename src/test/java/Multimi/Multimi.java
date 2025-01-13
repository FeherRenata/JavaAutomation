package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {

    // Multimi: array, list, map

    @Test
    public void metodaTest(){

        colegiCurs();
        colegiCursLista();
        categoriiObiecte();
        tariOrase();
    }

    //Exemplu Array
    public void colegiCurs(){
        String[]  colegi = new String[6];
        colegi[0] = "Renata";
        colegi[1] ="Ana-Maria";
        colegi[2] ="Cristina";
        colegi[3] ="Mihai";
        colegi[4] ="Ion";
        colegi[5] ="Ionut";

        for(int index=0; index<colegi.length; index++) {
            System.out.println("Numele colegului este: " + colegi[index]);
        }
    }

    // Exemplu Lista
    public void  colegiCursLista(){
        List<String> colegi = new ArrayList<>();
        colegi.add("Ana-Maria");
        colegi.add("Maria");
        colegi.add("Ana");
        colegi.add("Anca");
        colegi.add("Andrei");

        int index=0;
        while(index<colegi.size()){
            System.out.println("Numele colegului este: " + colegi.get(index));
            index++;
        }
    }

    // Exemplu map
    // map -> cheie = valoare
    public void categoriiObiecte(){
        HashMap <String,String> obiecte = new HashMap<>();
        obiecte.put("obiect", "laptop");
        obiecte.put("fruct", "mar");
        obiecte.put("floare", "trandafir");

        for(String key: obiecte.keySet()){
            System.out.println("Cheia este: " + key);
            System.out.println("Valoarea este: " + obiecte.get(key));
        }
    }

    public void tariOrase(){
        HashMap<String,List<String>> clasificare = new HashMap<>();
        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Cluj-Napoca");
        oraseRomania.add("Oradea");
        oraseRomania.add("Bucuresti");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Milano");
        oraseItalia.add("Florenta");
        oraseItalia.add("Napoli");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Madrid");
        oraseSpania.add("Malaga");

        clasificare.put("Romania", oraseRomania);
        clasificare.put("Italia", oraseItalia);
        clasificare.put("Spania", oraseSpania);

        for(String key: clasificare.keySet()){
            System.out.println("Tara este: " + key);
            System.out.println("Orasele sunt: " + clasificare.get(key));
        }
    }


}
