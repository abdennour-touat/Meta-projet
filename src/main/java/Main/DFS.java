package Main;

import Main.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//***Todo nombre de noeud generé et nbr de noeud develope
public class DFS {
        private Stack<Node> pile = new Stack<>();
//    private ArrayList<Node> ferme= new ArrayList<Node>();
    private int[] bestSol=new int[Node.n];

    public int[] getBestSol(){
        return this.bestSol;
    }

    public DFS() {}
    public void Recherche( Node G){

        Node d=G , n;

        pile.add(d);

            while (!pile.isEmpty()){

                n=pile.pop();
//            ferme.add(n);
            if(n.verification())
            {

                Node k = new Node(bestSol);
                if (n.evaluation() < k.evaluation()) {
                    bestSol=n.getEtat()  ;
                }
            }

            if (n.successeurs()) {


                pile.addAll(n.getNoeudEnfants());

            }
        }
    }
}
