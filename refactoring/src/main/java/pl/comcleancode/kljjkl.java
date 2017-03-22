package pl.comcleancode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Klasa licząca pensje pracowników
 */
public class kljjkl {

    /**
     * Produkuje tablicę z pracownikami
     * @return Tablica pracowników
     */
    public List<String[]> tablica() {
        List<String[]> pracownicy;
        pracownicy = new LinkedList<>();
        pracownicy.add(new String[]{"Marek", "2301", "M"});
        pracownicy.add(new String[]{"Grazyna", "1703", "K"});
        pracownicy.add(new String[]{"John", "12330", "m"});
        pracownicy.add(new String[]{"Helena", "300", "k"});
        return pracownicy;
    }

    /**
     * Pobiera średnią pensję dla pracownika
     * @param b Boolean, który określa czy mężczyzna czy kobieta
     * @param t lista, z której chcesz pobrać pensje
     * @return średnia pensja
     */
    public Integer pobsrpen(boolean b, List<String[]> t) {
        int sum = 0;
        int il = 0;
        // jeśli to mężczyźni
        if(b == Boolean.TRUE) {
            for (String[] strings : t) {
                if (strings[2].equals("M") || strings[2].equals("m")) {
                    sum += Integer.parseInt(strings[1]);
                    il++;
                }
            }
        }
        // jeśli to kobiety
        if(b == Boolean.FALSE) {
            for (String[] strings : t) {
                if (strings[2].equals("K") || strings[2].equals("k")) {
                    sum += Integer.parseInt(strings[1]);
                    il++;
                }
            }
        }
        // patrzymy czy nie jest to nullem
        if (il == 0) return null;

        int srednio = sum/il;
        return srednio;
    }

    public static void main(String[] args) {

        try {
        kljjkl sth = new kljjkl();
        System.out.println("Srednia pensja dla mezczyzn to: ");
        Integer pobsrpen = sth.pobsrpen(true, sth.tablica());
        if(pobsrpen!=null) {
            System.out.println(pobsrpen);
        }
        System.out.println("A dla kobiet to: ");
        Integer pobsrpen1 = sth.pobsrpen(false, sth.tablica());
        if(pobsrpen1!=null) {
            System.out.println(pobsrpen1);
        }

        //Zapiszmy do pliku
            File file = new File("something.txt");
            FileWriter fw = new FileWriter(file);
            // jeśli średnia dla mężczyzn jest większa zapisujemy do pliku
            if(pobsrpen>pobsrpen1){
                fw.write(pobsrpen.toString());}
                // a jak nie to kobiety
            if(pobsrpen1>pobsrpen){
                fw.write(pobsrpen1.toString());
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
