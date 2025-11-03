package week10;

import week9.Comparator;
import week9.IntDecreasing;

public class BST <A>{
    private BTN<A> root;
    private Comparator<A> comparator;

    public BST(Comparator<A> comparator){
        this.root=null;
        this.comparator=comparator;
    }
    public void insert(A value){
        if (this.root==null){
            this.root=new BTN<>(value,null,null);
        } else {
            insertHelper(this.root,value);
        }
    }
    public void insertHelper(BTN<A> node,A toInsert){
        if (this.comparator.compare(toInsert,node.value)){
            if(node.left==null){
                node.left=new BTN<>(toInsert,null,null);
            } else {
                insertHelper(node.left,toInsert);
            }
        } else {
            if(node.right==null){
                node.right=new BTN<>(toInsert,null,null);
            } else {
                insertHelper(node.right,toInsert);
            }
        }
    }
    public boolean find(A value){
        if (this.root==null){
            return false;
        } else {
            return findHelper(this.root,value);
        }
    }
    public boolean findHelper(BTN<A> node,A toFind){
        if (node.value.equals(toFind)){
            return true;
        } else {
            if (this.comparator.compare(toFind,node.value)){
                if (node.left==null){
                    return false;
                } else {
                    return findHelper(node.left,toFind);
                }
            } else {
                if(node.right==null){
                    return false;
                } else {
                    return findHelper(node.right,toFind);
                }
            }
        }
    }

    public static void main(String[] args) {
        BST<Integer> bst=new BST<>(new IntDecreasing());

        bst.insert(2);
        bst.insert(5);
        bst.insert(-10);
        bst.insert(4);
        bst.insert(20);
        bst.insert(0);
        bst.insert(2);

        System.out.println(bst.find(4));
        System.out.println(bst.find(2));
        System.out.println(bst.find(7));

        System.out.println(bst.root.inOrderTraversal(bst.root));
    }
}
