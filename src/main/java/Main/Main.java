package Main;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //subset problem.
        System.out.println("hello");
        //model the problem
        //  instantiate the problem
        // verification algorithm
        //

        BFS bfs = new BFS();
        Node.n =12;
        bfs.Recherche(new Node(new ArrayList<Integer>(),null));


        Node a =new Node(bfs.getBestSol(),null);
        System.out.println(bfs.getBestSol().toString()+" evaluation : "+a.evaluation());

    }
}
