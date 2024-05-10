
package dsa_practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

class GraphSearch{
    int v;
    ArrayList<Integer> adj[];
    GraphSearch(int vertex){
        v=vertex;
        adj=new ArrayList[vertex]; //referance passed for arraylist
        for(int i=0;i<vertex;i++){
            adj[i]=new ArrayList<>();
        }
        
    }
    void edges(int x,int y){
        adj[x].add(y);
    }
    void BreadthFirstSearch(int SourceVertex){
        boolean[] visited=new boolean[v];
        ArrayList<Integer> a1=new ArrayList<>();
        visited[SourceVertex]=true;
        a1.add(SourceVertex);
        while(!a1.isEmpty()){
            SourceVertex=a1.remove(0);
            System.out.print(SourceVertex+" ");
            Iterator it=adj[SourceVertex].iterator();
            while(it.hasNext()){
                int n=(int)it.next();
                if(!visited[n]){
                    visited[n]=true;
                    a1.add(n);
                }
            }
        }
    }
    void DepthFirstSearch(int SourceVertex){
        boolean[] visited=new boolean[v];
        Stack<Integer> s1=new Stack<>();
        s1.push(SourceVertex);
        int Node;
        while(!s1.isEmpty()){
            
            SourceVertex=s1.peek();
            s1.pop();
            for(int i=0;i<adj[SourceVertex].size();i++){
                 Node=adj[SourceVertex].get(i);
                if(!visited[Node]){
                    s1.push(Node);
                }
            }
        
        if(visited[SourceVertex]==false){
            System.out.print(SourceVertex+" ");
            visited[SourceVertex]=true;
        }
        }
    }
}
public class GraphExecusion {
    public static void main(String args[]){
        GraphSearch g1=new GraphSearch(6);
        g1.edges(0, 1);
        g1.edges(0, 2);
        g1.edges(0, 5);
        g1.edges(1, 0);
        g1.edges(1, 2);
        g1.edges(2, 0);
        g1.edges(2, 1);
        g1.edges(2, 4);
        g1.edges(2, 3);
        g1.edges(3, 2);
        g1.edges(4, 2);
        g1.edges(4, 5);
        g1.edges(5, 4);
        g1.edges(5, 0);
        
        g1.DepthFirstSearch(0);
        System.out.println();
        g1.BreadthFirstSearch(0);
    }
}
