package Esercizio2;

import java.util.*;

public class Main2 {
    public static void main (String[]args) {
        System.out.println("Inserisci il numero di interi desiderato");
        Scanner input = new Scanner(System.in);

        int numberOfElements = Integer.parseInt(input.nextLine());
        List<Integer> randomIntegers =giveMeOrdererRandomList(numberOfElements);
        System.out.println("Ecco una lista ordinata di"+numberOfElements+"interi:"+randomIntegers.toString());
        List<Integer> upAndDown = montagnaRussa(randomIntegers);
        System.out.println("Ecco la lista che sale e scende"+ upAndDown);
        System.out.println("Premi 1 per gli elementi dipari");
        System.out.println("Premi 2 per gli elementi pari");
        int bool;
        try {
            bool = Integer.parseInt(input.nextLine());
            while (bool != 1 && bool != 2) {
                System.err.println("Metti o 1 o 2");
                bool=Integer.parseInt(input.nextLine());
            }
        } catch (NumberFormatException ex) {
            System.err.println("Inserisci un numero");
        }
    }
   private static List giveMeOrdererRandomList(int n){
        List<Integer> randomIntegers = new ArrayList<>();
        for(int i=0;i<n;i++){
            Random rndm = new Random();
            randomIntegers.add(rndm.nextInt(9));
        }
       Collections.sort(randomIntegers);
       return randomIntegers;
    }
    private static List montagnaRussa(List<Integer>List){
        List rollerCoasterList = new ArrayList<>();
        Collections.sort(List);
        rollerCoasterList.addAll(List);
        Collections.sort(List, Collections.reverseOrder());
        rollerCoasterList.addAll(List);
        return rollerCoasterList;

    }
    
}

