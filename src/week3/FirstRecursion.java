package week3;

public class FirstRecursion {
    public static int add(int a,int b){
        if (b==0){
            return a;
        } else if (b<0) {
            int temp= add(a-1,b+1);
            return temp;
        }else {
            int temp= add(a+1,b-1);
            return temp;
        }
    }
    /*
    write a recursive function that returns teh factorial
    of a given input
    factorial(4) returns 4*3*2*1
     */
    public static int factorial(int num){
        if (num==1){
            return 1;
        } else if(num<1){
            System.out.println("invalid num");
            return -1;
        } else {
            return factorial(num-1)*num;
        }
    }
    public static int fib(int num){
        if(num==0){
            return 0;
        } else if (num==1){
            return 1;
        } else {
            return fib(num-1)+fib(num-2);
        }
    }
    public static int fib2(int num){
        if(num==0){
            return 0;
        } else if (num==1) {
            return 1;
        }
        int twoBack=0;
        int oneBack=1;
        int current=-1;
        for (int x=2;x<num+1;x++){
            current=twoBack+oneBack;
            twoBack=oneBack;
            oneBack=current;
        }
        return current;
    }

    public static void main(String[] args) {
        int temp=add(4,3);
        System.out.println(temp);
    }
}
