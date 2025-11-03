package week10;

public class BTN <T>{
    public T value;
    public BTN<T> left;
    public BTN<T> right;

    public BTN(T value,BTN left,BTN right){
        this.value=value;
        this.left=left;
        this.right=right;
    }
    public String inOrderTraversal(BTN node){
        if (node==null){
            return "";
        } else {
            String out="";
            out+=inOrderTraversal(node.left);
            out+=node.value.toString()+" ";
            out+=inOrderTraversal(node.right);
            return out;
        }
    }
    public String preOrderTraversal(BTN node){
        if (node==null){
            return "";
        } else {
            String out="";
            out+=node.value.toString()+" ";
            if (node.left!=null) {
                out += preOrderTraversal(node.left);
            }
            if (node.right!=null)
                out+=preOrderTraversal(node.right);
            return out;
        }
    }
    public String postOrderTraversal(BTN node){
        if (node==null){
            return "";
        } else {
            String out="";
            out+=postOrderTraversal(node.left);
            out+=postOrderTraversal(node.right);
            out+=node.value.toString()+" ";
            return out;
        }
    }

    public static void main(String[] args) {
        BTN<Integer> root=new BTN<>(5,null,null);
        root.left=new BTN<>(2,null,null);
        root.right=new BTN<>(8,null,null);
        //root.left.left=new BTN<>(-3,null,null);
        root.left.right=new BTN<>(4,null,null);
        //root.right.left=new BTN<>(7,null,null);
        //root.right.right=new BTN<>(14,null,null);

        //System.out.println(root.inOrderTraversal(root));
        System.out.println(root.preOrderTraversal(root));
        System.out.println(root.postOrderTraversal(root));
    }
}
