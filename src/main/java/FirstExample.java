package FirstExample;


import java.util.Scanner;

import Champion.Champion;
import Requete.Requete;

public class FirstExample {


    public static void main(String[] args) throws Exception {
        Champion c = new Champion();
        int choix ;

        Requete r = new Requete();


        do{
            System.out.println("\n\n---MENU---");
            System.out.println("1. Quitter");
            System.out.println("2. Champion");

            choix = new Scanner(System.in).nextInt();

            switch(choix){
                case 1:
                    System.out.println(c);
                    break;
                case 2:
                    r.StatsRyze();
                    System.out.println("\n");
                    System.out.println(r);


            }
        } while(choix != 0);
        r.fermerConnexion();


    }

}//end FirstExample