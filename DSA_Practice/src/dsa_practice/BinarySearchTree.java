
package dsa_practice;

class Node{
    Node left,right;
    char key;
    Node(char key){
        this.key=key;
    }
}
class TreeExecusion{
    Node root;
    void insertkey(char key){
        root=insertTree(root,key);
    }
  Node insertTree(Node root,char key){
      if(root==null){
          root=new Node(key);
          return root;
      }
      if(key<root.key){
          root.left=insertTree(root.left,key);
      }
      else if(key>root.key){
          root.right=insertTree(root.right,key);
      }
      return root;
     }
     void preordertraversal(Node root){
         if(root!=null){
             System.out.print(root.key+" ");
             preordertraversal(root.left);
             preordertraversal(root.right);
         }
     }
  }

public class BinarySearchTree {
    public static void main(String args[]){
        TreeExecusion t1=new TreeExecusion();
        t1.insertkey('A');
        t1.insertkey('B');
        t1.insertkey('C');
        t1.insertkey('P');
        t1.insertkey('Q');
        t1.insertkey('Z');
        t1.preordertraversal(t1.root);
        
        
    }
}
