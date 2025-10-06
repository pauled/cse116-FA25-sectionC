package week6;

public class Queue <T>{
    private LLN<T> front;
    private LLN<T> back;

    public Queue(){
        this.front=null;
        this.back=null;
    }

    public void enqueue(T value){
        if (this.front==null){
            this.front=new LLN<>(value,null);
            this.back=this.front;
        } else {
            LLN<T> temp=new LLN<>(value,null);
            this.back.setNext(temp);
            this.back=temp;
        }
    }
    public T dequeue(){
        if (this.front==null){
            return null;
        }
        T toReturn=this.front.getValue();
        this.front=this.front.getNext();
        if (this.front==null){
            this.back=null;
        }
        return toReturn;
    }
    public String toString(){
        return this.front.toString();
    }

    public static void main(String[] args) {
        Queue<Integer> queue=new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
    }
}

