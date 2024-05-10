
package dsa_practice;


class Node{
        char key;
        Node left,right;
        Node(char key){
            this.key=key;
        }
    }
class TreeExecusion{
    Node root;
    void preordertraversal(Node n){
        if(n!=null){
            System.out.print(n.key+" ");
            preordertraversal(n.left);
            preordertraversal(n.right);
            
        }
}
     void postordertraversal(Node n){
        if(n!=null){
            
            postordertraversal(n.left);
            postordertraversal(n.right);
            System.out.print(n.key+" ");
        }
} 
  void Inordertraversal(Node n){
        if(n!=null){
            
            Inordertraversal(n.left);
             System.out.print(n.key+" ");
            Inordertraversal(n.right);
           
        }
} 
}
public class BinaryTreeExecusion {
    public static void main(String args[]){
    TreeExecusion t1=new TreeExecusion();
    t1.root=new Node('A');
    t1.root.left=new Node('B');
    t1.root.right=new Node('C');
    t1.root.left.left=new Node('D');
    t1.root.left.right=new Node('E');
    t1.Inordertraversal(t1.root);
    System.out.println();
    t1.postordertraversal(t1.root);
    System.out.println();
    t1.preordertraversal(t1.root);
    
    
} 
}
