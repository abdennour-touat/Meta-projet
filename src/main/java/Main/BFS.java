package Main;

import java.util.Stack;
//***Todo nombre de noeud generé et nbr de noeud develope
public class BFS {
//    private Queue<Node> ouvert = new LinkedList<>();
    private Stack<Node> pile = new Stack<>();
//    private ArrayList<Node> ferme= new ArrayList<Node>();
     private int[] bestSol=new int[Node.n];

     public int[] getBestSol(){
         return this.bestSol;
     }

    public BFS() {}
    public void Recherche( Node G){

        Node d=G , n;

//        ouvert.add(d);
        pile.add(d);

//        while (!ouvert.isEmpty()){
            while (!pile.isEmpty()){

//            n=ouvert.poll( );
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

//                for (Node enfant : n.getNoeudEnfants()) {

//                    ouvert.addAll(n.getNoeudEnfants());
                pile.addAll(n.getNoeudEnfants());

//                }
            }
        }
    }
}
