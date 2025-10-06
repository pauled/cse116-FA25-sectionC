package week6;

public class Stack <G>{
    private LLN<G> top;

    public Stack (){
        this.top=null;
    }
    public void push(G value){
        LLN<G> temp=new LLN<>(value,this.top);
        this.top=temp;
    }
    public G pop(){
        G temp=this.top.getValue();
        this.top=this.top.getNext();
        return temp;
    }
    public String toString(){
        return this.top.toString();
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        System.out.println(stack);
    }
}
