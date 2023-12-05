package Esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Logger log= LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        log.info("Inserisci un numero N di elementi");
        Scanner input = new Scanner(System.in);
        int numberofElements = Integer.parseInt(input.nextLine());
        String[]myArray = new String[numberofElements];
        Set<String> setDiParoleDuplicate = new HashSet<>();
        for(int i=0; i< myArray.length;i++){
            log.info("Inserisci la parola numero"+i);
            String currentWord = input. nextLine();
            myArray[i]=currentWord;
            for( int j=0; j<i; j++){
                if (myArray[j].equals(currentWord)) setDiParoleDuplicate.add(currentWord);
            }

        }
        log.info ("Le parole sono:"+Arrays.toString(myArray));
        Set<String> setDiParole = new HashSet<>();
       for(int i=0; i< myArray.length; i++){
           setDiParole.addAll(Arrays.asList(myArray));
       }
       log.info("Numero di parole distinte: "+String.valueOf(setDiParole.size()));
        log.info("Elenco parole distine:"+ setDiParole.toString());
        log.info("Parole duplicate:"+setDiParoleDuplicate.toString());

    }
}