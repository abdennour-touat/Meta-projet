package TP.TP4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Patitionnement patitionnement = new Patitionnement();
        patitionnement.generation(3000);
       /*

        patitionnement.SoluAleatoire();
        System.out.println(Arrays.toString(patitionnement.getS()));

        System.out.println(patitionnement.verification(patitionnement.getS())?  "La solution est valide et son evaluation est de "+
                patitionnement.evaluation(patitionnement.getS()) : "la solution n es t pas valide");
*/
//        Noeud.T=patitionnement.T;
//        System.out.println(Arrays.toString(patitionnement.T));
//        DFS dfs=new DFS();
//        dfs.Recherche(new Noeud(new ArrayList<Integer>(),null));
//        Noeud r = new Noeud(dfs.BestSol,null);
//        System.out.print(dfs.BestSol.toString()+" "+ r.evaluation());
        //*
//        31, 10, 20, 19,  4,  3,  6
//        25, 35, 45,  5, 25,  3,  2,  2
//        3, 4, 3, 1, 3, 2, 3, 2, 1
//        2, 10, 3, 8, 5, 7, 9, 5, 3, 2
//        484, 114, 205, 288, 506, 503, 201, 127, 410
//        23, 31,  29,  44,  53,  38,  63, 85, 89, 82
//        771, 121, 281, 854, 885, 734,  486, 1003, 83, 62
//        70, 73, 77, 80, 82, 87, 90, 94, 98, 106, 110, 113, 115, 118, 120
//        382745, 799601, 909247, 729069, 467902,  44328,  34610, 698150, 823460, 903959, 853665, 551830, 610856, 670702, 488960, 951111, 323046, 446298, 931161,  31385, 496951, 264724, 224916, 169684
        // *//
        var n = new Noeud(new ArrayList<Integer>(Arrays.asList(382745, 799601, 909247, 729069, 467902, 44328, 34610, 698150, 823460, 903959, 853665, 551830, 610856, 670702, 488960, 951111, 323046, 446298, 931161, 31385, 496951, 264724, 224916, 169684)), null);
//        var n = new Noeud(new ArrayList<Integer>(Arrays.asList(70, 73, 77, 80, 82, 87, 90, 94, 98, 106, 110, 113, 115, 118, 120)), null);
        Noeud.T = n.getEtat().stream().mapToInt(i -> i).toArray();
//        Noeud.T = patitionnement.T;

//        Noeud n = new Noeud(patitionnement.newArray(), null);

        System.out.println(Arrays.toString(Noeud.T));
        System.out.println(n.getEtat().size());
        var sols = GA.genRandomPop(1000, n.getEtat().size());
        //print the sols
        GA.search(sols, 1000, 50000, 0.8, 0.5);
    }
}
