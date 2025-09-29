package week6;

public class LLNint {
    private int value;
    private LLNint next;

    public LLNint(int value,LLNint next){
        this.next=next;
        this.value=value;
    }

    public int getValue() {
        return this.value;
    }

    public LLNint getNext() {
        return this.next;
    }
    public String toString(){
        if (this.next==null){
            return ""+this.value;
        }
        String temp=this.next.toString();
        return this.value+" "+temp;
    }

    public static void main(String[] args) {
        LLNint first=new LLNint(1,null);
        first=new LLNint(2,first);
        first=new LLNint(3,first);
        String toPrint=first.toString();
        System.out.println(toPrint);
    }
}
