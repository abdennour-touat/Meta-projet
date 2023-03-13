package Main;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {


        DFS bfs = new DFS();

        Node.n =30;

        long start = System.nanoTime();
        var result =bfs.Recherche(new Node(new int[0]));
        long end = System.nanoTime();
        System.out.println("time is : " + TimeUnit.MILLISECONDS.convert(end -start, TimeUnit.NANOSECONDS)/1000);

        System.out.println(result);
        Node a =new Node(result);


        System.out.println(Arrays.toString(result) +" evaluation : "+a.evaluation());
        System.out.println(Arrays.toString(result) +" evaluation 2 : "+a.evaluation1());


    }
}
