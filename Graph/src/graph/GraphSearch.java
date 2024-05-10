
package graph;

import java.util.ArrayList;
import java.util.Iterator;

public class GraphSearch {
    int v;
    ArrayList<Integer> adj[];
    GraphSearch(int noofvertex) {
        v=noofvertex; 
        adj=new ArrayList[noofvertex];
        for(int i=0;i<noofvertex;i++) {
            adj[i]=new ArrayList<>(); 
        }  
    }
    void edge(int x,int y) {
        adj[x].add(y);
    }
     void breadthfirstsearch(int sourcevertex){
         boolean[] visited=new boolean[v];
         ArrayList<Integer> a1=new ArrayList<>();
         visited[sourcevertex]=true;
         a1.add(sourcevertex);
         while(!a1.isEmpty()) {
             sourcevertex=a1.remove(0);
             System.out.print(sourcevertex+" ");
             Iterator it=adj[sourcevertex].iterator();
             while(it.hasNext()) {
                 int n=(int)it.next();
                 if(!visited[n]){
                     visited[n]=true;
                     a1.add(n);
                     
                 }
                     
             }
         }
     }
     public static void main(String args[]){
         GraphSearch g1=new GraphSearch(20);
         g1.edge(0, 1);
         g1.edge(0, 2);
         g1.edge(0, 5);
         g1.edge(1, 0);
         g1.edge(1, 2);
         g1.edge(2, 0);
         g1.edge(2, 1);
         g1.edge(2, 4);
         g1.edge(2, 3);
         g1.edge(3, 2);
         g1.edge(4, 2);
         g1.edge(4, 5);
         g1.edge(5, 0);
         g1.edge(5, 4);
         g1.breadthfirstsearch(0);
     }
}
