package Tree;
import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


class Node{
    char data;
    Node left; // left jisko point krega vo bhi node hoga
    Node right;
    Node(char data){
        this.data=data;
        this.left=null; // by default be null rhete h dono
        this.right=null;
    }
}
public class tree {
    public static void main(String[] args) {
        //0 level
        Node root = new Node('A');
        //1 level
        root.left=new Node('B');
        root.right=new Node('C');
        //2level
        root.left.left=new Node('D');
        root.left.right=new Node('E');
        root.right.left=new Node('G');
        root.right.right=new Node('H');
        //3level
        root.left.right.left=new Node('I');
        root.left.right.right=new Node('I');
        root.right.left.left=new Node('K');

        preNode(root);
        levelOrder(root);
    }
    public static void preNode(Node root) {
        if (root == null) return;
        System.out.println(root.data);
        preNode(root.left);
        preNode(root.right);
    }
    public static void levelOrder(Node root){
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node ele=q.poll();
            System.out.println(ele.data);
            if(ele.left!=null) q.offer(ele.left);
            if(ele.right!=null) q.offer(ele.right);
        }
    }
    public static ArrayList<Character> rightView(Node root){
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        ArrayList<Character> rightView= new ArrayList<>();
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node ele=q.poll();
                if(i==size-1) rightView.add(ele.data);
            }
        }
        return rightView;
    }
}