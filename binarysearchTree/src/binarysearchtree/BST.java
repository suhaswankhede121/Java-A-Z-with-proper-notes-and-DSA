
package binarysearchtree;

class Node
{
   Node left,right;
   char key;
   Node(char key)
   {
       this.key=key;
   }
}
class binarySolution
{
    Node root;
    void insertkey(char key)
    {
        root=insertTree(root,key);
    }
    Node insertTree(Node root,char key)
    {
        if(root==null)
        {
            root=new Node(key);
            return root;
        }
        if(key<root.key)
        {
            root.left=insertTree(root.left,key);
        }
        else if(key>root.key)
        {
            root.right=insertTree(root.right,key);
        }
        return root;
    }
    void preorderbinarytree(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.key+" ");
            preorderbinarytree(root.left);
            preorderbinarytree(root.right);
        }
    }
}

public class BST {
    public static void main(String args[]){
            binarySolution t1=new binarySolution();
            t1.insertkey('C');
            t1.insertkey('I');
            t1.insertkey('G');
            t1.insertkey('B');
            t1.insertkey('M');
            t1.insertkey('A');
            
            t1.preorderbinarytree(t1.root);
            
}
}
