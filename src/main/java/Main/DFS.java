package Main;

import java.util.Stack;

public class DFS {
        private Stack<Node> pile = new Stack<>();

public  int nbrNdev=0,nbrNgen =1;
    int sizeInitial;

    public DFS() {}
    public int [] Recherche( Node G){

        Node d=G , n;

        pile.add(d);

            while (!pile.isEmpty()){
                nbrNdev++;
                n=pile.pop();

                if(n.verification() && n.evaluation()){ return n.getEtat();}

            if (n.successeurs()) {

                sizeInitial =pile.size();
               // pile.addAll(n.getNoeudEnfants());
                for(int i=0;i<n.getNoeudEnfants().size();i++) {pile.push(n.getNoeudEnfants().get(n.getNoeudEnfants().size()-i-1));}
                nbrNgen+=(pile.size() - sizeInitial);
            }
        }
return null;
    }
}
