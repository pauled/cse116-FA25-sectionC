package week6;

public class LLN<T> {
    private T value;
    private LLN next;

    public LLN(T value, LLN next){
        this.next=next;
        this.value=value;
    }

    public T getValue() {
        return this.value;
    }

    public LLN getNext() {
        return this.next;
    }
    public String toString(){
        if (this.next==null){
            return ""+this.value;
        }
        String temp=this.next.toString();
        return this.value+" "+temp;
    }
    public int size(){
        if (this.next==null){
            return 1;
        }
        int temp=this.next.size();
        return 1+temp;
    }
    public void append(LLN end){
        if (this.next==null){
            this.next=end;
        } else {
            this.next.append(end);
        }
    }
    public void setNext(LLN next){
        this.next=next;
    }
    public boolean insert(LLN val,int loc){
        if (this.next==null && loc>0){
            return false;
        } else if (loc==0){
            val.setNext(this.next);
            this.next=val;
            return true;
        } else {
            return this.next.insert(val,loc-1);
        }
    }
    /*
    1) method size that returns the number of elements
    int the linked list
    2) method append which adds a value to the end of
    the linked list
    3) method find which returns the location of a value
    that is searched for or -1 if not present
    4) method insert that takes a value and a location
    and inserts the value in that location
     */

    public static void main(String[] args) {
        LLN<Integer> first=new LLN(1,null);
        first=new LLN(2,first);
        first=new LLN(3,first);
        String toPrint=first.toString();
        System.out.println(toPrint);
        System.out.println(first.size());
    }
}

